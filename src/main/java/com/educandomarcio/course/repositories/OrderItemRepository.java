package com.educandomarcio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandomarcio.course.entities.OrderItem;
import com.educandomarcio.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
