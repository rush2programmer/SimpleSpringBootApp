package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootAppApplication.class, args);
	}
	
	@RequestMapping("hello")
	public String Hello(){
		return "Hi I am Gulshan.Checking the Deployed code.";
		
	}
}
