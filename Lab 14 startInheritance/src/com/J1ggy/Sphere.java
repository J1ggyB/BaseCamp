package com.J1ggy;

import java.awt.Color;
import java.awt.Point;

public class Sphere extends Circle{
	
public Sphere(double radius, Color colour, Point position) {
		super(radius, colour, position);
	}
public double getVolume() {
	double result = Math.pow((4/3)*radius, 3);
	return result;
}
public void printCharacteristics() {
	System.out.println("The characteristics of the Sphere are based on a circle\n");
	super.printCharacteristics();
	System.out.print("\nand the volume of the Sphere is: Volume: " + this.getVolume() + "\n");
}
}
