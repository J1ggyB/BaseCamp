package com.iheritance;

//Abstract Vehicle class - THE PURPOSE OF AN ABSTRACT CLASS IS TO DEFINE THE COMMON CHARACTERISTICS OF SUBCLASSES
 public abstract class Vehicle {



private String make;
 private String model;
 private int noOfWheels;

 public Vehicle(String make, String model, int noOfWheels) {
     this.make = make;
     this.model = model;
     this.noOfWheels = noOfWheels;
 }

 // Getters and setters for make, model, and noOfWheels
 // ...

 // Abstract method to be implemented by subclasses
 public abstract void accelerate();

 // Print characteristics method
 public void printCharacteristics() {
     System.out.println("Make: " + make);
     System.out.println("Model: " + model);
     System.out.println("Number of Wheels: " + noOfWheels);
 }
}