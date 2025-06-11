package com.actionict.inventory.repository;

import com.actionict.inventory.model.FilmCategory;
import com.actionict.inventory.model.FilmCategoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmCategoryRepository extends JpaRepository<FilmCategory, FilmCategoryId> {

}