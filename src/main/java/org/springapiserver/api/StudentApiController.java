package org.springapiserver.api;

import org.springapiserver.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")
@RestController
public class StudentApiController implements StudentApi {

    private static final Logger log = LoggerFactory.getLogger(StudentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Student>> studentGet(@Min(1)@Parameter(in = ParameterIn.QUERY, description = "Number of students to return." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="1")) @Valid @RequestParam(value = "results", required = false, defaultValue="1") Integer results
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Student>>(objectMapper.readValue("[ {\n  \"nat\" : \"AU\",\n  \"gender\" : \"female\",\n  \"last_name\" : \"Lucas\",\n  \"registered\" : \"2014-07-23T03:21:42.259Z\",\n  \"title\" : \"Miss\",\n  \"id_name\" : \"TFN\",\n  \"picture\" : {\n    \"thumbnail\" : \"https://randomuser.me/api/portraits/thumb/men/75.jpg\",\n    \"large\" : \"https://randomuser.me/api/portraits/men/75.jpg\",\n    \"medium\" : \"https://randomuser.me/api/portraits/med/men/75.jpg\"\n  },\n  \"phone\" : \"03-2662-3559\",\n  \"dob\" : \"1964-11-23T00:00:00.000+00:00\",\n  \"location\" : {\n    \"country\" : \"Australia\",\n    \"city\" : \"Tamworth\",\n    \"timezone\" : \"330\",\n    \"street_number\" : 2595,\n    \"postcode\" : \"6066\",\n    \"state\" : \"Queensland\",\n    \"street_name\" : \"Main Street\"\n  },\n  \"id\" : 1,\n  \"first_name\" : \"Terri\",\n  \"email\" : \"terri.lucas@example.com\",\n  \"id_value\" : \"230000682\"\n}, {\n  \"nat\" : \"AU\",\n  \"gender\" : \"female\",\n  \"last_name\" : \"Lucas\",\n  \"registered\" : \"2014-07-23T03:21:42.259Z\",\n  \"title\" : \"Miss\",\n  \"id_name\" : \"TFN\",\n  \"picture\" : {\n    \"thumbnail\" : \"https://randomuser.me/api/portraits/thumb/men/75.jpg\",\n    \"large\" : \"https://randomuser.me/api/portraits/men/75.jpg\",\n    \"medium\" : \"https://randomuser.me/api/portraits/med/men/75.jpg\"\n  },\n  \"phone\" : \"03-2662-3559\",\n  \"dob\" : \"1964-11-23T00:00:00.000+00:00\",\n  \"location\" : {\n    \"country\" : \"Australia\",\n    \"city\" : \"Tamworth\",\n    \"timezone\" : \"330\",\n    \"street_number\" : 2595,\n    \"postcode\" : \"6066\",\n    \"state\" : \"Queensland\",\n    \"street_name\" : \"Main Street\"\n  },\n  \"id\" : 1,\n  \"first_name\" : \"Terri\",\n  \"email\" : \"terri.lucas@example.com\",\n  \"id_value\" : \"230000682\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Student>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Student>> studentPost(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new students", required=true, schema=@Schema()) @Valid @RequestBody List<Student> body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Student>>(objectMapper.readValue("[ {\n  \"nat\" : \"AU\",\n  \"gender\" : \"female\",\n  \"last_name\" : \"Lucas\",\n  \"registered\" : \"2014-07-23T03:21:42.259Z\",\n  \"title\" : \"Miss\",\n  \"id_name\" : \"TFN\",\n  \"picture\" : {\n    \"thumbnail\" : \"https://randomuser.me/api/portraits/thumb/men/75.jpg\",\n    \"large\" : \"https://randomuser.me/api/portraits/men/75.jpg\",\n    \"medium\" : \"https://randomuser.me/api/portraits/med/men/75.jpg\"\n  },\n  \"phone\" : \"03-2662-3559\",\n  \"dob\" : \"1964-11-23T00:00:00.000+00:00\",\n  \"location\" : {\n    \"country\" : \"Australia\",\n    \"city\" : \"Tamworth\",\n    \"timezone\" : \"330\",\n    \"street_number\" : 2595,\n    \"postcode\" : \"6066\",\n    \"state\" : \"Queensland\",\n    \"street_name\" : \"Main Street\"\n  },\n  \"id\" : 1,\n  \"first_name\" : \"Terri\",\n  \"email\" : \"terri.lucas@example.com\",\n  \"id_value\" : \"230000682\"\n}, {\n  \"nat\" : \"AU\",\n  \"gender\" : \"female\",\n  \"last_name\" : \"Lucas\",\n  \"registered\" : \"2014-07-23T03:21:42.259Z\",\n  \"title\" : \"Miss\",\n  \"id_name\" : \"TFN\",\n  \"picture\" : {\n    \"thumbnail\" : \"https://randomuser.me/api/portraits/thumb/men/75.jpg\",\n    \"large\" : \"https://randomuser.me/api/portraits/men/75.jpg\",\n    \"medium\" : \"https://randomuser.me/api/portraits/med/men/75.jpg\"\n  },\n  \"phone\" : \"03-2662-3559\",\n  \"dob\" : \"1964-11-23T00:00:00.000+00:00\",\n  \"location\" : {\n    \"country\" : \"Australia\",\n    \"city\" : \"Tamworth\",\n    \"timezone\" : \"330\",\n    \"street_number\" : 2595,\n    \"postcode\" : \"6066\",\n    \"state\" : \"Queensland\",\n    \"street_name\" : \"Main Street\"\n  },\n  \"id\" : 1,\n  \"first_name\" : \"Terri\",\n  \"email\" : \"terri.lucas@example.com\",\n  \"id_value\" : \"230000682\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Student>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> studentStudentIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the student to delete", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> studentStudentIdPatch(@Parameter(in = ParameterIn.PATH, description = "ID of the student to update", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
,@Parameter(in = ParameterIn.DEFAULT, description = "Update existing student", required=true, schema=@Schema()) @Valid @RequestBody Student body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{\n  \"nat\" : \"AU\",\n  \"gender\" : \"female\",\n  \"last_name\" : \"Lucas\",\n  \"registered\" : \"2014-07-23T03:21:42.259Z\",\n  \"title\" : \"Miss\",\n  \"id_name\" : \"TFN\",\n  \"picture\" : {\n    \"thumbnail\" : \"https://randomuser.me/api/portraits/thumb/men/75.jpg\",\n    \"large\" : \"https://randomuser.me/api/portraits/men/75.jpg\",\n    \"medium\" : \"https://randomuser.me/api/portraits/med/men/75.jpg\"\n  },\n  \"phone\" : \"03-2662-3559\",\n  \"dob\" : \"1964-11-23T00:00:00.000+00:00\",\n  \"location\" : {\n    \"country\" : \"Australia\",\n    \"city\" : \"Tamworth\",\n    \"timezone\" : \"330\",\n    \"street_number\" : 2595,\n    \"postcode\" : \"6066\",\n    \"state\" : \"Queensland\",\n    \"street_name\" : \"Main Street\"\n  },\n  \"id\" : 1,\n  \"first_name\" : \"Terri\",\n  \"email\" : \"terri.lucas@example.com\",\n  \"id_value\" : \"230000682\"\n}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> studentStudentIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the student to update", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
,@Parameter(in = ParameterIn.DEFAULT, description = "Update existing student", required=true, schema=@Schema()) @Valid @RequestBody Student body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{\n  \"nat\" : \"AU\",\n  \"gender\" : \"female\",\n  \"last_name\" : \"Lucas\",\n  \"registered\" : \"2014-07-23T03:21:42.259Z\",\n  \"title\" : \"Miss\",\n  \"id_name\" : \"TFN\",\n  \"picture\" : {\n    \"thumbnail\" : \"https://randomuser.me/api/portraits/thumb/men/75.jpg\",\n    \"large\" : \"https://randomuser.me/api/portraits/men/75.jpg\",\n    \"medium\" : \"https://randomuser.me/api/portraits/med/men/75.jpg\"\n  },\n  \"phone\" : \"03-2662-3559\",\n  \"dob\" : \"1964-11-23T00:00:00.000+00:00\",\n  \"location\" : {\n    \"country\" : \"Australia\",\n    \"city\" : \"Tamworth\",\n    \"timezone\" : \"330\",\n    \"street_number\" : 2595,\n    \"postcode\" : \"6066\",\n    \"state\" : \"Queensland\",\n    \"street_name\" : \"Main Street\"\n  },\n  \"id\" : 1,\n  \"first_name\" : \"Terri\",\n  \"email\" : \"terri.lucas@example.com\",\n  \"id_value\" : \"230000682\"\n}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

}
