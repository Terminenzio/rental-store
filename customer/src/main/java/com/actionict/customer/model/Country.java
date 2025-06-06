package com.actionict.customer.model;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AttributeOverride(name = "id", column = @Column(name = "country_id"))
@Table(name = "country")
public class Country extends BaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "country_id")
//    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

//    @UpdateTimestamp
//    @Column(name = "last_update")
//    private LocalDateTime lastUpdate;

    // Lista di città per la join sulla tabella City
//    @OneToMany(mappedBy = "country",
//            fetch = FetchType.LAZY,
//            cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
//    private List<City> cities;
}
