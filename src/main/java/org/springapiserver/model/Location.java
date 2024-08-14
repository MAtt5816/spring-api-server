package org.springapiserver.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.*;

/**
 * Location
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")


@Entity
@Table(name = "locations")
@Getter
@Setter
@NoArgsConstructor
public class Location   {
  @Id
  @Column(name = "student_id", insertable = false, nullable = true)
  @JsonProperty("student_id")
  @Schema(example = "1", accessMode = Schema.AccessMode.READ_ONLY)
  private Long studentId;

  @JsonProperty("street_number")
  @Schema(example = "2595", description = "")
  @NotNull
  private Integer streetNumber = null;

  @JsonProperty("street_name")
  @Schema(example = "Main Street", description = "")
  @NotNull
  @Size(max=100)
  private String streetName = null;

  @JsonProperty("city")
  @Schema(example = "Tamworth", description = "")
  @NotNull
  @Size(max=100)
  private String city = null;

  @JsonProperty("state")
  @Schema(example = "Queensland", description = "")
  @NotNull
  @Size(max=100)
  private String state = null;

  @JsonProperty("country")
  @Schema(example = "Australia", description = "")
  @NotNull
  @Size(max=100)
  private String country = null;

  @JsonProperty("postcode")
  @Schema(example = "6066", description = "")
  @NotNull
  @Size(max=20)
  private String postcode = null;

  @JsonProperty("timezone")
  @Schema(example = "330", description = "")
  @NotNull
  @Size(max=10)
  private String timezone = null;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "student_id")
  private Student student;

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

  public void fillPartial(Location partialLocation) {
    if (partialLocation.getStreetNumber() != null) {
      this.setStreetNumber(partialLocation.getStreetNumber());
    }
    if (partialLocation.getStreetName() != null) {
      this.setStreetName(partialLocation.getStreetName());
    }
    if (partialLocation.getCity() != null) {
      this.setCity(partialLocation.getCity());
    }
    if (partialLocation.getState() != null) {
      this.setState(partialLocation.getState());
    }
    if (partialLocation.getCountry() != null) {
      this.setCountry(partialLocation.getCountry());
    }
    if (partialLocation.getPostcode() != null) {
      this.setPostcode(partialLocation.getPostcode());
    }
    if (partialLocation.getTimezone() != null) {
      this.setTimezone(partialLocation.getTimezone());
    }
  }
}
