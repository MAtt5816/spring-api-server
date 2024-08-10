package org.springapiserver.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")
@RestController
public class HelloApiController implements HelloApi {
    public ResponseEntity<String> helloGet() {
        return new ResponseEntity<>("Hello world!", HttpStatus.OK);
    }

}
