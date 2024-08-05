package com.J1ggy;

import static java.lang.Math.PI;

public class Circle extends Shape{
public double radius;

public double getArea() {
	return Math.pow((PI * radius), 2);
}
public double getCircumferance() {
	double result = 2 * PI * radius;
	return result;
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
System.out.println("Characteristics of the Circle: " 
+ "Area: " + this.getArea() 
+ " Circumferance: " + this.getCircumferance()
+ " Radius: " + this.getRadius()
+ " Diameter: " + this.getDiameter()
+ " Colour: " + this.getColour()
+ "Position: " + this.getPosition()
);
}
}