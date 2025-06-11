package com.actionict.inventory.controller;

import com.actionict.inventory.model.FilmCategory;
import com.actionict.inventory.model.FilmCategoryId;
import com.actionict.inventory.service.FilmCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/film-category")
public class FilmCategoryController extends AbstractController<FilmCategory, FilmCategoryId> {

    public FilmCategoryController(FilmCategoryService service) {
        super(service);
    }


    @GetMapping("/{filmId}/{categoryId}")
    public ResponseEntity<FilmCategory> getEntityById(
            @PathVariable Integer filmId,
            @PathVariable Integer categoryId) {

        FilmCategoryId id = new FilmCategoryId(filmId,categoryId);

        return super.getEntityById(id);
    }

    @PutMapping("/{filmId}/{categoryId}")
    public ResponseEntity<FilmCategory> update(
            @PathVariable Integer filmId,
            @PathVariable Integer categoryId,
            @RequestBody FilmCategory updated) {

        throw new RuntimeException("Method not allowed, please do DELETE and POST new");
    }

    @PatchMapping("/{filmId}/{categoryId}")
    public ResponseEntity<FilmCategory> partialUpdate(
            @PathVariable Integer filmId,
            @PathVariable Integer categoryId,
            @RequestBody Map<String, Object> updates) {

        throw new RuntimeException("Method not allowed, please do DELETE and POST new");
    }

    @DeleteMapping("/{filmId}/{categoryId}")
    public ResponseEntity<Void> deleteEntity(
            @PathVariable Integer filmId,
            @PathVariable Integer categoryId) {

        FilmCategoryId id = new FilmCategoryId(filmId, categoryId);

        return super.deleteEntity(id);
    }
}