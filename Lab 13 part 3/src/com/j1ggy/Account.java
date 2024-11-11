package com.j1ggy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Account {
    int id; 
    double balance; 
    String owner;
    Scanner scanner = new Scanner(System.in);
    public Account(int id, double balance, String owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    void withdraw(double amount) {

        while (true) {  // set up infinite while
            if (amount > this.balance) {//check the user can cover the withdrawal amount
                String message = "Insufficient funds for withdrawal of " + amount + " from account " + id + ". Current balance: " + this.balance;
                System.out.println(message);
                
                // Log the failed withdrawal attempt
                try {
                    log(message);  // log the failure message
                } catch (IOException e) {  // If we cannot access the log file print a message to the Console
                    System.out.println("Error logging message: " + e.getMessage());
                }
                
                // Ask user if they want to retry
                System.out.print("Would you like to retry? (yes/no): ");
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("yes")) {// If the user wants to try again
                    System.out.print("Enter the amount to withdraw: ");
                    try {// Try and scan user input
                        amount = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {//Catch bad input and print out some guidance
                        System.out.println("Invalid amount entered. Please try again.");
                        continue; // Retry the withdrawal - ie: ignore the rest of construct and re-enter the while loop
                    }
                } else {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ok - Thankyou and Good Bye!");
                    break; // Exit the loop


                }
            } else {
                this.balance -= amount;
                String message = "Withdrawal of " + amount + " successful. New balance: " + this.balance;
                System.out.println(message);
                try {
                    log(message);// Try to log  message
                } catch (IOException e) {//If log does not exist
                    System.out.println("Error logging message: " + e.getMessage());
                }
                System.out.println(" Thankyou and Good Bye!");
                break; // Exit the loop after successful withdrawal
            }
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            String message = "Deposit of " + amount + " successful. New balance: " + this.balance;
            System.out.println(message);
            try {
                log(message);
            } catch (IOException e) {
                System.out.println("Error logging message: " + e.getMessage());
            }
        } else {
            String message = "Deposit amount must be positive.";
            System.out.println(message);
            try {
                log(message);
            } catch (IOException e) {
                System.out.println("Error logging message: " + e.getMessage());
            }
        }
    }

    void close() {
        String message = "Account: " + id + " is closed";
        System.out.println(message);
        try {
            log(message);//Try to log message
        } catch (IOException e) {//If log does not exist
            System.out.println("Error logging message: " + e.getMessage());
        }
        // Additional logic to mark the account as closed could be added here
    }

    String getDetails() {
        return "Account: " + id + ", Owner: " + owner + ", Balance: " + balance;
    }

    private void log(String str) throws IOException {
        File file = new File("log.txt");

        // Check if the log file exists
        if (!file.exists()) {
            // Attempt to create the file and log this action
            boolean created = file.createNewFile();
            if (created) {
                String creationMessage = "Log file 'log.txt' successfully created.";
                System.out.println(creationMessage);
                log(creationMessage); // Log the creation message
            } else {
                throw new IOException("Log file is missing and could not be created.");
            }
        }

        // Log the actual message
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(str + "\n");
        }
    }
}



