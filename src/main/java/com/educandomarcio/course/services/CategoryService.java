package com.educandomarcio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandomarcio.course.entities.Category;
import com.educandomarcio.course.repositories.CategoryRepository;

//registra como componente do Spring com a anotação

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	//retorna todo usuarios do banco de dados
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	//recuperando por ID
	public Category finById(long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
