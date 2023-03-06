package com.categoryApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	@Column(name = "categoryName")
	private String categoryName;
	@Column(name = "categoryDescrition")
	private String categoryDescrition;
	public Category() {
		super();
	}
	public Category(Integer categoryId, String categoryName, String categoryDescrition) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescrition = categoryDescrition;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescrition() {
		return categoryDescrition;
	}
	public void setCategoryDescrition(String categoryDescrition) {
		this.categoryDescrition = categoryDescrition;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescrition="
				+ categoryDescrition + "]";
	}
	
}
