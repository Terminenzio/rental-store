package com.actionict.inventory.service;

import com.actionict.inventory.model.Category;
import com.actionict.inventory.model.Inventory;
import com.actionict.inventory.repository.CategoryRepository;
import com.actionict.inventory.repository.InventoryRepository;
import org.springframework.stereotype.Service;

@Service
public class InventoryService extends AbstractService<Inventory, Integer> {
    public InventoryService(InventoryRepository entityRepository) {
        super(entityRepository);
    }
}
