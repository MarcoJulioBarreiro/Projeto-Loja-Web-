package com.dev.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.entities.OrderItem;
import com.dev.loja.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
