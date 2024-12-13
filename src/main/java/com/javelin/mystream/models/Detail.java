package com.javelin.mystream.models;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "directed_by")
    private String directedBy;

    @Column(name = "produced_by")
    private String producedBy;

    @Column(name = "rating")
    private int rating;
}
