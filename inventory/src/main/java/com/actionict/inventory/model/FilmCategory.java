package com.actionict.inventory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "film_category")
public class FilmCategory extends AbstractEntityWithCreationTimestamp<FilmCategoryId> {

    @EmbeddedId
    private FilmCategoryId id = new FilmCategoryId();

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("filmId")
    @JoinColumn(name = "film_id", insertable = false, updatable = false)
    private Film film;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("categoryId")
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Category category;

}
