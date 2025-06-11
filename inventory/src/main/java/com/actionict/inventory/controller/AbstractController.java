package com.actionict.inventory.controller;

import com.actionict.inventory.model.BaseEntity;
import com.actionict.inventory.service.EntityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public abstract class AbstractController<E extends BaseEntity<ID>, ID> {

    private final EntityService<E, ID> entityService;

    protected AbstractController(EntityService<E, ID> entityService) {
        this.entityService = entityService;
    }

    // Trova tutti
    @GetMapping
    public ResponseEntity<List<E>> getAllEntities() {
        return ResponseEntity.ok(entityService.findAll());
    }

    // Inserisci
    @PostMapping
    public ResponseEntity<ID> addEntity(@RequestBody E entity) {
        return new ResponseEntity<>(entityService.add(entity), HttpStatus.CREATED);
    }

    // Trova uno
    public ResponseEntity<E> getEntityById(ID id) {
        return entityService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Sovrascrivi
    public ResponseEntity<E> update(ID id,
                                    E entity) {
        entity.setId(id);
        return ResponseEntity.ok(entityService.update(entity));
    }

    // Aggiorna frammenti
    public ResponseEntity<E> partialUpdate(ID id,
                                           Map<String, Object> updates) {
        return ResponseEntity.ok(entityService.partialUpdate(id, updates));
    }

    // Elimina
    public ResponseEntity<Void> deleteEntity(ID id) {
        entityService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}