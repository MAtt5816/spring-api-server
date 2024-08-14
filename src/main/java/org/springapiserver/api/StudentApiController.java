package org.springapiserver.api;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springapiserver.converter.StudentConverter;
import org.springapiserver.dao.StudentDao;
import org.springapiserver.dto.StudentDto;
import org.springapiserver.model.ErrorMessage;
import org.springapiserver.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import jakarta.servlet.http.HttpServletRequest;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")
@RestController
public class StudentApiController implements StudentApi {
    @Autowired
    private StudentDao studentDao;

    private static final Logger log = LoggerFactory.getLogger(StudentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    @Autowired
    private StudentConverter studentConverter;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<StudentDto>> studentGet(@Min(1) @Parameter(in = ParameterIn.QUERY, description = "Number of students to return.", schema = @Schema(allowableValues = {"1"}, minimum = "1"
            , defaultValue = "1")) @Valid @RequestParam(value = "results", required = false, defaultValue = "1") Integer results
    ) {
        if (results >= 1) {
            Page<Student> students = studentDao.findAll(PageRequest.of(0, results));
            List<StudentDto> studentList = students.getContent().stream().map(studentConverter::convert).collect(Collectors.toList());
            return ResponseEntity.ok().body(studentList);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Validated
    public ResponseEntity<List<StudentDto>> studentPost(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new students", required = true, schema = @Schema()) @RequestBody List<Student> body,
                                                        BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {

            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }

        if (body.stream().anyMatch(s -> s.getId() != null)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            int lastId = studentDao.getLastStudentId();

            for (Student student : body) {
                long id = ++lastId;
                student.setId(id);
                student.getLocation().setStudentId(id);
                student.getPicture().setStudentId(id);

                Date date = new Date();
                OffsetDateTime offsetDateTime = date.toInstant().atOffset(ZoneOffset.UTC);
                student.setRegistered(offsetDateTime);
            }

            List<Student> students = studentDao.saveAll(body);
            List<StudentDto> dtoList = students.stream().map(studentConverter::convert).collect(Collectors.toList());
            return new ResponseEntity<>(dtoList, HttpStatus.CREATED);
        }
    }

    public ResponseEntity<Void> studentStudentIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the student to delete", required = true, schema = @Schema()) @PathVariable("studentId") Integer studentId
    ) {
        var student = studentDao.findById(studentId);

        if (student.isPresent()) {
            studentDao.delete(student.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Validated
    public ResponseEntity<StudentDto> studentStudentIdPatch(@Parameter(in = ParameterIn.PATH, description = "ID of the student to update", required = true, schema = @Schema()) @PathVariable("studentId") Integer studentId
            , @Parameter(in = ParameterIn.DEFAULT, description = "Update existing student", required = true, schema = @Schema()) @RequestBody Student body, BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }

        var student = studentDao.findById(studentId);

        if (student.isPresent()) {
            Student stud = student.get();
            stud.fillPartial(body);
            var result = studentDao.save(stud);
            StudentDto studentDto = studentConverter.convert(result);
            return new ResponseEntity<>(studentDto, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Validated
    public ResponseEntity<StudentDto> studentStudentIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the student to update", required = true, schema = @Schema()) @PathVariable("studentId") Integer studentId
            , @Parameter(in = ParameterIn.DEFAULT, description = "Update existing student", required = true, schema = @Schema()) @RequestBody Student body,
                                                          BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }

        var student = studentDao.findById(studentId);

        if (student.isPresent()) {
            body.setId(student.get().getId());
            body.setRegistered(student.get().getRegistered());
            body.getLocation().setStudentId(body.getId());
            body.getPicture().setStudentId(body.getId());
            var result = studentDao.save(body);
            StudentDto studentDto = studentConverter.convert(result);
            return new ResponseEntity<>(studentDto, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @ExceptionHandler(value = {ConstraintViolationException.class}) //dla @Validated
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<ErrorMessage> constraintViolationException(ConstraintViolationException ex) {
        Set<ConstraintViolation<?>> violations = ex.getConstraintViolations();
        List<ErrorMessage> errors = new ArrayList();
        for (ConstraintViolation<?> v : violations) {
            ErrorMessage error = new ErrorMessage();
            error.setField(v.getPropertyPath().toString());
            error.setMessage(v.getMessage());
            errors.add(error);
        }
        return errors;
    }
}
