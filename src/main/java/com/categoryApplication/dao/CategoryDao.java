package com.categoryApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.categoryApplication.entity.Category;



public interface CategoryDao extends JpaRepository<Category, Integer>{

}
