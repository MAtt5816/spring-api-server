package org.springapiserver.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("title")
    private String title;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("registered")
    private String registered;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("id_name")
    private String idName;
    @JsonProperty("id_value")
    private String idValue;
    @JsonProperty("nat")
    private String nat;
    @JsonProperty("location")
    private LocationDto location;
    @JsonProperty("picture")
    private PictureDto picture;
}
