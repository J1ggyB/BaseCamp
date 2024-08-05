package com.J1ggy;

public class NestedFor {

	public static void main(String[] args) {
		
		
		//------------------------------------------------------------------------------------------------------------------------------
	       // Creating a 2D array with 5 rows and 4 columns         THIS COLUMN
        String[][] myArray =//Col0      Col1           Col2          Col3 
        	 {    {"\n\t\t|  TABLE  |\t","Column1  |","  Column2  |\t","Column3  |"},   				//Row 0                       Think of it as writing Rows
        		{"\t\t|  Row 1  |","  Col1 Row1  |"," Col2Row1  |"," Col3 Row1  |"},				//Row 1                               
        		{"\t\t|  Row 2  |","  Col1 Row2  |"," Col2 Row2 |"," Col3 Row2  |"},				//Row 2                              
        		{"\t\t|  Row 3  |","  Col1 Row3  |"," Col2 Row3 |"," Col3 Row3  |"},				//Row 3  THIS ROW                 
        		{"\t\t|  Row 4  |","  Col1 Row4  |"," Col2 Row4 |"," Col3 Row4  |"}    };				//Row 4                    
        System.out.println("\n\n\t\tMULTI DIMENSIONAL ARRAY DISPLAYED AS A TABLE:");                //                                      v
        System.out.println("\t\t----------------------------------------------------------------------------------------" + "\tYEAH BABY!!!\n\n");
        for (int i = 0; i < 5; i++) {//This is the number of Rows
            for (int j = 0; j < 4; j++) {//This is running the rows for each column ie: myArray[i] is the columns
            	//The Rows are the comma separated bracketed arrays, The columns are "What is inside each set of brackets ie: the comma separated items in each array
                System.out.print(myArray[i][j]);//[Rows][columns]     Notice: Rows is the first set of brackets
            }
         System.out.println("\n\n\t\t-----------------------------------------------------------------------------");

        }
        System.out.println("\n\t\tExample:");
        System.out.println("\t\tThe value of Column 3 Row 2 is:"+ myArray[2][3]);  //Count it out as 0-3 Rows and 0-3 Columns (Rows First)
        
        //New Exercise:Quiz---------------------------------------------------------------------------------------------------------
        System.out.println("\n\nTHE ARRAY QUIZ: ");
        int i = 0;
        int j = 0;
        for( i = 0; i <3; i++) {
        	System.out.println("OuterLoop " + i);
        	for( j =0; j<5; j++) {
        		System.out.println("InnerLoop "+ j);
        	}//Exit Inner loop
        	System.out.println("Exited InnerLoop i equals: " + i + " j equals: " + j );
        }//Exit outer loop
        System.out.println("Exited OuterLoop i equals: " + i + " j equals: " + j );
        System.out.println("i*j " + ((i-1)*(j-1)));
        System.out.println("Actually after exiting the final time i*j equals: " + (i*j) + "\n\n");
        
        //SIMPLE ITERATION THROUGH AN ARRAY-----------------------------------------------------------------------------------------------------
        String[] stringArray = new String[3];
        stringArray[0]= "Hello";
        stringArray[1]= "Hello";
        stringArray[2]= "Hello2";
        System.out.println(stringArray[2]);
        
        int[] arrayName = {7,4,9};
        for(int a = 0; a < arrayName.length; a++) {   //Notice length is a field not a method() - Lack of brackets
        	System.out.println("Listing the arrays contents: " + arrayName[a]);
        }
       //-------------------------------------------------------------------------------------------------------------------------------------- 
    }//End of main
} //End of Class



//                                                  0uter1             Outer2                    Outer3
//int[] [] numbers = {    {1,2,3,4,5}  ,   {6,7,8,9,10}   ,   {11,12,13,14,15}      };


