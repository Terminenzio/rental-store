package com.actionict.inventory.controller;

import com.actionict.inventory.model.BaseEntity;
import com.actionict.inventory.service.EntityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public abstract class AbstractControllerWithSingleIdMapping<E extends BaseEntity<ID>, ID>
                                        extends AbstractController<E, ID>{

    protected AbstractControllerWithSingleIdMapping(EntityService<E, ID> entityService) {
        super(entityService);
    }

    // Trova uno
    @Override
    @GetMapping("/{id:\\d+}") // accetta solo numeri come {id}
    public ResponseEntity<E> getEntityById(@PathVariable ID id) {
        return super.getEntityById(id);
    }

    // Aggiorna
    @Override
    @PutMapping("/{id:\\d+}")
    public ResponseEntity<E> update(@PathVariable ID id,
                                    @RequestBody E entity) {
        return super.update(id, entity);
    }

    @PatchMapping("/{id:\\d+}")
    @Override
    public ResponseEntity<E> partialUpdate(@PathVariable ID id,
                                           @RequestBody Map<String, Object> updates) {
        return super.partialUpdate(id, updates);
    }

    // Elimina
    @DeleteMapping("/{id:\\d+}")
    @Override
    public ResponseEntity<Void> deleteEntity(@PathVariable ID id) {
        return super.deleteEntity(id);
    }
}