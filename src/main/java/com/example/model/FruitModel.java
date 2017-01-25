package com.example.model;

public class FruitModel {
	
	String fruit;
	
	String description;
	
	public FruitModel(String fruit,String description){
		this.fruit=fruit;
		this.description=description;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
