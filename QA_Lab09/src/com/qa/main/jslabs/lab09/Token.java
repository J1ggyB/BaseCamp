package com.qa.main.jslabs.lab09;

public class Token {
	private int x;
	private int y;
	private Map map;
	private static int maxSpeed = 65;
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
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	
	public Token(int x, int y, Map map) {
		this.x = x;
		this.y = y;
		this.setMap(map);
	}
	
	boolean move(int directionInt, int distance) {
		String direction = null;
		switch(directionInt) {
			case 0:
				direction = "north";
				break;
			case 90:
				direction = "east";
				break;
			case 180:
				direction = "south";
				break;
			case 270:
				direction = "west";
				break;
		}
		return move(direction, distance);
	}
	
	boolean move(String direction, int distance) {
		if (distance > maxSpeed) {
			System.out.println("Please check data");
			return true; // True so we don't delete the Token
		}

		boolean isValidMove = false;
		String invalidMoveText = "The token has fallen off the map";

		switch(direction.toLowerCase()) {
			case "north": case "n":
				if (getY() + distance < map.getySize()) {
					setY(getY() + distance);
					isValidMove = true;
				} 
				break;
			case "south": case "s":
				if (getY() - distance >= 0) {
					setY(getY() - distance);
					isValidMove = true;
				}
				break;
			case "east": case "e":
				if (getX() + distance < map.getxSize()) {
					setX(getX() + distance);
					isValidMove = true;
				}
				break;
			case "west": case "w":
				if (getX() - distance >= 0) {
					setX(getX() - distance);
					isValidMove = true;
				}
				break;
		}
		if (!isValidMove) {
			System.out.println(invalidMoveText);
		}
		return isValidMove;
	}
}