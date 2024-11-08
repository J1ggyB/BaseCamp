package com.qa.main.jslabs.lab07;

public class Program2 {

	public static void main(String[] args) {
		// Lab 7 part 2
		Lab7 lab7 = new Lab7();//Print out each item in the original list
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		
		System.out.println("List");
		for (int i : numbers) {
			System.out.printf("%d, ",i);
		}
		System.out.println();//Sort the list and then print out each item
		int[] sorted = lab7.sort(numbers);
		System.out.println("Sorted list");
		for (int i : sorted) {
			System.out.printf("%d, ",i);
		}
		System.out.println();
	}

}


