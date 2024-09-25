package com.iheritance;

// RacingCar class extends Car
class RacingCar extends Car {
   // private int speed;

    public RacingCar(String make, String model, int noOfWheels) {
        super(make, model, noOfWheels);
    }
    public RacingCar(String make, String model, int noOfWheels, int speed) {
        super(make, model, noOfWheels);
        this.speed = speed;
    }
    // Override accelerate method for faster speed
    @Override
    public void accelerate() {
        System.out.println("Racing car accelerating at high speed!");
    }

    // Print characteristics method
    @Override
    public void printCharacteristics() {
        super.printCharacteristics();
    }
    @Override
	public void printdirection() {
		System.out.println("The racing car is travelling " + direction);
	}
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Racing car speed set to " + speed + " mph.");
    }

    
}