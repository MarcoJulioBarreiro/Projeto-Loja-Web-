package com.dev.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
