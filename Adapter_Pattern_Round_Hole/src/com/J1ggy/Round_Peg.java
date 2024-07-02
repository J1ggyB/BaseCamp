package com.J1ggy;

public class Round_Peg { //Class Round_Peg
    private double diameter;

    public Round_Peg() { // This Constructor will be inherited by the adapter class "Lathe" extends "Round_Peg"
    	super();
    	} 

    public Round_Peg(double diameter) {//Constructor normally used for Round_Peg - Sets the diameter
       super();  
    	this.diameter = diameter;
    }

    public double getDiameter() { // Get method to return the diameter
        return diameter;
}
}
