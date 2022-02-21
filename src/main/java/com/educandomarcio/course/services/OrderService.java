package com.educandomarcio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandomarcio.course.entities.Order;
import com.educandomarcio.course.repositories.OrderRepository;

//registra como componente do Spring com a anotação

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	//retorna todo usuarios do banco de dados
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	//recuperando por ID
	public Order finById(long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
