package com.dev.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
