package com.J1ggy;

public class NestedFor {

	public static void main(String[] args) {
	       // Creating a 2D array with 5 rows and 4 columns         THIS COLUMN
        String[][] myArray =//Col0      Col1           Col2          Col3 
        	 {{"\n\t\t|  TABLE  |\t","Column1  |","  Column2  |\t","Column3  |"},   //Row 0
        		{"\t\t|  -----  |\t","-------  |","  -------  |\t","-------  |"},					//Row 1
        		{"\t\t|  Row 1  |","  Col1 Row1  |"," Col2Row1  |"," Col3 Row1  |"},				//Row 2
        		{"\t\t|  Row 2  |","  Col1 Row2  |"," Col2 Row2 |"," Col3 Row2  |"},				//Row 3
        		{"\t\t|  Row 3  |","  Col1 Row3  |"," Col2 Row3 |"," Col3 Row3  |"},				//Row 4    THIS ROW
        		{"\t\t|  Row 4  |","  Col1 Row4  |"," Col2 Row4 |"," Col3 Row4  |"}};				//Row 5
        System.out.println("\n\n\t\tMULTI DIMENSIONAL ARRAY DISPLAYED AS A TABLE:");
        System.out.println("\t\t--------------------------------------------------" + "\tYEAH BABY!!!");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
            	//System.out.println("\n");
                System.out.print(myArray[i][j]);
            }
         System.out.println("\n\n\t\t--------------------------------------------------");

        }
        System.out.println("\n\t\tExample:");
        System.out.println("\t\tThe value of Column 3 Row 3 is:"+ myArray[4][3]);  //Count it out as 0-3 Rows and 0-3 Columns (Rows First)
        
        //New Exercise:
        System.out.println("\n\nTHE ARRAY QUIZ: ");
        int i = 0;
        int j = 0;
        for(i = 0; i <3; i++) {
        	System.out.println("OuterLoop " + i);
        	for(j =0; j<5; j++) {
        		System.out.println("InnerLoop "+ j);
        	}
        	System.out.println("Exited InnerLoop i equals: " + i + " j equals: " + j );
        }
        System.out.println("Exited OuterLoop i equals: " + i + " j equals: " + j );
        System.out.println("i*j " + ((i-1)*(j-1)));
        System.out.println("Actually after exiting the final time i*j equals: " + (i*j));
    }
} 