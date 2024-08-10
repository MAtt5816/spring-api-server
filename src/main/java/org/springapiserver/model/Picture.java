package org.springapiserver.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.*;

/**
 * Picture
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-10T15:09:49.444563610Z[GMT]")


public class Picture   {
  @JsonProperty("large")
  private String large = null;

  @JsonProperty("medium")
  private String medium = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  public Picture large(String large) {
    this.large = large;
    return this;
  }

  /**
   * Get large
   * @return large
   **/
  @Schema(example = "https://randomuser.me/api/portraits/men/75.jpg", description = "")
      @NotNull

  @Size(max=255)   public String getLarge() {
    return large;
  }

  public void setLarge(String large) {
    this.large = large;
  }

  public Picture medium(String medium) {
    this.medium = medium;
    return this;
  }

  /**
   * Get medium
   * @return medium
   **/
  @Schema(example = "https://randomuser.me/api/portraits/med/men/75.jpg", description = "")
      @NotNull

  @Size(max=255)   public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public Picture thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Get thumbnail
   * @return thumbnail
   **/
  @Schema(example = "https://randomuser.me/api/portraits/thumb/men/75.jpg", description = "")
      @NotNull

  @Size(max=255)   public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
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
