package com.J1ggy;

import java.util.Scanner;

public class Program {   //new Class Program

	public static void main(String[] args) { //Contains a main() method - So program starts here
		// Lab 3 Part 1
		int aNumber = getInt("Enter an integer: "); //call getInt() and assign result to int aNumber
		String text = getString("Enter a string: "); //call getString() and assign it to String text
		
		System.out.printf("The int is %d. The string is %s ", aNumber, text); //print out "aNumber" and "text"
		
	}// End of main()
	//note:return type is int
	public static int getInt(String prompt) {  //Definition of getInt() - Takes a prompt String as param
		System.out.println(prompt);            //prints out the prompt to "Enter an Integer"
		Scanner s = new Scanner(System.in);    //Scanner waits for keyboard response
			return s.nextInt();                //Returns the user input as an int
	}
	//note the return type is String
	public static String getString(String prompt ) {  //Similar to getInt() but this time String return 
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
			return s.nextLine();
	}

		
}