package com.actionict.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AttributeOverride(name = "id", column = @Column(name = "category_id"))
@Table(name = "category")
public class Category extends AbstractEntityWithLastUpdate<Integer> {

    @Column(name = "name", length = 25)
    private String name;

//    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<FilmCategory> filmCategories = new HashSet<FilmCategory>();
}
