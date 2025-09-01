package com.dev.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
