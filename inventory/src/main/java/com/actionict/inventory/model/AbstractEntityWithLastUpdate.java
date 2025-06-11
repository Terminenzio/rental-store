package com.actionict.inventory.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class AbstractEntityWithLastUpdate<ID> extends AbstractEntity<ID> {

    @UpdateTimestamp
    @Column(name = "last_update")
    protected LocalDateTime lastUpdate;

}
