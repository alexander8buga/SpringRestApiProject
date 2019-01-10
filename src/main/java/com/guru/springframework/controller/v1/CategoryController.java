package com.guru.springframework.controller.v1;

import com.guru.springframework.service.CategoryService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

}
