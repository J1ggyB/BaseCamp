package com.qa.main.jslabs.lab03;

import java.util.Scanner;

public class Lab3Exercise {

	public void convertInputToStonesPounds(int pounds) {
		System.out.printf("%d Stones and %d Pounds", pounds/14, pounds%14);
	}
	
	public void convertKgsToStonesPounds(int kg) {
		double pounds = kg * 2.20462;
		convertInputToStonesPounds((int)pounds);
		System.out.println();
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
	
	public String theLunchQueue() {
		String mainCourse = getString("What main dish would you like(Fish, Burgers or veg) ? ");
		int qtyRoastPotatoes = getInt("How many roast potatoes would you like? ");
		int qtyBrusselSprouts = getInt("How many Brussel Sprouts would you like? ");
		
		return String.format("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts."
					,mainCourse, qtyRoastPotatoes, qtyBrusselSprouts);
	}

}