package com.actionict.inventory.service;

import com.actionict.inventory.model.Category;
import com.actionict.inventory.model.FilmCategory;
import com.actionict.inventory.model.FilmCategoryId;
import com.actionict.inventory.repository.CategoryRepository;
import com.actionict.inventory.repository.FilmCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class FilmCategoryService extends AbstractService<FilmCategory, FilmCategoryId> {
    public FilmCategoryService(FilmCategoryRepository entityRepository) {
        super(entityRepository);
    }
}
