package com.J1ggy;

import java.awt.*;

public class Program {

	public static void main(String[] args) {
		Point posOne = new Point(10,10);
		Point posTwo = new Point(100,100);
		Point posThree = new Point(500,500);
		
		Sphere mySphere = new Sphere();
		mySphere.setColour(Color.BLUE);
		mySphere.setPosition(posOne);
		mySphere.setRadius(4);
		mySphere.printCharacteristics();
		System.out.println("\n");
		//---------------------------------------
		Circle myCircle = new Circle();
		myCircle.setColour(Color.GREEN);
		myCircle.setRadius(9.86);
		myCircle.setPosition(posTwo);
		myCircle.printCharacteristics();
		System.out.println("\n");
		//-----------------------------------
		Rectangle myRect = new Rectangle();
		myRect.setSides(60, 30);
		myRect.setColour(Color.RED);
		myRect.setPosition(posThree);
		System.out.println(myRect.getCharacteristics());

	}

}
