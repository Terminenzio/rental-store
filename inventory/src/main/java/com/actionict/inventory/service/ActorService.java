package com.actionict.inventory.service;

import com.actionict.inventory.model.Actor;
import com.actionict.inventory.repository.ActorRepository;
import org.springframework.stereotype.Service;

@Service
public class ActorService extends AbstractService<Actor, Integer> {
    public ActorService(ActorRepository entityRepository) {
        super(entityRepository);
    }
}
