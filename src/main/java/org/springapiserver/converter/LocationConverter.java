package org.springapiserver.converter;

import org.springapiserver.dto.LocationDto;
import org.springapiserver.model.Location;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LocationConverter implements Converter<Location, LocationDto> {

    @Override
    public LocationDto convert(Location source) {
        return LocationDto.builder()
                .streetNumber(source.getStreetNumber())
                .streetName(source.getStreetName())
                .city(source.getCity())
                .state(source.getState())
                .country(source.getCountry())
                .postcode(source.getPostcode())
                .timezone(source.getTimezone())
                .build();
    }
}
