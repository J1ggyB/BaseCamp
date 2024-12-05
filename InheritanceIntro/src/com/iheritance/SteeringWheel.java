package com.iheritance;    //AN INTERFACE IS ALL ABOUT SETTING REQUIRED STANDARDS THAT THE CLASS "MUST" IMPLEMENT TO FIT THE SYSTEM - plug & play

public interface SteeringWheel {
	
	public String turnLeft();  // Changes  Car,di
	public String turnRight();
	public String straightenUp();
	public String reverse();
	public void printdirection() ;
	public void accelerate() ;
	 public void brake();
	 public void setSpeed(int speed);
	 public int getSpeed();
	 public void printCharacteristics() ;
}
