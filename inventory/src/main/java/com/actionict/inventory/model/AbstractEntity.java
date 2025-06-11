package com.actionict.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class AbstractEntity<ID> implements BaseEntity<ID> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // override nei figli
    protected ID id;

}
