package org.springapiserver.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.*;

/**
 * Location
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")


public class Location   {
  @JsonProperty("street_number")
  private Integer streetNumber = null;

  @JsonProperty("street_name")
  private String streetName = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("postcode")
  private String postcode = null;

  @JsonProperty("timezone")
  private String timezone = null;

  public Location streetNumber(Integer streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

  /**
   * Get streetNumber
   * @return streetNumber
   **/
  @Schema(example = "2595", description = "")
      @NotNull

    public Integer getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(Integer streetNumber) {
    this.streetNumber = streetNumber;
  }

  public Location streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Get streetName
   * @return streetName
   **/
  @Schema(example = "Main Street", description = "")
      @NotNull

  @Size(max=100)   public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Location city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @Schema(example = "Tamworth", description = "")
      @NotNull

  @Size(max=100)   public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Location state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(example = "Queensland", description = "")
      @NotNull

  @Size(max=100)   public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Location country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @Schema(example = "Australia", description = "")
      @NotNull

  @Size(max=100)   public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Location postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Get postcode
   * @return postcode
   **/
  @Schema(example = "6066", description = "")
      @NotNull

  @Size(max=20)   public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Location timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * @return timezone
   **/
  @Schema(example = "330", description = "")
      @NotNull

  @Size(max=10)   public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.streetNumber, location.streetNumber) &&
        Objects.equals(this.streetName, location.streetName) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.state, location.state) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.postcode, location.postcode) &&
        Objects.equals(this.timezone, location.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetNumber, streetName, city, state, country, postcode, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
