package com.J1ggy;

import java.util.InputMismatchException;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pounds = getInt(scanner, "Enter your weight in pounds: ");
        convertInputToStonesPounds(pounds);
        
        int kilograms = getInt(scanner, "\nEnter your weight in kilograms: ");
        convertKgsToStonesPounds(kilograms);
        
        scanner.close(); // Close the scanner after its final use
    }

    static void convertInputToStonesPounds(int pounds) {
        System.out.printf("%d Stones and %d Pounds", pounds / 14, pounds % 14);
    }

    static void convertKgsToStonesPounds(int kg) {
        double pounds = kg * 2.20462;
        convertInputToStonesPounds((int) pounds);
    }

    public static int getInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        int input;
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume the invalid input
           input = getInt(scanner, prompt);
        }
        return input;
    }
}