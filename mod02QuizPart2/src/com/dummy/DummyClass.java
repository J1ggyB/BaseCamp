package com.dummy;


public class DummyClass {

	public static void main(String[] args) {

		int x = 9, y = 4;
		boolean result;
		int Z;
		String W;
		//1-----------------------------------------------(9 > y + 4)
		result =( x > y + 4 );
		System.out.println(result);
		System.out.println("Test 1 - x is: " + x + " y is: "+ y + "\n");
		
		//2-----------------------------------------------(x > y++ * 2) Post-Increment "y" to 5
		result = ( x > y++ * 2 ); // y++ is y=y+1          Think of it as (9 > 4 * 2) 
		System.out.println(result);                       // Then increment y to 5
		System.out.println("Test 2 - x is: " + x + " y is: "+ y + " Think about this! \n");
		
		System.out.println("Surely if y is incremented to 5 x 2 = 10 so 9 is not greater??? Why does it return true???\n");
		
		//3-----------------------------------------------(x >y++ *2)  Pre-Increment "y" to 5
		y = 4;   //Reset y to 4 to see the difference     (9 > 5 *2) 
		result = ( x > ++y * 2 );
		System.out.println(result);
		System.out.println("Test 3 - x is: " + x + " y is: "+ y + "\n");
		
		//4-----------------------------------------------y is now 5 so 9 x 5 = 45 (not 9 x 4 =36)
		result = ( x * y <= 36);
		System.out.println(result);
		System.out.println("Test 4 - x is: " + x + " y is: "+ y + "\n");
		
		//5-----------------------------------------------
		result =( x / y == 1 );
		System.out.println(result);
		System.out.println("Test 5 - x is: " + x + " y is: "+ y + "\n");
		
		//6----------------------------------------------- The "%" modulus operator returns division "remainder"
		Z=( x % y);
		System.out.println(Z);
		System.out.println("Test 6 - x is: " + x + " y is: "+ y + "\n");
		
		//7-----------------------------------------------
		W=( (x > y) ? "Worm" : "Words" );
		System.out.println(W);
		System.out.println("Test 7 - x is: " + x + " y is: "+ y + "\n");
		//End-----------------------------------------------
	}	

}
