package com.Jiggy;

import java.util.HashMap;

public class Zoo {
	private HashMap<String, Integer>animalMap = null;//Just a field null until "new" creates instance
	private String[]existingAnimals = {"Zebra","Lion","Lion","Buffalo","Buffalo"};//String Array for Keys
	private String[]newAnimals = {"Polar Bear","Polar Bear","Gazelle",
			"Gazelle","Parrot","Parrot", "Monkey","Monkey", "Monkey","Monkey"};// String Array for Keys
public Zoo() {//Constructor
		super();//Inherit parent properties - In this case Object
		this.animalMap = new HashMap<String, Integer>();//Creates HashMap instance & Assigns to field
		animalMap.put("Zebra", 15);// put(key, value) adds key value pairs to HashMap
		animalMap.put("Buffalo", 20);
		animalMap.put("Lion", 6);
	    addAnimals(existingAnimals);//addAnimals(String[] Array) - method() call
	    addAnimals(newAnimals);
	    displayAnimalData(animalMap);//displayAnimals(HashMap<String, Integer) - method() call
		}


public void addAnimals(String[] animals) {  //Takes a String[] Array
for(String animal : animals) { // For each animal in animals (The String[] Array)
	if(animalMap.containsKey(animal)) { // IF the Key of that animal exists in the HashMap
		int animalCount = animalMap.get(animal); // get the HashMap value (The animal Count)
		this.animalMap.put(animal, animalCount+1); // put() the HashMap value or Count up by 1
	}else {	this.animalMap.put(animal, 1);} // else - add the (Key, value) as a new Key value 1
}
}
public void displayAnimalData(HashMap<String, Integer> animals) {//pass in the HashMap
	for( String i : animals.keySet()) { // Read each key in turn with .keySet()- assigning to i
		System.out.println("We have " +  animals.get(i) + " " + i + "'s");// i is the Key get(i) is the value
	}
}
}
