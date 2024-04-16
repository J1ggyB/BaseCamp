package com.qa.main.jslabs.lab04;

import java.util.Scanner;

public class Lab4 {
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
	
	public void part1() {
		//int sweetPrice = getInt("Price of a bag please (pennies)? ");
		String inputPrice = getString("Price of a bag please (pennies)? ");
		Integer sweetPrice = tryParseInt(inputPrice);
		if (sweetPrice == null || sweetPrice <= 0) {
			System.out.println("The price has to be great than zero.");
			return;
		}

		//int money = getInt("How much money do you have (pennies)? ");
		String inputMoney = getString("How much money do you have (pennies)? ");
		Integer money = tryParseInt(inputMoney);
		if (money == null || money <= 0) {
			System.out.println("The amount of money has to be great than zero");
			return;
		}
		int numBag = money / sweetPrice;
		System.out.printf("If the price is %dp and you have %dp then you will be able to buy %d bags"
				,sweetPrice , money, numBag);
	}
	
	// Copied this from the interweb
	public Integer tryParseInt(String text) {
		try {
			return Integer.parseInt(text);
		} catch (NumberFormatException e) {
			return null;
		}
	}
}