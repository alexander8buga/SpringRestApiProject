package com.guru.springframework.service;

import  com.guru.springframework.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * Created by ab on 01/10/18
 */
public interface CategoryService {
	
	List<CategoryDTO> getAllCategories();
	
	CategoryDTO getCategoryByName(String name);
}
