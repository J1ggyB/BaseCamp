package com.J1ggy;

public class Ball {
	public int x, y, w, h;//position width and height
	private int dirX, dirY;//directions
	public static int worldW;//Rectangle width
	public static int worldH;//Rectangle Height
	//------------------------------------------------
	public static void setWorld(int w, int h) {//Static method to update World(Rectangle) for all Balls
		worldW = w;//Rectangle width - The background essentially
		worldH = h;//Rectangle Height 
	}
	//-----------------------------------------------
	public Ball(int x, int y, int w, int h, int dirX, int dirY) {//Constructor
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
	}
	//------------------------------------------------
	public Ball(int x, int y, int w, int h) {//Chained Constructor
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = 20;
		this.dirY = 20;
	}
	//-------------------------------------------------
	public void move() {//Avoids Balls leaving or running over the sides of the World Rectangle
		x += dirX;
		y += dirY;
		if(x<0) {
			dirX = -dirX;
		}
		if(y<0) {
			dirY = -dirY;
		}
		if(x>worldW-w) {
			x=worldW-w;
			dirX = -dirX;
		}
		if(y>worldH-h) {
			y=worldH-h;
			dirY = -dirY;
		}
		
	}
	
}


