package com.actionict.inventory.service;

import com.actionict.inventory.model.Language;
import com.actionict.inventory.repository.LanguageRepository;
import org.springframework.stereotype.Service;

@Service
public class LanguageService extends AbstractService<Language, Integer> {
    public LanguageService(LanguageRepository entityRepository) {
        super(entityRepository);
    }
}
