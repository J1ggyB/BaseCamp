package com.qa.main.jslabs.lab08;

public class Program {

	public static void main(String[] args) {
		// Lab 8 part 1
		Account account1 = new Account(1, "Jas", 0); //Creates Account ID 1 for Jas with 0 balance 
		System.out.println("Account: " + account1.getId()); // print Account 1
		System.out.println(); //prints a newline
		account1.Deposit(100); //Deposit
		account1.Withdraw(50); //Withdraw
		account1.getDetails();  //check Balance
		
		// Lab 8 part 2
		Account myAccount = new Account(2, "John", 100); //rinse and repeat - This time add some interest
		System.out.println("Account: " + myAccount.getId());
		System.out.println();
		myAccount.addInterest();
		myAccount.getDetails();
		
		// Refers to the same account. Memory address value is passed in - creates a second reference to the same object on the heap (reference is on stack)
		Account partnerAccount = myAccount;
		partnerAccount.addInterest();
		partnerAccount.getDetails();
		
		//Memory address value is passed in
		Account myAccount2 = new Account(3, "Luis", 100); //new creates a new instance of the class on the heap and returns the address
		System.out.println("Account: " + myAccount2.getId()); // returns the value found at the address of Account2 ID
		System.out.println();
		processAccount(myAccount2);
		myAccount2.getDetails();

		//The value (100) is passed in ie: value placed on the stack
		int k=100;
		incInt(k); //k is on the stack so is passed by value
		System.out.println("incInt(k): " + k);
		System.out.println();
	}

	public static void processAccount(Account acc) {  // static method applies to the Class
		acc.addInterest();
	}
	
	private static void incInt(int x) { //x passed by value
		x++;
		System.out.println("does not affect variable k" +x);
		}

}