package com.J1ggy;

public class Car {
	//--Fields-------------------------
	protected String model;
	protected int speed;
	private int noOfWheels = 0;
	//--Constructor---------------------
	public Car(String model, int speed) {
		super();
		this.model = model;
		this.speed = speed;
	}
	//Another Constructor
	public Car(String model, int speed, int noOfWheels) {//POLYMORPHISM - Method overloading (diff signature)
		super();
		this.model = model;
		this.speed = speed;
		this.noOfWheels = noOfWheels;
	}
	//--Methods-------------------------
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void Accelerate(int secs) {
		this.speed += 5 * secs;
	}
	public void getToSixty() {
		this.speed = 60;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void printDetails() {
		System.out.println("Model: " + model + " Speed: " + speed);
		}
	

}//End Class
