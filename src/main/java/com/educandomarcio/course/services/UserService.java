package com.educandomarcio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandomarcio.course.entities.User;
import com.educandomarcio.course.repositories.UserRepository;


//registra como componente do Spring com a anotação

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	//retorna todo usuarios do banco de dados
	public List<User> findAll() {
		return repository.findAll();
	}
	
	//recuperando por ID
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());		
	}

}
