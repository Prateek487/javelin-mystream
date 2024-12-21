package com.javelin.mystream.models;

import lombok.*;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContentDTO {
    private String name;

    private String description;

    private String type;

    private Date releaseDate;

    private String image;

    private Detail detail;

    private Set<GenreDTO> genres;
}
