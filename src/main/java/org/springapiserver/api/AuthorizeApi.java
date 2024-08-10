/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.61).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.springapiserver.api;

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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")
@Validated
public interface AuthorizeApi {

    @Operation(summary = "Get authorization JWT token", description = "Returns JWT token for further authorization.", security = {
        @SecurityRequirement(name = "jwt_token_auth")    }, tags={ "general" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "text/plain", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "401", description = "unauthorized") })
    @RequestMapping(value = "/authorize",
        produces = { "text/plain" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> authorizePost();

}

