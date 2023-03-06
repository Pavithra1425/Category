package com.categoryApplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
	@ExceptionHandler(value = CategoryNotFoundException.class)
	public ResponseEntity<String> CategoryNotFound(CategoryNotFoundException e) {
		return new ResponseEntity<>("Category Not Found", HttpStatus.NOT_FOUND);
	}
}