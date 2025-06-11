package com.actionict.inventory.controller;

import com.actionict.inventory.model.Category;
import com.actionict.inventory.service.CategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController extends AbstractControllerWithSingleIdMapping<Category, Integer> {

    public CategoryController(CategoryService service) {
        super(service);
    }
}