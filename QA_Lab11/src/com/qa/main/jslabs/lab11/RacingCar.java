package com.qa.main.jslabs.lab11;

public class RacingCar extends Car { // Inherits from Car
//Fields
	private String driver;
	private int turboFactor;
// More advanced Constructor sets the driver and Turbo Factor in addition to model and speed
	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
//Override (Polymorphism) the Accelerate method from Car to take account of Turbo Factor	
	@Override
	public void accelerate(int seconds) {
		super.accelerate(seconds);
		setSpeed(getSpeed() * turboFactor);
	}
//Getters & Setters
	public String getDriver() {
		return driver;
	}
	
	private void setDriver(String driver) {
		this.driver = driver;
	}
	
	public int getTurboFactor() {
		return turboFactor;
	}
	
	private void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
}