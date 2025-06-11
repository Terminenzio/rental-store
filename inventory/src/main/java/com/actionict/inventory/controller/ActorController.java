package com.actionict.inventory.controller;

import com.actionict.inventory.model.Actor;
import com.actionict.inventory.service.ActorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actors")
public class ActorController extends AbstractControllerWithSingleIdMapping<Actor, Integer> {

    public ActorController(ActorService service) {
        super(service);
    }
}