package org.springapiserver.model;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Student
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")


public class Student   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("dob")
  private LocalDate dob = null;

  @JsonProperty("registered")
  private OffsetDateTime registered = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("id_name")
  private String idName = null;

  @JsonProperty("id_value")
  private String idValue = null;

  @JsonProperty("nat")
  private String nat = null;

  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("picture")
  private Picture picture = null;

  public Student id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "1", accessMode = Schema.AccessMode.READ_ONLY, description = "")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Student gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   **/
  @Schema(example = "female", description = "")
      @NotNull

  @Size(max=10)   public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Student title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @Schema(example = "Miss", description = "")
      @NotNull

  @Size(max=20)   public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Student firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @Schema(example = "Terri", description = "")
      @NotNull

  @Size(max=50)   public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Student lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @Schema(example = "Lucas", description = "")
      @NotNull

  @Size(max=50)   public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Student email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(example = "terri.lucas@example.com", description = "")
      @NotNull

  @Size(max=100)   public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Student dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * date of birth
   * @return dob
   **/
  @Schema(example = "Mon Nov 23 00:00:00 GMT 1964", description = "date of birth")
      @NotNull

    @Valid
    public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public Student registered(OffsetDateTime registered) {
    this.registered = registered;
    return this;
  }

  /**
   * date of registration
   * @return registered
   **/
  @Schema(example = "2014-07-23T03:21:42.259Z", description = "date of registration")
      @NotNull

    @Valid
    public OffsetDateTime getRegistered() {
    return registered;
  }

  public void setRegistered(OffsetDateTime registered) {
    this.registered = registered;
  }

  public Student phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   **/
  @Schema(example = "03-2662-3559", description = "")
      @NotNull

  @Size(max=20)   public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Student idName(String idName) {
    this.idName = idName;
    return this;
  }

  /**
   * national identification number type
   * @return idName
   **/
  @Schema(example = "TFN", description = "national identification number type")
      @NotNull

  @Size(max=20)   public String getIdName() {
    return idName;
  }

  public void setIdName(String idName) {
    this.idName = idName;
  }

  public Student idValue(String idValue) {
    this.idValue = idValue;
    return this;
  }

  /**
   * national identification number value
   * @return idValue
   **/
  @Schema(example = "230000682", description = "national identification number value")
      @NotNull

  @Size(max=50)   public String getIdValue() {
    return idValue;
  }

  public void setIdValue(String idValue) {
    this.idValue = idValue;
  }

  public Student nat(String nat) {
    this.nat = nat;
    return this;
  }

  /**
   * nationality short code
   * @return nat
   **/
  @Schema(example = "AU", description = "nationality short code")
      @NotNull

  @Size(max=10)   public String getNat() {
    return nat;
  }

  public void setNat(String nat) {
    this.nat = nat;
  }

  public Student location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Student picture(Picture picture) {
    this.picture = picture;
    return this;
  }

  /**
   * Get picture
   * @return picture
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public Picture getPicture() {
    return picture;
  }

  public void setPicture(Picture picture) {
    this.picture = picture;
  }


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
