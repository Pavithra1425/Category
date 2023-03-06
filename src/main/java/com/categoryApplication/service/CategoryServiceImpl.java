package com.categoryApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.categoryApplication.dao.CategoryDao;
import com.categoryApplication.entity.Category;
import com.categoryApplication.exception.CategoryNotFoundException;


@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryDao categorydao;


	@Override
	public List<Category> getAllCategories() {
		return categorydao.findAll();
	}

	@Override
	public Category getCategoryById(Integer categoryId) throws CategoryNotFoundException {
		Category c;
		if (categorydao.findById(categoryId).isEmpty()) {
			throw new CategoryNotFoundException();
		} else {
			c = categorydao.findById(categoryId).get();
		}
		return c;
	}

	@Override
	public Category addCategory(Category category) {
		categorydao.save(category);
		return category;
	}

	@Override
	public Category updateCategory(Category category) {
		categorydao.save(category);
		return category;
	}

	@Override
	public void deleteCategoryById(Integer categoryId) {
		@SuppressWarnings("deprecation")
		Category c = categorydao.getById(categoryId);
		categorydao.delete(c);
		
	}

}
