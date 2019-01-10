package com.guru.springframework;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5MvcRestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Spring5MvcRestApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("Main is Loaded ");
		
	}
}
