package com.actionict.inventory.controller;

import com.actionict.inventory.model.Language;
import com.actionict.inventory.service.LanguageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/languages")
public class LanguageController extends AbstractControllerWithSingleIdMapping<Language, Integer> {

    public LanguageController(LanguageService service) {
        super(service);
    }
}