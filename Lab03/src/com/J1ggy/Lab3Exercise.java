package com.J1ggy;

import java.util.Scanner; //imports the Scanner library from the java.util Library

public class Lab3Exercise {   //Start of Definition for a class called "Lab3Exercise" (note: "No" Fields, Constructors or main method
//A "Constructor" is a special "Capitalised" method with the same name as the class
//As the name suggests a Constructor method constructs instances of a class
//If no Constructor is supplied a Default Constructor is used
//This is inherited from the Object Class
//All Classes inherit from the Object Class...more on that later...Therefore a Class may not have a constructor method
	
	//-------This classes methods--------------------------------------------------
	//public can be seen from anywhere
	//void has no return statement
	//convertInputToStonesPounds - method name good practice to use the intention as name (note: avoid keywords)
	//(int pounds) is a method argument/parameter - data we pass into the method.
	//In this case we pass in pounds which are divided by 14 to find the weight value in Stones
	//note:pounds%14 gives the remainder note: The %d used inside the "String" are placeholders for the values %d a decimal int %s a string
	public void convertInputToStonesPounds(int pounds) {
		System.out.printf("%d Stones and %d Pounds", pounds/14, pounds%14);
	}
	//Simple conversion of pounds to Kg then call the same method
	public void convertKgsToStonesPounds(int kg) {
		double pounds = kg * 2.20462;
		convertInputToStonesPounds((int)pounds);

	}
//	Takes a prompt param String something like "Please enter an Integer "
// The new Scanner waits for a response then we return that response
	public int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
//Same thing for a String	
	public String getString(String prompt ) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
//Here we call the above methods and return a String with the results	
	public String theLunchQueue() {
		String mainCourse = getString("What main dish would you like(Fish, Burgers or veg) ? ");
		int qtyRoastPotatoes = getInt("How many roast potatoes would you like? ");
		int qtyBrusselSprouts = getInt("How many Brussel Sprouts would you like? ");
		
		return String.format("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts."
					,mainCourse, qtyRoastPotatoes, qtyBrusselSprouts);
	}
//note: With getString() and getInt() we have single responsibility and are working towards our solution.
}