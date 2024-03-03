package com.qa.main.jslabs.lab05;

import java.util.Scanner;

public class Lab5 {
	public void grades() {
		String inputMark = getString("Enter a grade mark between 1..100 (integer): ");
		Integer mark = tryParseInt(inputMark);
		
		// Check input is valid
		if (mark == null) {
			System.out.println("Error: Value must be an integer");
			return;
		} else if (!(mark > 0 && mark <= 100)) {
			System.out.println("Error: marks must be between 1..100");
			return;
		}
		
		String resultText = "Grade is: %s";
		// Get result
		if (mark >= 71) {
			System.out.printf(resultText, "Distinction");
		}
		else if (mark >= 61 && mark <= 70) {
			System.out.printf(resultText, "Merit");
		}
		else if (mark >= 50 && mark <= 60) {
			System.out.printf(resultText, "Pass");
		}
		else if (mark >= 61 && mark <= 70) {
			System.out.printf(resultText, "Merit");
		}
		else {
			System.out.printf(resultText, "Fail");
		}
	}
	
	public void part2() {
		String inputSummer = getString("Is it Summer time (type 'yes' for true)? ");
		Boolean summer = (inputSummer.equalsIgnoreCase("yes")) ? true : false;
		String inputEvening = getString("Is it early evening (type 'yes' for true)? ");
		Boolean evening = (inputEvening.equalsIgnoreCase("yes")) ? true : false;

		System.out.println("Take a shower");
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
		if(summer && evening) {
			System.out.println("Eat outside");
		} else {
			System.out.println("Eat inside");
		}
		if(summer) {
			System.out.println("Do outdoors hobby");
		} else if(evening) {
			System.out.println("Take a walk");
		}
			
		System.out.println("Contact friends");
	}
	
	// Copied this from the interweb
	public Integer tryParseInt(String text) {
		try {
			return Integer.parseInt(text);
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	public int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public String getString(String prompt ) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}


}