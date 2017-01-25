package com.example.controller;

import java.util.ArrayList;

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
	public ArrayList<FruitModel> getAllFruit(){
		
		ArrayList<FruitModel> fruitList=new ArrayList();
		
		FruitModel model=new FruitModel("Mango","Too good");
		FruitModel model1=new FruitModel("Banana","Too good do you think so");
		
		fruitList.add(model);
		fruitList.add(model1);
		return fruitList;
		
		
	}

}
