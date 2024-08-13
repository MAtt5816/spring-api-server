package org.springapiserver.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.*;

/**
 * AuthData
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-13T18:28:45.818982442Z[GMT]")


public class AuthData   {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("passphrase")
  private String passphrase = null;

  public AuthData username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(example = "user1", description = "")
      @NotNull

  @Size(max=50)   public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AuthData passphrase(String passphrase) {
    this.passphrase = passphrase;
    return this;
  }

  /**
   * Get passphrase
   * @return passphrase
   **/
  @Schema(example = "secret_password123", description = "")
      @NotNull

  @Size(max=255)   public String getPassphrase() {
    return passphrase;
  }

  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthData authData = (AuthData) o;
    return Objects.equals(this.username, authData.username) &&
        Objects.equals(this.passphrase, authData.passphrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, passphrase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthData {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}