package com.actionict.inventory.service;

import com.actionict.inventory.model.FilmActor;
import com.actionict.inventory.model.FilmActorId;
import com.actionict.inventory.repository.FilmActorRepository;
import org.springframework.stereotype.Service;

@Service
public class FilmActorService extends AbstractService<FilmActor, FilmActorId> {
    public FilmActorService(FilmActorRepository entityRepository) {
        super(entityRepository);
    }
}
