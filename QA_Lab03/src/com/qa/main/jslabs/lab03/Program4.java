package com.qa.main.jslabs.lab03;

public class Program4 {

	public static void main(String[] args) {
		// Lab 3 Part 4
		System.out.println("This exercise uses classes\n");
		Lab3Exercise myLab3 = new Lab3Exercise();

		int pounds = myLab3.getInt("Enter your weight in pounds: ");
		myLab3.convertInputToStonesPounds(pounds);
		int kilograms = myLab3.getInt("\nEnter your weight in kilograms: ");
		myLab3.convertKgsToStonesPounds(kilograms);
	}

}
