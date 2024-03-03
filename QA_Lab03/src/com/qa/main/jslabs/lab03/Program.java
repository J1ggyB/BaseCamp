package com.qa.main.jslabs.lab03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Lab 3 Part 1
		int aNumber = getInt("Enter an integer: ");
		String text = getString("Enter a string: ");
		
		System.out.printf("The int is %d. The string is %s ", aNumber, text);
		
	}
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
			return s.nextInt();
	}
	
	public static String getString(String prompt ) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
			return s.nextLine();
	}
	public static void theLunchQueue() {
		
	}
}