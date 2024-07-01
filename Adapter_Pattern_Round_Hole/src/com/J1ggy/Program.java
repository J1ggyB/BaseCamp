package com.J1ggy;

public class Program {

	public static void main(String[] args) {
        // Round fits round, no surprise.
        Round_Hole hole = new Round_Hole(5.0);
        Round_Peg roundPeg = new Round_Peg(4.8);
        if (hole.fits(roundPeg)) {
            System.out.println("The round peg fits round hole .");
        }else if(roundPeg.getDiameter() > 5.2) {System.out.println("We'll turn that down on the lathe!");}
        else{System.out.println("Scrap wood i'm afraid");}

        Square_Peg SquarePeg_1 = new Square_Peg(2.5);
        Square_Peg SquarePeg_2 = new Square_Peg(8.0);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        Lathe newPeg_1 = new Lathe (SquarePeg_1 );
        Lathe  newPeg_2 = new Lathe (SquarePeg_2);
        if (hole.fits(newPeg_1)){
            System.out.println("The first new peg  now fits the round hole");
        }else if (newPeg_1.getDiameter() > hole.getDiameter()){System.out.println("We'll turn that down on the lathe!");}
        else {System.out.println("Scrap wood i'm afraid");}
        if (hole.fits(newPeg_2)){ System.out.println("The second new  peg now  fits the round hole");}
        else if (newPeg_2.getDiameter() > hole.getDiameter()){System.out.println("We'll turn that down on the lathe!");}
        else {System.out.println("Scrap wood i'm afraid");}
    }
}

