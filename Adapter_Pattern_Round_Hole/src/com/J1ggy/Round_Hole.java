package com.J1ggy;

public class Round_Hole {  //Class for a round hole
    private double diameter; // field for it's diameter
    
//Constructor______________________________________________________-
    public Round_Hole(double diameter) {   //Constructor simply sets the diameter
        this.diameter = diameter;
    }

    public double getDiameter() {  // Get the Diameter
        return diameter;
    }

    public boolean fits(Round_Peg peg) {  // fits method takes an instance of Round_Peg  and returns a boolean of true if it is a snug fit to the hole
        boolean result = false;
        result = ((peg.getDiameter() >= this.getDiameter() -0.5) &&( peg.getDiameter()<=this.getDiameter()-0.1) );
        return result;
    }
}
