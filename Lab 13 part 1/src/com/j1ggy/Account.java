package com.j1ggy;

public class Account {
    private int accountNumber;
    private double balance;
    private String accountHolder;

    // Constructor
    public Account(int accountNumber, double initialBalance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolder = accountHolder;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal of " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful");
        }
    }

    // Get account details
    public String getDetails() {
        return "Account Number: " + accountNumber + "\n" +
               "Account Holder: " + accountHolder + "\n" +
               "Current Balance: " + balance;
    }
}
