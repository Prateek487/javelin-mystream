package com.javelin.mystream.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "video")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "upload_date")
    private Date uploadDate;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "url")
    private String url;

    @Column(name = "uploaded_by")
    private String uploadedBy;

    @Column(name = "content_id")
    private Long contentId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="content_id", insertable=false, updatable=false)
    @JsonIgnore
    private Content content;
}
