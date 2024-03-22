package com.drfjohngach.orderservice.repository;

import com.drfjohngach.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
