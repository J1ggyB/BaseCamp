package com.j1ggy;
import java.io.IOException;
public class Account {
    private int accountNumber;
    private double balance;
    public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	private String accountHolder;

    // Constructor
    public Account(int accountNumber, double initialBalance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolder = accountHolder;
    }
    

    // Withdraw method
    public void withdraw(double amount) {
    	try {
        if (amount > balance) {
        	throw new  IOException ("Insufficient funds for withdrawal of " + amount );
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful");
        }
    }catch(IOException e) { System.out.println("Insufficient funds for withdrawal of " + amount); e.printStackTrace(); }
     finally {System.out.println("Please re-run your balance is " + balance);}
    }

    // Get account details
    public String getDetails() {
        return "Account Number: " + accountNumber + "\n" +
               "Account Holder: " + accountHolder + "\n" +
               "Current Balance: " + balance;
    }
}
