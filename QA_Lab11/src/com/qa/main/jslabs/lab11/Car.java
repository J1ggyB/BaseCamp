package com.qa.main.jslabs.lab11;

public class Car { //Class Car
//Fields
	private String model;
	private int speed;
//Constructor
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
//Read in int parameter and speed up	
	public void accelerate(int seconds) {
		this.speed += 5 * seconds;
	}
//Set the speed to sixty
	public void getToSixty() {
		this.speed = 60;
	}
//Getters & Setters	
	public String getModel() {
		return model;
	}
	
	private void setModel(String model) {
		this.model = model;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}