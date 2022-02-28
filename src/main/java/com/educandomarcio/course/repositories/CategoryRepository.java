package com.educandomarcio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandomarcio.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
