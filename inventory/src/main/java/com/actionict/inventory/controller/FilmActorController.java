package com.actionict.inventory.controller;

import com.actionict.inventory.model.FilmActor;
import com.actionict.inventory.model.FilmActorId;
import com.actionict.inventory.service.FilmActorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/film-actor")
public class FilmActorController extends AbstractController<FilmActor, FilmActorId> {

    public FilmActorController(FilmActorService service) {
        super(service);
    }


    @GetMapping("/{filmId}/{actorId}")
    public ResponseEntity<FilmActor> getEntityById(
            @PathVariable Integer filmId,
            @PathVariable Integer actorId) {

        FilmActorId id = new FilmActorId(filmId,actorId);

        return super.getEntityById(id);
    }

    @PutMapping("/{filmId}/{actorId}")
    public ResponseEntity<FilmActor> update(
            @PathVariable Integer filmId,
            @PathVariable Integer actorId,
            @RequestBody FilmActor updated) {

        throw new RuntimeException("Method not allowed, please do DELETE and POST new");
    }

    @PatchMapping("/{filmId}/{actorId}")
    public ResponseEntity<FilmActor> partialUpdate(
            @PathVariable Integer filmId,
            @PathVariable Integer actorId,
            @RequestBody Map<String, Object> updates) {

        throw new RuntimeException("Method not allowed, please do DELETE and POST new");
    }

    @DeleteMapping("/{filmId}/{actorId}")
    public ResponseEntity<Void> deleteEntity(
            @PathVariable Integer filmId,
            @PathVariable Integer actorId) {

        FilmActorId id = new FilmActorId(filmId, actorId);

        return super.deleteEntity(id);
    }
}