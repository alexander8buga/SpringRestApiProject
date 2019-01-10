package com.guru.springframework.service;

import java.util.List;
import java.util.stream.Collectors;

import com.guru.springframework.api.v1.model.CategoryDTO;
import com.guru.springframework.api.v1.mapper.CategoryMapper;
import com.guru.springframework.repositories.CategoryRepository;

public class CategoryServiceImpl implements CategoryService {
	
	private final CategoryMapper categoryMapper;
	private final CategoryRepository categoryRepo;
	
	public CategoryServiceImpl(CategoryMapper categoryMapper, CategoryRepository categoryRopo) {
		this.categoryMapper = categoryMapper;
		this.categoryRepo = categoryRopo;
	}

	public List<CategoryDTO> getAllCategories() {
		
		return categoryRepo.findAll()
				.stream()
				.map(categoryMapper::categoryToCategoryDTO)
				.collect(Collectors.toList());
	}

	public CategoryDTO getCategoryByName(String name) {

		return categoryMapper
				.categoryToCategoryDTO(categoryRepo.findByName(name));
	}
	
}
