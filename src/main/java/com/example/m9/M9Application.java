package com.example.m9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example*")
public class M9Application {

	public static void main(String[] args) {
		SpringApplication.run(M9Application.class, args);
	}

}
