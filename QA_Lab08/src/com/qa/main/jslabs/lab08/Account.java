package com.qa.main.jslabs.lab08;

public class Account {
	private int id;
	private String owner;
	private double balance;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void Deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public void Withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		}
	}

	public void getDetails() {
		System.out.println("Account ID: "+getId());
		System.out.println("Owner: "+getOwner());
		System.out.println("Balance: "+getBalance());
	}
	
	public void addInterest() {
		double interestRate = 0.025; // 2.5%
		balance = balance + (balance * interestRate);
	}
}