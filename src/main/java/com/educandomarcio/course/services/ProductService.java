package com.educandomarcio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandomarcio.course.entities.Product;
import com.educandomarcio.course.repositories.ProductRepository;

//registra como componente do Spring com a anotação

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	//retorna todo usuarios do banco de dados
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	//recuperando por ID
	public Product findById(long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
