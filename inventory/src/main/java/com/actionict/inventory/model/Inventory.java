package com.actionict.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@AttributeOverride(name = "id", column = @Column(name = "inventory_id"))
@Table(name = "inventory")
public class Inventory extends AbstractEntityWithLastUpdate<Integer> {

    // Join con la tabella film
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    // Join con la tabella film_text
//    @ManyToOne
//    @MapsId("film_id")
//    @JoinColumn(name = "film_id")
//    private FilmText filmText;

    // Chiave esterna in un altro database, non collegata
    @Column(name = "store_id")
    private int storeId;
}
