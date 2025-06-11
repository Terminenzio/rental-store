package com.actionict.inventory.repository;

import com.actionict.inventory.model.FilmActor;
import com.actionict.inventory.model.FilmActorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmActorRepository extends JpaRepository<FilmActor, FilmActorId> {

}