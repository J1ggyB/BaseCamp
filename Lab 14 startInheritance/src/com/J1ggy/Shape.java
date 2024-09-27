package com.J1ggy;

import java.awt.*;
public class Shape {
	public Shape(Color colour, Point position) {
		super();
		this.colour = colour;
		this.position = position;
	}
	Color colour;
	Point position;
	
	//Getters & Setters
	public Color getColour() {
		return colour;
	}
	public void setColour(Color colour) {
		this.colour = colour;
	}
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}

	
}
