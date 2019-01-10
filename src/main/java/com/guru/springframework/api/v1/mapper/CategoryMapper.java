package com.guru.springframework.api.v1.mapper;

import com.guru.springframework.api.v1.model.CategoryDTO;
import com.guru.springframework.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 
 * @author ab
 * Created on 01/09/18
 */
@Mapper
public interface CategoryMapper {
	
	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
	CategoryDTO categoryToCategoryDTO(Category category);
	
}
