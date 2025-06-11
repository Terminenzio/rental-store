package com.actionict.inventory.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@AttributeOverride(name = "id", column = @Column(name = "language_id"))
@Table(name = "language")
public class Language extends AbstractEntityWithLastUpdate<Integer> {

    @Column(name = "name", length = 20)
    private String name;
}
