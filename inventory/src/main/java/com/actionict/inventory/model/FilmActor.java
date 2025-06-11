package com.actionict.inventory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "film_actor")
public class FilmActor extends AbstractEntityWithCreationTimestamp<FilmActorId> {

    @EmbeddedId
    private FilmActorId id = new FilmActorId();

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("filmId")
    @JoinColumn(name = "film_id", insertable = false, updatable = false)
    private Film film;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("actorId")
    @JoinColumn(name = "actor_id", insertable = false, updatable = false)
    private Actor actor;

}
