package com.qa.main.jslabs.lab11;

public class Program {
	public static void main(String[] args) {

		Car[] cars = {                       //DECLARE & INITIALISE AN ARRAY OF 4 CAR/RACINGCAR INSTANCES
				new Car("Audi", 0), 
				new Car("Merc", 0), 
				new RacingCar("Mclaren", 0, "Alonzo", 5),
				new RacingCar("Pagani", 0, "Lewis", 4) 
		};
		
		processCars(cars); //Call method to process cars passing in array
	}

	// Static Method
	public static void processCars(Car[] carArray) { //processCars() method to move the Cars
		
		for (Car car : carArray) {   // For each Car get to 60 then accelerate
			car.getToSixty();
			car.accelerate(2);
			
			System.out.printf("The %s is going %d MPH \n", car.getModel(), car.getSpeed()); //Print out models and speeds
			
			if (car instanceof RacingCar) { //If it is a RacingCar 
				RacingCar rCar = (RacingCar) car; // Cast the car to a RacingCar
				System.out.printf("The driver's name is %s \n", rCar.getDriver()); // Print out the driver's name
			}
		}
	}
}