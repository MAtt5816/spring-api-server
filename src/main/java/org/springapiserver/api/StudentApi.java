/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.61).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.springapiserver.api;

import org.springapiserver.model.ErrorMessage;
import org.springapiserver.model.Student;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")
@Validated
public interface StudentApi {

    @Operation(summary = "Find first n students", description = "Find and return first n students ordered by its IDs.", security = {
        @SecurityRequirement(name = "student_data_auth")    }, tags={ "student" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Student.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid 'results' parameter value"),
        
        @ApiResponse(responseCode = "401", description = "unauthorized") })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Student>> studentGet(@Min(1)@Parameter(in = ParameterIn.QUERY, description = "Number of students to return." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="1")) @Valid @RequestParam(value = "results", required = false, defaultValue="1") Integer results
);


    @Operation(summary = "Add a new students", description = "Add a new students", security = {
        @SecurityRequirement(name = "student_data_auth")    }, tags={ "student" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created successfully", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Student.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid input"),
        
        @ApiResponse(responseCode = "401", description = "unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Validation exception", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ErrorMessage.class)))) })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<List<Student>> studentPost(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new students", required=true, schema=@Schema()) @Valid @RequestBody List<Student> body
);


    @Operation(summary = "Delete student by ID", description = "Delete student by given ID.", security = {
        @SecurityRequirement(name = "student_data_auth")    }, tags={ "student" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Deleted successfully"),
        
        @ApiResponse(responseCode = "401", description = "unauthorized"),
        
        @ApiResponse(responseCode = "404", description = "Student not found") })
    @RequestMapping(value = "/student/{studentId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> studentStudentIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the student to delete", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
);


    @Operation(summary = "Update some fields of student", description = "Update some fields of student by given student ID.", security = {
        @SecurityRequirement(name = "student_data_auth")    }, tags={ "student" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid input"),
        
        @ApiResponse(responseCode = "401", description = "unauthorized"),
        
        @ApiResponse(responseCode = "404", description = "Student not found"),
        
        @ApiResponse(responseCode = "422", description = "Validation exception", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ErrorMessage.class)))) })
    @RequestMapping(value = "/student/{studentId}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Student> studentStudentIdPatch(@Parameter(in = ParameterIn.PATH, description = "ID of the student to update", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
, @Parameter(in = ParameterIn.DEFAULT, description = "Update existing student", required=true, schema=@Schema()) @Valid @RequestBody Student body
);


    @Operation(summary = "Update student", description = "Update student by given ID.", security = {
        @SecurityRequirement(name = "student_data_auth")    }, tags={ "student" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid input"),
        
        @ApiResponse(responseCode = "401", description = "unauthorized"),
        
        @ApiResponse(responseCode = "404", description = "Student not found"),
        
        @ApiResponse(responseCode = "422", description = "Validation exception", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ErrorMessage.class)))) })
    @RequestMapping(value = "/student/{studentId}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Student> studentStudentIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the student to update", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
, @Parameter(in = ParameterIn.DEFAULT, description = "Update existing student", required=true, schema=@Schema()) @Valid @RequestBody Student body
);

}

