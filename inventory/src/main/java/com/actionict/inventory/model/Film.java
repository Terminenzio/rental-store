package com.actionict.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AttributeOverride(name = "id", column = @Column(name = "film_id"))
@Table(name = "film", indexes = @Index(name = "idx_title", columnList = "title"))
public class Film extends AbstractEntity<Integer> {

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "release_year")
    private int releaseYear;

    // Join con la tabella Language
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    // Join con la tabella Language
    @ManyToOne
    @JoinColumn(name = "original_language_id")
    private Language originalLanguage;

    @Column(name = "length")
    private int length;

    @Column(name = "rental_duration", columnDefinition = "integer")
    private int rentalDuration = 3;

    @Column(name = "rental_rate", columnDefinition = "numeric(4,2)")
    // Tolto default perché in alter table Hibernate fallisce, gestito da codice
    // default 4.99
    //columnDefinition = "precision = 4, scale = 2")
    private double rentalRate = 4.99;

    @Column(name = "replacement_cost", columnDefinition = "numeric(5,2)")
    // Tolto default perché in alter table Hibernate fallisce, gestito da codice
    // default 19.99
    //columnDefinition = "precision = 5, scale = 2")
    private double replacementCost = 19.99;

    @Enumerated(EnumType.STRING)
    @Column(name = "rating", length = 10)
    private Rating rating = Rating.G;

//    @Column(name = "special_features", columnDefinition = "SET('Trailers','Commentaries','Deleted Scenes','Behind the Scenes')")

//    @Enumerated(EnumType.STRING)
//    @Column(name = "special_features", length = 20)
//    private SpecialFeatures specialFeatures = new HashSet<>(List.of("Trailers", "Commentaries", "Deleted Scenes", "Behind the Scenes"));
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
            name = "film_special_feature",
            joinColumns = @JoinColumn(name = "film_id")
    )
    @Column(name = "special_feature")
    @Enumerated(EnumType.STRING) // se usi un Enum
    private Set<SpecialFeature> specialFeatures;

//    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<FilmCategory> filmCategories = new HashSet<>();
}
