package com.javelin.mystream.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "content")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "image")
    private String image;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "detail_id", referencedColumnName = "id")
    private Detail detail;

    @OneToMany(mappedBy = "content")
    private Set<Video> videos;

    @ManyToMany
    @JoinTable(name = "content_genre", joinColumns = @JoinColumn(name = "content_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    @JsonManagedReference
    private Set<Genre> genres;
}
