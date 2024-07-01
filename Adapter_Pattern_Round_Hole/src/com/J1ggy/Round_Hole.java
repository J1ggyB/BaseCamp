package com.J1ggy;

public class Round_Hole {
    private double diameter;

    public Round_Hole(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public boolean fits(Round_Peg peg) {
        boolean result = false;
        result = ((peg.getDiameter() >= this.getDiameter() -0.5) &&( peg.getDiameter()<=this.getDiameter()-0.2) );
        return result;
    }
}
