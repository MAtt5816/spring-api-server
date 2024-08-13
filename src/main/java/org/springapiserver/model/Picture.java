package org.springapiserver.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.*;

/**
 * Picture
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")


@Getter
@Setter
public class Picture   {
  @JsonProperty("large")
  @Schema(example = "https://randomuser.me/api/portraits/men/75.jpg", description = "")
  @NotNull
  @Size(max=255)
  private String large = null;

  @JsonProperty("medium")
  @Schema(example = "https://randomuser.me/api/portraits/med/men/75.jpg", description = "")
  @NotNull
  @Size(max=255)
  private String medium = null;

  @JsonProperty("thumbnail")
  @Schema(example = "https://randomuser.me/api/portraits/thumb/men/75.jpg", description = "")
  @NotNull
  @Size(max=255)
  private String thumbnail = null;

  public Picture large(String large) {
    this.large = large;
    return this;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Picture picture = (Picture) o;
    return Objects.equals(this.large, picture.large) &&
        Objects.equals(this.medium, picture.medium) &&
        Objects.equals(this.thumbnail, picture.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(large, medium, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Picture {\n");
    
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
