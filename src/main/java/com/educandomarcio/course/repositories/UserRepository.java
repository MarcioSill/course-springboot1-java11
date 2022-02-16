package com.educandomarcio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandomarcio.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
