package com.actionict.inventory.service;

import com.actionict.inventory.model.BaseEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EntityService<E extends BaseEntity<ID>, ID> {

    // Trova tutti
    List<E> findAll();

    // Trova uno
    Optional<E> findById(ID id);

    // Inserisci
    ID add(E entity);

    // Sovrascrivi
    E update(E entity);

    // Aggiorna
    E partialUpdate(ID id, Map<String, Object> updates);

    // Elimina
    void deleteById(ID id);
}