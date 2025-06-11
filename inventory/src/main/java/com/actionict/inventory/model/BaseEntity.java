package com.actionict.inventory.model;

public interface BaseEntity<ID> {
    ID getId();
    void setId(ID id);
}
