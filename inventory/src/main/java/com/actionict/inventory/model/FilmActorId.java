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
public class FilmActorId implements Serializable {

    @Column(name = "film_id")
    private int filmId;

    @Column(name = "actor_id")
    private int actorId;
}
