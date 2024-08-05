package com.J1ggy;

public class Sphere extends Circle{
	
public double getVolume() {
	double result = Math.pow((4/3)*radius, 3);
	return result;
}
public void printCharacteristics() {
	System.out.println("The characteristics of the Sphere are:");
	System.out.print("The 2D circular shape is: ");
	super.printCharacteristics();
	System.out.print("and the volume is: Volume: " + this.getVolume() + "\n");
}
}
