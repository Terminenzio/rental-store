package com.actionict.inventory.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class FilmCategoryId implements Serializable {

    @Column(name = "film_id")
    private int filmId;

    @Column(name = "category_id")
    private int categoryId;
}
