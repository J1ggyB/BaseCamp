package com.j1ggy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Account {
    int id; 
    double balance; 
    String owner;
    String err;
    
    public Account(int id, double balance, String owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;

    }
    
    void withdraw(double amount) {
        if (amount > this.balance) {
            String message = "Insufficient funds for withdrawal of " + amount + " from account " + id;
            System.out.println(message);
            try {
                	log(message);
            	    } catch (IOException e) {
            	    	System.out.println(err =e.getMessage());
            }
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + this.balance);
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of " + amount + " successful. New balance: " + this.balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void close() {
        System.out.println("Account: " + id + " is closed");
        // Additional logic to mark the account as closed could be added here
    }

    String getDetails() {
        return "Account: " + id + ", Owner: " + owner + ", Balance: " + balance;
    }

    private void log(String str) throws IOException {
        File file = new File("log.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
        	if(err == null) { err = "No exception thrown at this time";}
            writer.write("Error: " + err + "\n");
           
        }
    }
}

