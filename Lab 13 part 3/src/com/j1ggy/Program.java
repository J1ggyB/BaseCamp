package com.j1ggy;

public class Program {

    public static void main(String[] args) {
        Account firstAccount = new Account(123, 10.00, "Eta Fish");
        System.out.println(firstAccount.getDetails());
        firstAccount.deposit(90);
        System.out.println(firstAccount.getDetails());
		firstAccount.withdraw(50.00);
		firstAccount.withdraw(60.00); // This may cause an exception if insufficient funds - Try withdrawing £10.00

        firstAccount.scanner.close();
    }
   
}
