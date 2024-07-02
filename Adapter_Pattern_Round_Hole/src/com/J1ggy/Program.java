package com.J1ggy;

public class Program {  // Class for the main Program

	public static void main(String[] args) {  // Normal main() method
        // Round fits round, no surprise.
        Round_Hole hole = new Round_Hole(5.0);  // Create an instance of "Round_Hole" called simply "hole" and set its diameter to 5.0mm
        Round_Peg roundPeg = new Round_Peg(4.9);  // Create an instance of "Round_Peg" called simply "roundPeg" and set its diameter to 4.9mm ( a snug fit!!! )
        if (hole.fits(roundPeg)) { // pass our roundpeg to the "fits(roundpeg)" method (Which of course should return true as 4.9mm is a snug fit to 5mm)
            System.out.println("The round peg fits round hole ."); //Unsurprisingly - Print out a positive result - "The round peg fits round hole ."
        }else if(roundPeg.getDiameter() > hole.getDiameter()) {System.out.println("We'll turn that down on the lathe!");} // else if we have a thicker peg - "Turn it down on the Lathe"
        else{System.out.println("Scrap wood i'm afraid");} //else if the peg is thinner than the hole - Report that it is scrap.

        Square_Peg SquarePeg_1 = new Square_Peg(2.5);  //Create an instance of Square_Peg and set its width to 2.5mm (ie: This will be too thin to turn a Round_Peg)
        Square_Peg SquarePeg_2 = new Square_Peg(8.0); //Create an instance of Square_Peg and set its width to 8.0mm (ie: This will be thick enough to turn a Round_Peg)
        // hole.fits(An instance of Squre_Peg); // Won't compile. - Remember the "fits(Round_Peg roundPeg)" method of "hole" expects round pegs - not square pegs!

        // Adapter solves the problem.
        Lathe newPeg_1 = new Lathe (SquarePeg_1 );// Now we wrap the "Square_Peg" instances in instances of "Lathe" - which will provide them with a "getDiameter()" method
        Lathe  newPeg_2 = new Lathe (SquarePeg_2);// Because "Lathe" extends from "Round_Peg"  - The "fits(Round_Peg Lathe instance)" method of "hole" will now compile
        if (hole.fits(newPeg_1)){ // If the first new instance of "Lathe" fits the "hole" -  (Actually it will be too thin) - So returns false
            System.out.println("The first new peg  now fits the round hole"); // Not actioned as false result
        }else if (newPeg_1.getDiameter() > hole.getDiameter()){System.out.println("We'll turn that down on the lathe!");}// else if thick enough (again false) -  "We'll turn that down on the lathe!")
        else {System.out.println("Scrap wood i'm afraid");} // else if still false (Which we are in this case) - Report "Scrap wood i'm afraid"
        if (hole.fits(newPeg_2)){ System.out.println("The second new  peg now  fits the round hole");}// If the second "Lathe" instance 8.0mm fits the hole - (false too thick) - "The second new  peg now  fits the round hole"
        else if (newPeg_2.getDiameter() > hole.getDiameter()){System.out.println("We'll turn that down on the lathe!");} // If the second "Lathe" instance 8.0mm is thicker(true) -  "We'll turn that down on the lathe!"
        else {System.out.println("Scrap wood i'm afraid");} //else - never reached as 2nd "Lathe" instance was thick enough - "Scrap wood i'm afraid"
    }
}

