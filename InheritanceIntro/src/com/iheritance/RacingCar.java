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
   System.out.println("The speed is: "+ speed);     
   System.out.println("Car is accelerating...");
     speed += 20;
     System.out.println("The speed is: "+ speed);     
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
@Override
public void brake() {
	System.out.println("The car was travelling at: " + speed);
    System.out.println("Car is braking...");
    speed = speed/2;
    System.out.println("The car is slowing down: " +speed);
    speed = 0;
    System.out.println ("The car has stopped");
}
    
}