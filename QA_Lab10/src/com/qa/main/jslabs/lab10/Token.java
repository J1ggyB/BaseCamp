package com.qa.main.jslabs.lab10;

public class Token {

	// Instance variables
	private int x;
	private int y;
	private Map map;

	// Static variables
	public static int maxSpeed = 65;

	// Constructor
	public Token(int x, int y, Map map) {
		this.x = x;
		this.y = y;
		this.map = map;
	}

	public boolean move(String direction, int distance) {
		
		if (distance > maxSpeed) {
			System.out.println("Please check data");
			return false;
		}
		
		boolean flag = true;
		// force direction lowercase to ignore case
		switch(direction.toLowerCase()) {
			case "n":
			case "north":
				if (y + distance <= map.getySize()) {
					y += distance;
				} else {
					System.out.println("The token has fallen off the map");
					flag = false;
				}
				break;
			case "s":
			case "south":
				if (y - distance >= 0) {
					y -= distance;
				} else {
					System.out.println("The token has fallen off the map");
					flag = false;
				}
				break;
			case "e":
			case "east":
				if (x + distance <= map.getxSize()) {
					x += distance;
				} else {
					System.out.println("The token has fallen off the map");
					flag = false;
				}
				break;
			case "w":
			case "west":
				if (x - distance >= 0) {
					x -= distance;
				} else {
					System.out.println("The token has fallen off the map");
					flag = false;
				}
				break;
			default:
				System.out.println("Invalid direction");
				flag = false;
			
		}	
		return flag;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}