package com.qa.main.jslabs.lab09;

public class Program {

	public static void main(String[] args) {
		// Lab 9 part 1 and part 2
		Map map = new Map(500, 400);
		Token t1 = new Token(70, 30, map);
		Token t2 = new Token(10, 20, map);
		Token t3 = new Token(100, 200, map);
		
		displayCoord(t1, t2, t3);
		
		System.out.println("Move t1 east by 10");
		t1.move("east", 10);
		displayCoord(t1, t2, t3);

		System.out.println("Move t1 west by 50");
		t1.move("WEST", 50);
		displayCoord(t1, t2, t3);
		
		System.out.println("Move t1 west by 65");
		if (!t1.move("W", 65))
			t1 = null;
		displayCoord(t1, t2, t3);
		
		// Test part 2
		System.out.println("Move t2 east(90) by 100");
		if (!t2.move(90, 100))
			t2 = null;
		displayCoord(t1, t2, t3);
	}

	private static void displayCoord(Token t1, Token t2, Token t3) {
		String tokenCoordText = "Token %s is at: x=%d, y=%d\n";
		if (t1 != null)
			System.out.printf(tokenCoordText, "t1", t1.getX(), t1.getY());
		if (t2 != null)
			System.out.printf(tokenCoordText, "t2", t2.getX(), t2.getY());
		if (t3 != null)
			System.out.printf(tokenCoordText, "t3", t3.getX(), t3.getY());
		System.out.println();
	}

}
