package com.qa.main.jslabs.lab03;

import java.util.Scanner;

public class Program3 {//Start of Class Definition
	// Lab 3 Part 3
	//First consider the getInt()method listed at the bottom
	//Next consider the conversion methods
	//Finally consider the main method() 
//---------------------------------------------------------------------------------------
	public static void main(String[] args) {//Start of main method
		int pounds = getInt("Enter your weight in pounds: ");
		convertInputToStonesPounds(pounds);
		int kilograms = getInt("\nEnter your weight in kilograms: ");
		convertKgsToStonesPounds(kilograms);
	}//End of main method
//---------------------------------------------------------------------------------------	
	//Takes in a int parameter representing a weight in pounds
	//Calculates & prints out the weight in "Stones & Pounds" note use of modulus(% = remainder of division)
	static void convertInputToStonesPounds(int pounds) {
		System.out.printf("%d Stones and %d Pounds", pounds/14, pounds%14);  //14lbs/Stone - :D Lol
	}
	//Takes in a int parameter representing a weight in KGs 
	static void convertKgsToStonesPounds(int kg) {
		double pounds = kg * 2.20462;               //Get the weight in pounds - note use of Double for conversion
		convertInputToStonesPounds((int)pounds);    //note the cast to int and code reuse!
	}
//--------------------------------------------------------------------------------------
	//getInt() takes a String parameter (the user prompt) uses a Scanner to read in their response
	public static int getInt(String prompt) { //pass in the prompt String
		Scanner s = new Scanner(System.in); //print out the prompt (ask the user a question)
			return s.nextInt(); //Read in and return the result
	}
}//End of Class Definition