package com.J1ggy;

public class Cat extends Animal{

	public Cat() {  //This is a child class of the parent class Animal
		super();    //Means we inherit from the parent in this case Animal which has a sleep() method
		System.out.println("This is the OuterClass");
		System.out.println("Here comes a Cat!!!");
	}	
	
	public void makeNoise() {					//Implements the abstract method makeNoise() inherited from Animal
		System.out.println("Mieeaaaooowwww!");
	}

	public String move() {
		String str = "The cat is prowling!"; //Implements the abstract method move() inherited from Animal
		return str;
	}
	
	public class Bird extends Animal{// An Inner Class ie: The Bird class is inside the Cat class
		
		public Bird() { // Constructor inherits from Animal
			super(); //Call parent Constructor
			System.out.println("\nThis is the Inner Class");
			System.out.println("Eweh it's disgusting in here!");
		}
		
		public void makeNoise() {					//Implements the abstract method makeNoise() inherited from Animal
			System.out.println("Jings i've been swallowed by a Cat!");
		}

		public String move() {
			String str = "The bird is stuck in a fur ball!!!!"; //Implements the abstract method move() inherited from Animal
			return str;
		}


		
	}//End of Bird
}//End of Cat
