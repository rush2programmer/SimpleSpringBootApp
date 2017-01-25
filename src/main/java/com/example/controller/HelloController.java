package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.FruitModel;

@RestController
public class HelloController {
	
	@RequestMapping("hello")
	public String Hello(){
		return "Hi I am Gulshan.Checking the Deployed code.";
		
	}
	
	@RequestMapping("getAllFruit")
	public FruitModel getAllFruit(){
		
		FruitModel model=new FruitModel("Mango","Too good");
		return model;
		
		
	}

}
