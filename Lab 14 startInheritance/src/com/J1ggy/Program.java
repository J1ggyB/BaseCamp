package com.J1ggy;

import java.awt.*;

public class Program {

	public static void main(String[] args) {
		Point posOne = new Point(10,10);
		Point posTwo = new Point(100,100);
		Point posThree = new Point(500,500);
		
		Sphere mySphere = new Sphere(4, Color.BLUE, posOne);
		mySphere.printCharacteristics();
		System.out.println("\n");
		System.out.println("\n------------------------------------------------------------\n");
		//---------------------------------------
		Circle myCircle = new Circle(9.86, Color.GREEN, posTwo);
		myCircle.printCharacteristics();
		System.out.println("\n");
		System.out.println("\n------------------------------------------------------------\n");
		//-----------------------------------
		Rectangle myRect = new Rectangle(60, 30, Color.RED, posThree);
		System.out.println(myRect.getCharacteristics());

	}

}
