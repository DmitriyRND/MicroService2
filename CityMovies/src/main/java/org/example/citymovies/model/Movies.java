package org.example.citymovies.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;
}
