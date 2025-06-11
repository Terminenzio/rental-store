package com.actionict.inventory.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Immutable;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class AbstractEntityWithCreationTimestamp<ID> implements BaseEntity<ID> {

    @CreationTimestamp
    @Immutable
    @Column(name = "create_date")
    private LocalDateTime createDate;

}
