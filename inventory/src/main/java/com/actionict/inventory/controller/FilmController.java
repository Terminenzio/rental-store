package com.actionict.inventory.controller;

import com.actionict.inventory.model.Film;
import com.actionict.inventory.service.FilmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/films")
public class FilmController extends AbstractControllerWithSingleIdMapping<Film, Integer> {

    public FilmController(FilmService service) {
        super(service);
    }
}