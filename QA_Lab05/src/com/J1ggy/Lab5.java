package com.J1ggy;

import java.util.Scanner;

public class Lab5 {
	Scanner s = new Scanner(System.in);
	public void grades() {
		String inputMark = getString("Enter a grade mark between 1..100 (integer): "); //Calls getString() with user prompt assigns to inputMark
		Integer mark = tryParseInt(inputMark); //Calls tryParseInt with inputMark to check user input is an integer
		
		// Check input is valid
		if (mark == null) {         // Check the mark is not null 
			System.out.println("Error: Value must be an integer");//- report is input is bad
			return;
		} else if (!(mark > 0 && mark <= 100)) {// Check the mark is not 0 
			System.out.println("Error: marks must be between 1..100");
			return;
		}
		
		String resultText = "Grade is: %s"; //Create the common part of the answer with a placeholder for the variable - as a String
		// Get result
		if (mark >= 71) {										//Check marks and print suitable answer by replacing placeholder
			System.out.printf(resultText, "Distinction");  
		}
		else if (mark >= 61 && mark <= 70) {
			System.out.printf(resultText, "Merit");
		}
		else if (mark >= 50 && mark <= 60) {
			System.out.printf(resultText, "Pass");
		}
		else {
			System.out.printf(resultText, "Fail");
		}
		s.close();
	}
	
	public void part2() {
		String inputSummer = getString("Is it Summer time (type 'yes' for true)? "); //Calls getString() with user prompt assigns to inputSummer
		Boolean summer = (inputSummer.equalsIgnoreCase("yes")) ? true : false;       // Assign Boolean Summer based on value of inputSummer
		String inputEvening = getString("Is it early evening (type 'yes' for true)? "); //Calls getString() with user prompt assigns to inputEvening
		Boolean evening = (inputEvening.equalsIgnoreCase("yes")) ? true : false;   // // Assign Boolean evening based on value of inputEvening

		System.out.println("Take a shower");  //print
		// Straight forward way
//		if(summer) {
//			if(evening) {
//				System.out.println("Eat outside");
//				System.out.println("Do outdoors hobby");
//			} else {
//				System.out.println("Eat inside");
//				System.out.println("Do outdoors hobby");
//			}
//		} else {
//			if(evening) {
//				System.out.println("Eat inside");
//				System.out.println("Take a walk");
//			} else {
//				System.out.println("Eat inside");
//			}
//		}
		
		// Concise way
		if(summer && evening) {   // if summer and evening variables are both true
			System.out.println("Eat outside");
		} else {
			System.out.println("Eat inside");
		}
		if(summer) {                      //if just summer is true
			System.out.println("Do outdoors hobby");
		} else if(evening) {
			System.out.println("Take a walk");
		}
			
		System.out.println("Contact friends"); //print
	}
	

	public Integer tryParseInt(String text) { //Checks String (User input) can be converted to an integer
		try {
			return Integer.parseInt(text);
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	public int getInt(String prompt) { //Sends a prompt to user and returns an int (their response)
		System.out.println(prompt);
		int rtn = s.nextInt();
		return rtn;
	}
	
	public String getString(String prompt ) {  //Sends a prompt to user and returns a String (their response)
		System.out.println(prompt);
		String retn = s.nextLine();
		return retn;
	}


}