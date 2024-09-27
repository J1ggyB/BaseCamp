package com.J1ggy;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape {
public Rectangle(double sideA, double sideB, Color colour, Point position) {
		super(colour, position);
		this.sideA = sideA;
		this.sideB = sideB;
	}
double sideA;
double sideB;

public double getArea() {
	double result = sideA * sideB;
	return result;
}
public double getCircumference() {
	double result = (2 * sideA)+(2 * sideB);
	return result;
}
public String getCharacteristics() {
	String result = "Characteristics of the Rectangle are: "
			+ " Area: "  + this.getArea() + "\n"
			+ " Length: " + sideA+ "\n"
			+ " Width: " + sideB+ "\n"
			+ " Circumference: " + this.getCircumference()+ "\n"
			+ " Colour: " + this.getColour()+ "\n"
			+ " Position: "+ this.getPosition() + "\n";
	
	return result;
}
public void setSides(double Length, double Width) {
	this.sideA = Length;
	this.sideB = Width;
}
}

