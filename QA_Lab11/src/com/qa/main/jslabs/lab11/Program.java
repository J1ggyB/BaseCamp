package com.qa.main.jslabs.lab11;

public class Program {
	public static void main(String[] args) {

		Car[] cars = { 
				new Car("Audi", 0), 
				new Car("Merc", 0), 
				new RacingCar("Mclaren", 0, "Alonzo", 5),
				new RacingCar("Pagani", 0, "Lewis", 4) 
		};
		
		processCars(cars);
	}

	// Static Method
	public static void processCars(Car[] carArray) {
		
		for (Car car : carArray) {
			car.getToSixty();
			car.accelerate(2);
			
			System.out.printf("The %s is going %d MPH \n", car.getModel(), car.getSpeed());
			
			if (car instanceof RacingCar) {
				RacingCar rCar = (RacingCar) car;
				System.out.printf("The driver's name is %s \n", rCar.getDriver());
			}
		}
	}
}