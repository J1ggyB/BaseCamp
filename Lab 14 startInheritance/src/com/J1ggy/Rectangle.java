package com.J1ggy;

public class Rectangle extends Shape {
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
			+ " Area: "  + this.getArea()
			+ " Length: " + sideA
			+ " Width: " + sideB
			+ " Circumference: " + this.getCircumference()
			+ " Colour: " + this.getColour()
			+ " Position: "+ this.getPosition() + "\n";
	
	return result;
}
public void setSides(double Length, double Width) {
	this.sideA = Length;
	this.sideB = Width;
}
}

