package com.J1ggy;

public class Program {

	public static void main(String[] args) {
		Car[] cars = new Car[4];//This is one type of Polymorphism where a type of "RacingCar" is being added to a List of type "Car" -
		Car car1 = new RacingCar("Ferrari", 0, "Fernando Alonzo", 3);  // List happy to accept RacingCar as it inherits from Car and therefore "is a kind of"
		Car car2 = new Car("Hillman Imp", 0);
		Car car3 = new Car("Ford Cortina Mrk III", 0);
		Car car4 = new Car("Fiat Panda", 0, 2);
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		cars[3] = car4;
				
		
		processCars(cars);	
	}
	public static void processCars(Car[]cars) {
		for(Car car: cars) {
			car.getToSixty();    //gets car to sixty
			car.Accelerate(2);     //Car accelerate speed = speed +(5*2) = 70 Then Racing car uses Turbo to *3 = 210
			car.printDetails();
			if(car.getModel() == "Fiat Panda") {
				System.out.print("Number of Wheels that fell off my wee Panda: " + car.getNoOfWheels() + "\n");
			}
			if(car instanceof RacingCar) {     //Check the type of the Car
				RacingCar racer = (RacingCar) car;     // Cast back to type of "RacingCar" to get the full functionality of the subclass
				String drvr = racer.getDriver();
				System.out.println("Driver: " + drvr);

			}
		}
	}
}