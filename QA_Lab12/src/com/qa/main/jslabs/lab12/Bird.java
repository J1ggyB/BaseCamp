package com.qa.main.jslabs.lab12;

public abstract class Bird extends Animal implements Consumable {

	private String name;
	
	public Bird(String name) {
		this.animalType = AnimalType.Bird;
		this.name = name;
	}
	
	public String describeTaste() {
		return getName() + ": " + "Delicate";
	}
	
	public String isMainCourseDish() {
		return getName() + ": " + true;
	}
	
	public String getName() {
		return this.name;
	}
	
}