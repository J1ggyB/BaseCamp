package com.J1ggy;

public class Car {
	//--Fields-------------------------
	protected String model;
	protected int speed;
	private int noOfWheels = 0;
	//*****************************************POLYMORPHIC CONSTRUCTORS***************************************************************************
	//--Constructor---------------------
	public Car() {//POLYMORPHISM - Method overloading (Same name diff signature ie: different list of parameters)
		super();
	}
	public Car(String model, int speed) {// POLYMORPHISM - Method Overloading (Same Name differnt signature ie: different list of parameters)
		super();
		this.model = model;
		this.speed = speed;
	}
	//Another Constructor
	public Car(String model, int speed, int noOfWheels) {//POLYMORPHISM - Method overloading (Same name diff signature ie: different list of parameters)
		super();
		this.model = model;
		this.speed = speed;
		this.noOfWheels = noOfWheels;                                                       //-------------------THREE DIFFERENT SIGNATURES TO THE Car() CONSTRUCTOR------------------------------------
	}
	//*********************************************END OF POLYMORPHIC CONSTRUCTORS*************************************************************
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
