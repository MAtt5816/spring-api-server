package org.springapiserver.api;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springapiserver.dao.UserDao;
import org.springapiserver.model.AuthData;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springapiserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import jakarta.servlet.http.HttpServletRequest;

import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-13T18:28:45.818982442Z[GMT]")
@RestController
public class AuthorizeApiController implements AuthorizeApi {
    @Autowired
    private UserDao userDao;

    @Value("${jwt.secret}")
    private String jwtSecret;

    // Token validity (e.g., 86400000 milliseconds = 1 day)
    @Value("${jwt.expiration}")
    private long jwtExpiration;

    public ResponseEntity<String> authorizePost(@Parameter(in = ParameterIn.DEFAULT, description = "Send authorization data", schema=@Schema()) @Valid @RequestBody AuthData body
) {
        try {
            User user = userDao.findByUsername(body.getUsername());

            String passphrase = body.getPassphrase() + (user != null ? user.getSalt() : "");
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] crypto = digest.digest(passphrase.getBytes(StandardCharsets.UTF_8));
            StringBuilder hash = new StringBuilder();
            for (byte theByte : crypto) {
                hash.append(String.format("%02x", theByte));
            }
            String passHash = hash.toString();

            assert user != null;
            if (!passHash.equals(user.getSha256())) {
                return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            }

            // JWT generate
            SecretKey key = Keys.hmacShaKeyFor(jwtSecret.getBytes(StandardCharsets.UTF_8));
            String token = Jwts.builder()
                    .setSubject(user.getUsername())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + jwtExpiration))
                    .signWith(key, SignatureAlgorithm.HS256)
                    .compact();

            return ResponseEntity.ok(token);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

}
