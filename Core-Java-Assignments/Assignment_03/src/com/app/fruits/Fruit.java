package com.app.fruits;

public class Fruit {

	String name;
	String color;
	double weight;
	boolean isFresh;
	
	public Fruit() {
		
	}

	public Fruit(String name, String color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = true;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public String case4() {
		return "You have "+name+" in your basket.";
	}
	
	public String case5() {
		return "Name = "+name+" Color = "+color+" Weight = "+weight;
	}
	
	public String taste() {
		return "No specific taste";
	}
}
