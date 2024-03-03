package com.qa.main.jslabs.lab11;

public class RacingCar extends Car {

	private String driver;
	private int turboFactor;

	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
	
	@Override
	public void accelerate(int seconds) {
		super.accelerate(seconds);
		setSpeed(getSpeed() * turboFactor);
	}

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