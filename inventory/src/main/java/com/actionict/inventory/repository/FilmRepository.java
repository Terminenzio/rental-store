package com.actionict.inventory.repository;

import com.actionict.inventory.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

//    @Query("""
//        SELECT c FROM Customer c\s
//        WHERE LOWER(c.firstName) LIKE LOWER(CONCAT('%', :searchInput, '%'))
//              \sOR\s
//              LOWER(c.lastName) LIKE LOWER(CONCAT('%', :searchInput, '%'))
//        """)
//    ORDER BY c.lastName, c.firstName ??
//    Page<Customer> searchByName(@Param("searchInput") String searchInput, Pageable pageable);
}