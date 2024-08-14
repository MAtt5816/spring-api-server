package org.springapiserver.converter;

import org.springapiserver.dto.StudentDto;
import org.springapiserver.model.Student;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter implements Converter<Student, StudentDto> {
    private final LocationConverter locationConverter = new LocationConverter();
    private final PictureConverter pictureConverter = new PictureConverter();

    @Override
    public StudentDto convert(Student source) {
        return StudentDto.builder()
                .id(source.getId())
                .gender(source.getGender())
                .title(source.getTitle())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .email(source.getEmail())
                .dob(source.getDob().toString())
                .registered(source.getRegistered().toString())
                .phone(source.getPhone())
                .idName(source.getIdName())
                .idValue(source.getIdValue())
                .nat(source.getNat())
                .location(locationConverter.convert(source.getLocation()))
                .picture(pictureConverter.convert(source.getPicture()))
                .build();
    }
}
