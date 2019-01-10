package com.guru.springframework.controller.v1;

import com.guru.springframework.service.CategoryService;
import com.guru.springframework.api.v1.model.CategoryDTO;
import com.guru.springframework.api.v1.model.CategoryListDTO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * Created on 01/10/18
 * @author ab
 *
 */
@Controller
@RequestMapping("api/v1/categories")
public class CategoryController {
	
	private final CategoryService categoryService; 
	
	public CategoryController(CategoryService categoryService) {
		this.categoryService  = categoryService;
	}
	
	@GetMapping
    public ResponseEntity<CategoryListDTO> getallCatetories(){

        return new ResponseEntity<CategoryListDTO>(
                new CategoryListDTO(categoryService.getAllCategories()), HttpStatus.OK);
    }

    @GetMapping("{name}")
    public ResponseEntity<CategoryDTO> getCategoryByName( @PathVariable String name){
        return new ResponseEntity<CategoryDTO>(
                categoryService.getCategoryByName(name), HttpStatus.OK
        );
    }

}
