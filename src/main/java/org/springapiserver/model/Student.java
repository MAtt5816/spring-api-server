package org.springapiserver.model;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Student
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")

@Getter
@Setter
public class Student   {
  @JsonProperty("id")
  @Schema(example = "1", accessMode = Schema.AccessMode.READ_ONLY, description = "")
  @NotNull
  private Integer id = null;

  @JsonProperty("gender")
  @Schema(example = "female", description = "")
  @NotNull
  @Size(max=10)
  private String gender = null;

  @JsonProperty("title")
  @Schema(example = "Miss", description = "")
  @NotNull
  @Size(max=20)
  private String title = null;

  @JsonProperty("first_name")
  @Schema(example = "Terri", description = "")
  @NotNull
  @Size(max=50)
  private String firstName = null;

  @JsonProperty("last_name")
  @Schema(example = "Lucas", description = "")
  @NotNull
  @Size(max=50)
  private String lastName = null;

  @JsonProperty("email")
  @Schema(example = "terri.lucas@example.com", description = "")
  @NotNull
  @Size(max=100)
  private String email = null;

  @JsonProperty("dob")
  @Schema(example = "Mon Nov 23 00:00:00 GMT 1964", description = "date of birth")
  @NotNull
  @Valid
  private LocalDate dob = null;

  @JsonProperty("registered")
  @Schema(example = "2014-07-23T03:21:42.259Z", description = "date of registration")
  @NotNull
  @Valid
  private OffsetDateTime registered = null;

  @JsonProperty("phone")
  @Schema(example = "03-2662-3559", description = "")
  @NotNull
  @Size(max=20)
  private String phone = null;

  @JsonProperty("id_name")
  @Schema(example = "TFN", description = "national identification number type")
  @NotNull
  @Size(max=20)
  private String idName = null;

  @JsonProperty("id_value")
  @Schema(example = "230000682", description = "national identification number value")
  @NotNull
  @Size(max=50)
  private String idValue = null;

  @JsonProperty("nat")
  @Schema(example = "AU", description = "nationality short code")
  @NotNull
  @Size(max=10)
  private String nat = null;

  @JsonProperty("location")
  @Schema(description = "")
  @NotNull
  @Valid
  private Location location = null;

  @JsonProperty("picture")
  @Schema(description = "")
  @NotNull
  @Valid
  private Picture picture = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.id, student.id) &&
        Objects.equals(this.gender, student.gender) &&
        Objects.equals(this.title, student.title) &&
        Objects.equals(this.firstName, student.firstName) &&
        Objects.equals(this.lastName, student.lastName) &&
        Objects.equals(this.email, student.email) &&
        Objects.equals(this.dob, student.dob) &&
        Objects.equals(this.registered, student.registered) &&
        Objects.equals(this.phone, student.phone) &&
        Objects.equals(this.idName, student.idName) &&
        Objects.equals(this.idValue, student.idValue) &&
        Objects.equals(this.nat, student.nat) &&
        Objects.equals(this.location, student.location) &&
        Objects.equals(this.picture, student.picture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gender, title, firstName, lastName, email, dob, registered, phone, idName, idValue, nat, location, picture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    idName: ").append(toIndentedString(idName)).append("\n");
    sb.append("    idValue: ").append(toIndentedString(idValue)).append("\n");
    sb.append("    nat: ").append(toIndentedString(nat)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
