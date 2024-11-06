package com.qa.main.jslabs.lab04;

import java.util.Scanner;

public class Lab4 {
	Scanner s = new Scanner(System.in);
	
/*	public int getInt(String prompt) {   // This method is not required!!!
		System.out.println(prompt);
		return s.nextInt();
	} */
		public String getString(String prompt ) { // Takes a String parameter to use as a user prompt
		System.out.println(prompt); //Prints out the Parameter so the user is prompted to respond
		return s.nextLine(); // Uses the scanner to capture the user input (which will be a String) and return this to the caller.
	}
	
	public void part1() {
		String inputPrice = getString("Price of a bag please (pennies)? "); //Calls getString with a prompt message as a parameter.
		Integer sweetPrice = tryParseInt(inputPrice); // Takes the String we got back and calls tryParseInt(with user input String)
		if (sweetPrice == null || sweetPrice <= 0) { // SweetPrice should now be an int - check if null or 0
			System.out.println("The price has to be great than zero.");//Warn user if input is bad
			return;
		}


		String inputMoney = getString("How much money do you have (pennies)? "); ////Calls getString with a prompt message as a parameter.
		Integer money = tryParseInt(inputMoney);// Takes the String we got back and calls tryParseInt(with user input String)
		if (money == null || money <= 0) {// SweetPrice should now be an int - check if null or 0
			System.out.println("The amount of money has to be great than zero");//Warn user if input is bad
			return;
		}
		int numBag = money / sweetPrice; //Calculate how many bags they can buy
		System.out.printf("If the price is %dp and you have %dp then you will be able to buy %d bags" //format a String for final output
				,sweetPrice , money, numBag);                                                         //...and print it out
		s.close();  //Close the Scanner
		}
	

	public Integer tryParseInt(String text) {   //Take in a String
		try {									//Use a try/catch block (Exception Handling) 
			return Integer.parseInt(text);		//Try to parse the String to int and return the int
		} catch (NumberFormatException e) {     //If it fails to parse catch the exception - close the Scanner and return null
			//e.printStackTrace();
			s.close();
			return null;
		}
	}
}