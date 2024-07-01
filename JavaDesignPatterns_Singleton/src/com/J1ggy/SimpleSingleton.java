package com.J1ggy;

public class SimpleSingleton {
	//Fields - Note they are private and our instance of "SimpleSingleton" is static
	private static SimpleSingleton instance;
	private String someData;
	
	//Private Constructor - only accessible by the class
	private SimpleSingleton(String someData) {
		this.someData = someData;
	}
	
	//A Public method that calls the Private Constructor only if an instance does not exist
	public static SimpleSingleton getInstance(String someData) {
		if(instance == null) {
			instance = new SimpleSingleton(someData);
		}
		return instance;
	}
	//Public method to print out someData
	public void printSomeData() {
		System.out.println("NON THREAD SAFE: Message from SimpleSingleton: " + someData);
	}
}
