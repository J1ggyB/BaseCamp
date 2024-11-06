
package com.looper;

public class Looper {

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};	//Declaring an Array with five numbers
		//FOR LOOP TO SEARCH A BASIC ARRAY-----------------------------------------------------------
		System.out.println("FOR LOOP EXAMPLE WITH SWITCH");
		for( int i = 0; i < myArray.length; i++ )// initialise a counter in this case i we will add one each loop set a stop point (i<myArray.length) then iterate i++
		{
		System.out.println(" value at index  i equals: "  + myArray[i] );   //Finds the value at index[i] and prints it out each loop
		switch(myArray[i]) {//Switches the value retrieved each time through the loop and compares the current value to each case until match found
			case 1:
				System.out.println("You have picked one item"); //If the value of myArray[i] matches a case of 1 then print out message and break out of switch
				break;
			case 2:
				System.out.println("You have picked two items");
				break;
			case 3:
				System.out.println("You have picked three items");
				break;
			case 4:
				System.out.println("You have picked four items");
				break;
			default:
				System.out.println("You have picked five items");
		}
		}
        System.out.println("\n\n\t\t-----------------------------------------------------------------------------");
		//-------------------------------------------------------------------------------------------------------------------------
        
        
		//WHILE LOOP TO SEARCH AN ARRAY-------------------------------------------------------------
		System.out.println("WHILE LOOP EXAMPLE");
		int counter = 0;
		while(counter < myArray.length) {
			System.out.println(" value at index counter equals: "  + myArray[counter] );
			counter++;
		}
        System.out.println("\n\n\t\t-----------------------------------------------------------------------------");
		//--------------------------------------------------------------------------------------------------------------------------
        
        
		// DO WHILE LOOP TO SEARCH AN ARRAY--------------------------------------------------------
		System.out.println("DO WHILE  LOOP EXAMPLE");
		int Cnter = 0;
		do{
			System.out.println(" value at index Cnter equals: "  + myArray[Cnter] );
			Cnter++;
			}while(Cnter < myArray.length) ;

        System.out.println("\n\n\t\t-----------------------------------------------------------------------------");
		//------------------------------------------------------------------------------------------------------------------------
        
        //THE NEW FOR EACH LOOP TO SEARCH AN ARRAY---------------------------------------
		System.out.println("FOR EACH LOOP EXAMPLE");
        for(int cnt : myArray) {
        	System.out.println(" value at index counter equals: "  + myArray[cnt-1] );
        }
        //------------------------------------------------------------------------------------------------------------------------
        
        
		//NESTED FOR LOOP-----------------------------------------------------------------------------------------
		System.out.println("NESTED FOR LOOP EXAMPLE");                                                                               //Example  Multi Dimentional Array    int[][] = {{1,2,3},{1,2,3}};
		   // Creating a 2D array with 5 rows and 4 columns         THIS COLUMN                                            //Rows {}     columns{col1,col2,col3} ie: cols are the comma separated parts
        String[][] myMultiDimensionalArray =//Col0      Col1           Col2          Col3 
        	 {    {"\n\t\t|  TABLE  |\t","Column1  |","  Column2  |\t","Column3  |"},   				//Row 0                       Think of it as writing Rows
        		{"\t\t|  Row 1  |","  Col1 Row1  |"," Col2Row1  |"," Col3 Row1  |"},				//Row 1                               
        		{"\t\t|  Row 2  |","  Col1 Row2  |"," Col2 Row2 |"," Col3 Row2  |"},				//Row 2                              
        		{"\t\t|  Row 3  |","  Col1 Row3  |"," Col2 Row3 |"," Col3 Row3  |"},				//Row 3  THIS ROW                 -
        		{"\t\t|  Row 4  |","  Col1 Row4  |"," Col2 Row4 |"," Col3 Row4  |"}    };				//Row 4                    
        System.out.println("\n\n\t\tMULTI DIMENSIONAL ARRAY DISPLAYED AS A TABLE:");                //                                      v
        System.out.println("\t\t----------------------------------------------------------------------------------------");
        for (int i = 0; i < 5; i++) {//This is the number of Rows
            for (int j = 0; j < 4; j++) {//This is running the rows for each column ie: myArray[j] is the columns
            	//The Rows are the comma separated bracketed arrays, The columns are "What is inside each set of brackets ie: the comma separated items in each array
                System.out.print(myMultiDimensionalArray[i][j]);//[Rows][columns]     Notice: Rows is the first set of brackets
            }
         System.out.println("\n\n\t\t-----------------------------------------------------------------------------");

        }
        System.out.println("\n\t\tExample:");
        System.out.println("\t\tThe value of Column 3 Row 2 is:"+ myMultiDimensionalArray[2][3]);  //Count it out as 0-3 Rows and 0-3 Columns (Rows First)
        
         
        }
	}
