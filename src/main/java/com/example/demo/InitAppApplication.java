package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitAppApplication.class, args);
		System.out.println("Hello World");
	}

}
