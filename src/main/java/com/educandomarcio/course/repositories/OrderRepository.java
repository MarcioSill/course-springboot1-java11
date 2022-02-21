package com.educandomarcio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandomarcio.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
