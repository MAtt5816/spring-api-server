package org.springapiserver.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocationDto {
    @JsonProperty("street_number")
    private int streetNumber;
    @JsonProperty("street_name")
    private String streetName;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("timezone")
    private String timezone;
}
