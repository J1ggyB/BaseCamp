package com.J1ggy;

import static java.lang.Math.PI;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape{
	public double radius;
	
public Circle(double radius, Color colour, Point position) {
		super(colour,  position);
		this.radius = radius;
	}


public String  getArea() {
	double result = Math.pow((PI * radius), 2);
	String formatResult = String.format("%.2f",result);
	return formatResult;
}
public String getCircumferance() {
	double result = 2 * PI * radius;
	String formatResult = String.format("%.2f",result);
	return formatResult;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public double getDiameter() {
	double result = 2* radius;
	return result;
}
public void printCharacteristics() {
System.out.println("Characteristics of the Circle: \n" 
+ "Area: " + this.getArea() + "\n" 
+ " Circumferance: " + this.getCircumferance() + "\n" 
+ " Radius: " + this.getRadius() + "\n" 
+ " Diameter: " + this.getDiameter()+ "\n" 
+ " Colour: " + this.getColour()+ "\n" 
+ "Position: " + this.getPosition()
);
}
}