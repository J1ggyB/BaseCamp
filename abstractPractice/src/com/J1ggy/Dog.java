package com.J1ggy;

public class Dog extends Animal{  //This is a child class of the parent class Animal

	public Dog() {
		super(); //Means we inherit from the parent in this case Animal which has a sleep() method

	}
	
	Dog(boolean hasTail, int noOfLegs, String noise){
		this.hasTail = hasTail;
		this.noOfLegs=noOfLegs;
		this. noise = noise;
	}
	
	public void makeNoise() {
		System.out.println("Bark Woof Bark! pant pant pant");
	}  //Implements the abstract method makeNoise() inherited from Animal
	
	public String move() {
		System.out.println("The dog is chasing the ball");
		String str = "running about";
		return str;
	}//Implements the abstract method move() inherited from Animal
	
	//completely bespoke method----------------------------------------------------
	public void eating() {
		System.out.println("munch munch");
	}
}
