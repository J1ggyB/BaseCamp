package com.qa.main.jslabs.lab03;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// Lab 3 Part 2
		String order = theLunchQueue();
		System.out.println(order);
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
	
	public static String theLunchQueue() {
		String mainCourse = getString("What main dish would you like(Fish, Burgers or veg) ? ");
		int qtyRoastPotatoes = getInt("How many roast potatoes would you like? ");
		int qtyBrusselSprouts = getInt("How many Brussel Sprouts would you like? ");
		
		return String.format("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts."
					,mainCourse, qtyRoastPotatoes, qtyBrusselSprouts);
		
	}
}
