package com.j1ggy;

public class Program {

	public static void main(String[] args) {
		Account firstAccount = new Account(123, 100.00, "Eta Fish");
		System.out.println(firstAccount.getBalance());
		firstAccount.withdraw(50.00);
		String accDetails = firstAccount.getDetails();
		System.out.println(accDetails);
		firstAccount.withdraw(60.00);
		accDetails = firstAccount.getDetails();
		System.out.println(accDetails);
		
	}

}
