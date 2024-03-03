package com.qa.main.jslabs.lab11;

public class Car {

	private String model;
	private int speed;

	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	public void accelerate(int seconds) {
		this.speed += 5 * seconds;
	}

	public void getToSixty() {
		this.speed = 60;
	}
	
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