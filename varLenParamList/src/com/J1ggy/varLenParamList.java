package com.J1ggy;



//TWO SEPERATE SMALL EXAMPLES 
// 1 - Passing a variable length lost of parameters
// 2 - Overriding the toString() method inherited from object
public class varLenParamList {

	public static void main(String[] args) {
    //---A variable length parameter list
		aLotOfParams("Dougie","Alphonso","Sarah","Eta Fish","Dr Seus","Mickey","Jim","Francis");// just a lot of strings
		//---------------------------------------------------------------------------------------------------------
		
		//--Just to show you can override the "Object" default toString()method - can give clearer logs
        StudentTest ST = new StudentTest(14,"George");
         System.out.println(ST.toString());
	}//End Main
	
	
	//Define the method to make use of the variable length list of parameters-------------------------------------
	public static void aLotOfParams(String... names) {   // uses ... to indicate we don't know how many strings will be passed
		System.out.printf("Lets's print those param's: ");
		for(String name : names) {
			System.out.print(name + " ");
		}//End for
	}//End of aLotOfParams()
}//End Class
