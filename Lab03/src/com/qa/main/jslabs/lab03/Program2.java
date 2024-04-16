package com.qa.main.jslabs.lab03;

import java.util.Scanner;            //note: fields and methods are jointly known as members of the class

public class Program2 {  //Start of Class declaration - pay close attention to method parameters & returns
	//note: No fields
	public static void main(String[] args) {  //Start of main
		// Lab 3 Part 2
		String order = theLunchQueue(); //Calls theLunchQueue()method which prompts the user and returns a String
		System.out.println(order); //Prints the String result returned from theLunchQueue()to the Console  
	} // end of main
	//--------------------------------------------------------------------------------------------
	//The methods getInt() and getString() take a String param (the prompt), use a Scanner to collect user
	public static int getInt(String prompt) {          //input and return either an int or a String.
		System.out.println(prompt);                    //These methods are used in theLunchQueue() method
		Scanner s = new Scanner(System.in);            //To prompt the user or choices and build a String
			return s.nextInt();                        //return that will represent their choices
	}

	public static String getString(String prompt ) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
			return s.nextLine();
	}
	//--------------------------------------------------------------------------------------------
	//theLunchQueue prompts the user three times and concatenates their response to a return String
	public static String theLunchQueue() {
		String mainCourse = getString("What main dish would you like(Fish, Burgers or veg) ? ");
		int qtyRoastPotatoes = getInt("How many roast potatoes would you like? ");
		int qtyBrusselSprouts = getInt("How many Brussel Sprouts would you like? ");
		
		return String.format("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts."
					,mainCourse, qtyRoastPotatoes, qtyBrusselSprouts);
		
	}
}//End of Program Class
