package labs02;

public class Program {

	public static void main(String[] args) { // main method to start program
		String name = "Graeme Watson"; // Declare and initialise a String referenced name ie: Type String ref name value "Graeme Watson"
		int age = 59; // Declare and initialise an int with value 59 (int = whole number)
		int houseNumber = 172; // declare and initialise (int = whole number)
		String addressLine1 = "Arran Crescent"; // declare and initialise (String - an array of characters)
		String addressLine2 = "East Kilbride"; // declare and initialise  (String) - note: Strings are immutable
		String postCode = "G74 2LB"; // declare and initialise
		String company = "QA Ltd"; // declare and initialise
		String telNo = "7844466621"; // declare and initialise
		double salary = 60000.00; // declare and initialise a double (real number ie: has a decimal point)
		boolean holdCurrDrvLic = true; // declare and initialise a boolean true/false
		System.out.println("My details are: " + "\n----------------\n" + name + "\nage: " + age 
				+ "\n" + houseNumber + " " + addressLine1 + "\n" 
				+ addressLine2 + "\n" + postCode + "\n" + company 
				+ "\nTelNo: " + telNo + "\nSalary: " + salary 
				+ "\nDriving License: " + holdCurrDrvLic);
		// Notice the use of + for concatenation (joining Strings)and \n to create a new line within the String
		// What is different about String to the other data types?
		//Remember "out" is an instance of the class PrintStream that is a property of the System class
		//--------------Maths---------------------------------//
		int number = 5;
		System.out.println("Initial Value: " + number);
		number = number * 2;
		number *= 2;
		// Task 1
		// - double it using the '*' operator
		// - now double it again using the '*=' operator
		System.out.println("\n1. After doubling it twice: " + number);

		// Task 2
		// - add 3 to it using the '+' operator
		// - now add 3 to it using the '+=' operator
		number = number + 3;
		number += 3;
		System.out.println("\n2. After adding 3 twice: " + number);
		

		// Task 3 - subtract 12 from it using an appropriate 'compound' operator
		number -= 12;
		System.out.println("\n3. After subtracting 12: " + number);
		
		// Task 4 - divide the number (ought to be 14 now) by 3
		// what do you think the answer is
		number /= 3;   // The answer should be 4 as number is an integer so will trim
		System.out.println("\n4. After dividing by 3: " + number);
		
		// Task 5 write 4 different statements that all do the same thing
		// namely 'add 1 to the number'
		number = number + 1;
		number += 1;
		number ++;
		++number;
		System.out.println("\n5. After adding 1 four times: " + number);
		/*
		 It makes no difference whilst the statement executes fully on it's own!!!
		 If I combine it with a method such as println(number++) 
		 we get different behaviours???
		 Within println() ++number will increment and print
		 where as number++ will print then increment
		 println() is just a common example of this behaviour.
		 It is down to Java precedence rules - which operations are carried out first?
		 
		 EXTRACT FROM jAVA PRECEDENCE TABLE
		 -----------------------------------------------------------------
		 	++	unary post-increment	left-to-right
         	--  nary post-decrement 	left-to-right
  		 -----------------------------------------------------------------             	
			+	unary plus
			-	unary minus
			!	unary logical NOT
			~	unary bitwise NOT
			++	unary pre-increment		right-to-left
			--	unary pre-decrement 	right-to-left
		 -----------------------------------------------------------------
		 Notice that the post-increment reads left-to-right
		 But the pre-increment reads right to left
		 Within a combination such as println() this affects the point at which
		  the assignment takes place.
		 */
		
		// Task 6 decrement by 1 the value of number
		System.out.println("\n6. After decrementing once: " + --number);
		// The --number decrements before printing (+ is still concatenating Strings)
		
		// Task 7 put the remainder when dividing by 3 into 'remainder'
		int remainder = number;  //Try initialising remainder to number
		remainder = remainder % 3;
		System.out.println("\n7. Remainder when dividing by 3 is :" + remainder);
	
		// Task 8 
		// decide what it will print before uncommenting the println()

		int a = 2, b = 3, c = 5;
		double d1, d2, d3, d4;

		d1 = a + b * c / 2;  
		d2 = (a + b * c) / 2; 
		d3 = (a + b) * c / 2; 
		d4 = (a + b) * (c / 2); 
		System.out.println("\n8. Values: " + d1 + " : " + d2 + " : " + d3
		 + " : " + d4);
		/* Type your answer here-->  9.0, 8.0, 12.0, 10.0
		We have two aspects to consider ~
		 1/ Integers will not hold decimal point data for real numbers 
		 2/ Multiplication and division have higher precedence than Addition and
		 Subtraction and both sets of operators read left to right
		 
		 -----------------------------------------------------------------
		 		 EXTRACT FROM jAVA PRECEDENCE TABLE
		 -----------------------------------------------------------------
			* / % 	multiply/divide	left-to-right	
			+ -+ 	add/subtract	left-to-right
			+		concatenate String
		  ----------------------------------------------------------------	
		*/
		// Task 9

		int p, q;
		p = 10;
		q = 10;
		p += q++;

		// Decide what the next line will print
		System.out.println("\n9. Result is: " + (p + q)); 
		// Answer--> 31   
		// Break it down:
		// post-increment has a higher precedence than the assignment operators
		// however, as it reads left to right it first does the assignment of q
		// as a value of ten and then increments q to 11.
		// p was 10 ----- therefore 10 = 10 + 10 or p is equal to 20
		// The tricky bit is that it looks like q should be 11 but remember that
		// it is flagged as a post operator.(assign first then increment)
		// After the post increment we have p=20 and q=11
		// The System.out.println(p + q) therefore results in 31
		

		// Task 10 – Uncomment the code below 
		System.out.println("\n11.");

		// Decide what the following 4 lines will print
		// The 4th one might surprise you

		System.out.println("fred" + 3 + 4); // Answer-->fred34
		System.out.println(3 + 4 + "fred"); // Answer-->7fred
		System.out.println("" + 3 + 4); // Answer-->34
		System.out.println(3 + ' ' + 4); // Answer-->39  The ASCII value 
		// of the ' ' space character is 32.
		//char sspace = ' '; 
		//int ascii = sspace;
		//System.out.println(ascii);
	}
	
}
;

