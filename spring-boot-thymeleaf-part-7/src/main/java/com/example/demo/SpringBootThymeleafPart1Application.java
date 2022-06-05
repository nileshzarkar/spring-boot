package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo.model"
				 ,"com.example.demo.repository"
				 ,"com.example.demo.service"
				 ,"com.example.demo.controller"})
public class SpringBootThymeleafPart1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafPart1Application.class, args);
	}

}
