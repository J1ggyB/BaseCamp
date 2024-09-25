package com.qa.main.jslabs.lab08;

public class Account {//Class from which we can create instances
	//Fields - Note they are private - can only be accessed by instances of this class
	private int id;
	private String owner;
	private double balance;
	//Constructor----------------------------------------------------------------------
	public Account(int id, String owner, double balance) { //Creates  an instance of Account from parameters id, owner, balance
		this.id = id;                                      //sets id            
		this.owner = owner;								   //sets owner      Note use of keyword "this"
		this.balance = balance;                            //sets balance
	}
	//Getters & Setters---------------------------------------------------------------
	public int getId() {             // Set or get each field - Note: public
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
	
  //--Methods---------------------------------------------------------------------------
	
	public void Deposit(double amount) { // If amount greater than 0 add it to the balance
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public void Withdraw(double amount) { //If amount is less than or equal to balance deduct the amount
		if (amount <= balance) {
			balance -= amount;
		}else {System.out.println("You do not have enough funds ");}
		
	}

	public void getDetails() {   // Returns the Account Details
		System.out.println("Account ID: "+getId());
		System.out.println("Owner: "+getOwner());
		System.out.println("Balance: "+getBalance());
	}
	
	public void addInterest() {  // Adds 2.5% interest to balance
		double interestRate = 0.025; // 2.5%
		balance = balance + (balance * interestRate);
	}
}