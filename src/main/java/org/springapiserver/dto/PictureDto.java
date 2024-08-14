package org.springapiserver.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PictureDto {
    private String large;
    private String medium;
    private String thumbnail;
}
