package org.springapiserver.converter;

import org.springapiserver.dto.PictureDto;
import org.springapiserver.model.Picture;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PictureConverter implements Converter<Picture, PictureDto> {
    @Override
    public PictureDto convert(Picture source) {
        return PictureDto.builder()
                .large(source.getLarge())
                .medium(source.getMedium())
                .thumbnail(source.getThumbnail())
                .build();
    }
}
