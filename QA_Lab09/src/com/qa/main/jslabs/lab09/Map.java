package com.qa.main.jslabs.lab09;

public class Map {
	private int xSize;
	private int ySize;
	public int getxSize() {
		return xSize;
	}
	public void setxSize(int xSize) {
		this.xSize = xSize;
	}
	public int getySize() {
		return ySize;
	}
	public void setySize(int ySize) {
		this.ySize = ySize;
	}
	
	public Map(int xSize, int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
	}
}
