package com.JiggyB;

public class Program {

	public static void main(String[] args) {
		int age = 20;
		String name = "Jas";
		int houseNumber = 54;
		String street = "Eliot Road";
		String postCode = "AB12CD";
		String telephoneNumber = "01234567890";
		String company = "Jas Corp";
		double salary = 1234567.89;
		boolean drivingLicense = true;
		
		System.out.println("Age: " + age);
		System.out.println("Name: " + name);
		System.out.println("House Number: " + houseNumber);
		System.out.println("Street: " + street);
		System.out.println("Post Code: " + postCode);
		System.out.println("Telephone Num: " + telephoneNumber);
		System.out.println("Company: " + company);
		System.out.println("Salary: " + salary);
		System.out.println("Driving License: "+ drivingLicense);
		
		int number = 5;
		System.out.println("Initial Value: " + number);
		// Task 1
		// - double it using the '*' operator
		number = number * 2;
		// - now double it again using the '*=' operator
		number *= 2;
		System.out.println("\n1. After doubling it twice: " + number);

		// Task 2
		// - add 3 to it using the '+' operator
		number = number + 3;
		// - now add 3 to it using the '+=' operator
		number += 3;
		System.out.println("\n2. After adding 3 twice: " + number);

		// Task 3 - subtract 12 from it using an appropriate 'compound' operator
		number -= 12;
		System.out.println("\n3. After subtracting 12: " + number);

		// Task 4 - divide the number (ought to be 14 now) by 3
		// what do you think the answer is
		// Think it will be the whole part, 4
		number = number / 3;
		System.out.println("\n4. After dividing by 3: " + number);

		// Task 5 write 4 different statements that all do the same thing
		// namely 'add 1 to the number'
		number = number + 1;
		number += 1;
		number++;
		++number;
		System.out.println("\n5. After adding 1 four times: " + number);

		// Task 6 decrement by 1 the value of number
		--number;
		System.out.println("\n6. After decrementing once: " + number);
		
		// Task 7 put the remainder when dividing by 3 into 'remainder'
		int remainder = 0;
		remainder = number % 3;
		System.out.println("\n7. Remainder when dividing by 3 is :" + remainder);

		// Task 8 
		// decide what it will print before uncommenting the println()

		int a = 2, b = 3, c = 5;
		double d1, d2, d3, d4;

		d1 = a + b * c / 2; // 5/2=2.5, 3*2=7.5, 7.5+2=9.5
		d2 = (a + b * c) / 2; // 3*5= 15, 15+2=17, 17/2=8.5
		d3 = (a + b) * c / 2; // 2+3=5, 5*5=25, 25/2=12.5
		d4 = (a + b) * (c / 2); // 2+3=5, 5/2=2.5, 5*2.5=12.5
		 System.out.println("\n8. Values: " + d1 + " : " + d2 + " : " + d3
		 + " : " + d4);
		// Type your answer here--> 9.5 : 8.5 : 12.5 : 12.5
		// Actual Answer is --> 9.0 : 8.0 : 12.0 : 10.0
		// Idiot! The divisions are all integers so the results are truncated.
		 
		// Task 9

		int p, q;
		p = 10;
		q = 10;
		p += q++; // p=10+10=20, q=11

		// Decide what the next line will print
		 System.out.println("\n9. Result is: " + (p + q)); // Answer--> 20+11 = 31

		// Task 10 – Uncomment the code below 
		System.out.println("\n11.");

		// Decide what the following 4 lines will print
		// The 4th one might surprise you

		 System.out.println("fred" + 3 + 4); // Answer--> "fred34"
		 System.out.println(3 + 4 + "fred"); // Answer--> "7fred"
		 System.out.println("" + 3 + 4); // Answer--> "34"
		 System.out.println(3 + ' ' + 4); // Answer--> 3 + 32 + 4 = 39
		 
		 // Actually answers are
		 // fred34
		 // 7fred
		 // 34
		 // 39

	}

}
