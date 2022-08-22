package com.uss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uss.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
