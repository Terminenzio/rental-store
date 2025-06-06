package com.actionict.customer.service;

import com.actionict.customer.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends AbstractService<Country> {
    public CountryService(JpaRepository<Country, Integer> entityRepository) {
        super(entityRepository);
    }
}
