package com.categoryApplication.service;

import java.util.List;

import com.categoryApplication.entity.Category;
import com.categoryApplication.exception.CategoryNotFoundException;


public interface CategoryService {
	public List<Category> getAllCategories();
	public Category getCategoryById(Integer categoryId) throws CategoryNotFoundException;
	public Category addCategory(Category category);
	public Category updateCategory(Category category);
	public void deleteCategoryById(Integer categoryId);

	

}
