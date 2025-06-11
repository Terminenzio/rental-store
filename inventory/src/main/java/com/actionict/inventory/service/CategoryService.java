package com.actionict.inventory.service;

import com.actionict.inventory.model.Category;
import com.actionict.inventory.model.Film;
import com.actionict.inventory.repository.CategoryRepository;
import com.actionict.inventory.repository.FilmRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends AbstractService<Category, Integer> {
    public CategoryService(CategoryRepository entityRepository) {
        super(entityRepository);
    }
}
