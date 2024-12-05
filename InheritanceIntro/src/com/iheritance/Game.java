package com.iheritance;



public class Game {
    public static void main(String[] args) {
        // Example usage
        RacingCar myRacingCar = new RacingCar("Ferrari", "SF90", 4);
        Car myCar = new Car("Ford", "Fiesta", 4);
        myRacingCar.setSpeed(180);
        myRacingCar.printCharacteristics();
        myRacingCar.accelerate();
        myRacingCar.brake();
        System.out.println("\n--------------------------------------------------------------\n");
        myCar.accelerate();
        myCar.setSpeed(50);
        myCar.brake();
        myCar.printCharacteristics();
        System.out.println("\n--------------------------------------------------------------\n");
        myCar.turnLeft();
        myCar.printdirection();
        myCar.straightenUp();
        myCar.printdirection();
        myCar.reverse();
        myCar.printdirection();
        myRacingCar.turnLeft();
        myRacingCar.printdirection();
        myRacingCar.straightenUp();
        myRacingCar.printdirection();
        }
  }
