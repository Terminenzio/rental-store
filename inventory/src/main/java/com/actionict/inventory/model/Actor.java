package com.actionict.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AttributeOverride(name = "id", column = @Column(name = "actor_id"))
@Table(name = "actor", indexes = @Index(name = "idx_actor_last_name", columnList = "last_name"))
public class Actor extends AbstractEntityWithLastUpdate<Integer> {

    @Column(name = "first_name", length = 45)
    private String firstName;

    @Column(name = "last_name", length = 45)
    private String lastName;

//    @OneToMany(mappedBy = "actor", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<FilmActor> filmActors = new HashSet<>();
}
