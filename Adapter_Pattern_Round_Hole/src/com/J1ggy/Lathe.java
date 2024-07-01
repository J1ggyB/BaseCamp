package com.J1ggy;
// THIS IS THE ADAPTER CLASS - WE EXTEND THE BEHAVIOUR OF Round_Peg TO ACCEPT A SQUARE PEG (For the Lathe -  LOL)
public class Lathe  extends Round_Peg{
	  private Square_Peg peg;

	    public Lathe (Square_Peg peg) {
	        this.peg = peg;
	    }
	    @Override
	    public double getDiameter() {
	    	return this.peg.getWidth();
	    }
}
