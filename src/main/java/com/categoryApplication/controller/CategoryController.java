package com.categoryApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.categoryApplication.entity.Category;
import com.categoryApplication.exception.CategoryNotFoundException;
import com.categoryApplication.service.CategoryService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		return this.categoryService.getAllCategories();
	}

	@GetMapping("/categories/{categoryId}")
	public ResponseEntity<Category> getCategoryById(@PathVariable("categoryId") Integer categoryId)
			throws CategoryNotFoundException {
		return new ResponseEntity<Category>(categoryService.getCategoryById(categoryId), HttpStatus.OK);
	}

	@PostMapping("/categories")
	public Category addCategory(@RequestBody Category category) {

		return this.categoryService.addCategory(category);
	}

	@PutMapping("/categories")
	public Category updateCategory(@RequestBody Category category) {
		return this.categoryService.updateCategory(category);

	}

	@DeleteMapping("/categories/{categoryId}")
	public void deleteCategoryById(@PathVariable Integer categoryId) {
		this.categoryService.deleteCategoryById(categoryId);
	}
	

}
