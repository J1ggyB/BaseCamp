package com.qa.main.jslabs.lab10;

public class Plane extends Token {
	// This value is never actually used, because the move() method exists only in the superclass Token
	// So even when you called move() from a Plane object, it uses the Token class implementation
	// and therefore uses the Token classes static value of maxSpeed.
	// If you want to have these derived classes use their own maxSpeed values, you either need to:
	// A) Override the move method in the dervied classes, so they each have their own implementation
	// B) Make maxSpeed an instance variable, not static, and have the child classes set their own values
	public static int maxSpeed = 360;

	private int height;

	public int getHeight() {
		return height;
	}

	public Plane(int x, int y, Map map, int height) {
		super(x, y, map);
		this.height = height;
	}

	public void climb(int howHigh) {
		this.height += howHigh;
	}

	public void land() {
		this.height = 0;
	}

}