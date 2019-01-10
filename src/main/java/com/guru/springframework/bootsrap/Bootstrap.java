package com.guru.springframework.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.guru.springframework.domain.Category;
import com.guru.springframework.repositories.CategoryRepository;

@Component
//CommandLineRunner help to run application on start up
public class Bootstrap implements CommandLineRunner{
	
	private CategoryRepository categoryRepository;
	
	public Bootstrap(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public void run(String... args) throws Exception {
		Category fruits = new Category();
		fruits.setName("Fruits");
		
		Category dried = new Category();
		dried.setName("Dried");
		
		Category fresh = new Category();
		fresh.setName("Fesh");
		
		Category nuts = new Category();
		nuts.setName("Nuts");
		
		categoryRepository.save(fruits);
		categoryRepository.save(dried);
		categoryRepository.save(fresh);
		categoryRepository.save(nuts);
		
		System.out.println("Data Loaded "+ categoryRepository.count());
		
	}

}
