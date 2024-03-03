package com.qa.main.jslabs.lab10;

public class Submarine extends Token {

	public static int maxSpeed = 15;

	private int depth;

	public Submarine(int x, int y, Map map, int depth) {
		super(x, y, map);
		this.depth = depth;

	}

	public int getDepth() {
		return depth;
	}

	public void dive(int howDeep) {
		this.depth += howDeep;
	}

	public void surface() {
		this.depth = 0;
	}
}
