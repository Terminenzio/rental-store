package com.actionict.inventory.controller;

import com.actionict.inventory.model.Inventory;
import com.actionict.inventory.service.InventoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventories")
public class InventoryController extends AbstractControllerWithSingleIdMapping<Inventory, Integer> {

    public InventoryController(InventoryService service) {
        super(service);
    }
}