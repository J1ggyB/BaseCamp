package com.J1ggy;

//----The purpose of an Abstract class - COMMON BEHAVIOUR (Inheritance)
//An abstract class is a class that will act as a parent from which child classes can inherit and "extend" -
public abstract class Animal {  //An abstract class has no instances it simply provides common code for the child classes
	
	//FIELDS------------------------------------------------------
	protected boolean hasTail;
	protected int noOfLegs;
	protected String noise;
//------------------------------------------------------------------------------------------------------
	
	//Abstract class - So NO CONSTRUCTOR REQUIRED
	
	//Two abstract methods-----------------------------------------------------------------
	public abstract void makeNoise();  //This method has no implementation so must be implemented by the child class
	public abstract String move();
	
	//------------------------------------------------------------------------------------------------------
	
	//One implemented method
	public void sleep() {
		System.out.println("ZZZZZZzzzzzz!");
		}
	
}

