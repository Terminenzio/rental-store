package com.actionict.inventory.service;

import com.actionict.inventory.model.Film;
import com.actionict.inventory.repository.FilmRepository;
import org.springframework.stereotype.Service;

@Service
public class FilmService extends AbstractService<Film, Integer> {
    public FilmService(FilmRepository entityRepository) {
        super(entityRepository);
    }
}
