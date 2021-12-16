package com.devsuperior.dscatolog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscatolog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
