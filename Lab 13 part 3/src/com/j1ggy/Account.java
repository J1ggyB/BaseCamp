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

        while (true) {
            if (amount > this.balance) {
                String message = "Insufficient funds for withdrawal of " + amount + " from account " + id + ". Current balance: " + this.balance;
                System.out.println(message);
                
                // Log the failed withdrawal attempt
                try {
                    log(message);
                } catch (IOException e) {
                    System.out.println("Error logging message: " + e.getMessage());
                }
                
                // Ask user if they want to retry
                System.out.print("Would you like to retry? (yes/no): ");
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("yes")) {
                    System.out.print("Enter the amount to withdraw: ");
                    try {
                        amount = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount entered. Please try again.");
                        continue; // Retry the withdrawal
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
                    log(message);
                } catch (IOException e) {
                    System.out.println("Error logging message: " + e.getMessage());
                }
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
            log(message);
        } catch (IOException e) {
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



