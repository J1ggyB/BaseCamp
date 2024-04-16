package com.j1ggy;

public class Account {
	int id; 
	double balance; 
	String owner;
	
	public Account(int id, double balance, String owner) {
		super();
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}
	
	void withdraw(double amount) throws IllegalArgumentException  {
		try {
			
				if(amount > this.balance) {
					throw new IllegalArgumentException();
				}
				else {
					this.balance -= amount;
				}
			}catch(Exception e) {
				System.out.println("Insufficient funds");
				e.printStackTrace();
			}finally {this.close();}
	}
	void deposit(double amount)  {
		this.balance += amount;
	}
	void close() {
	System.out.println("account: " + id + " is closed");
	}

	String getDetails() {
		String Details = ("Account: " + id 
							+ ", Owner: " + owner
							+ ", Balance: " + balance);
		return Details;
	}
}
