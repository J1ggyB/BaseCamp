package com.qa.main.jslabs.lab03;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// Lab 3 Part 3
		int pounds = getInt("Enter your weight in pounds: ");
		convertInputToStonesPounds(pounds);
		int kilograms = getInt("\nEnter your weight in kilograms: ");
		convertKgsToStonesPounds(kilograms);
	}
	
	static void convertInputToStonesPounds(int pounds) {
		System.out.printf("%d Stones and %d Pounds", pounds/14, pounds%14);
	}
	
	static void convertKgsToStonesPounds(int kg) {
		double pounds = kg * 2.20462;
		convertInputToStonesPounds((int)pounds);
		System.out.println();
	}
	public static int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
			return s.nextInt();
	}
}