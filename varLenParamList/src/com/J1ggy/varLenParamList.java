package com.J1ggy;

public class varLenParamList {

	public static void main(String[] args) {
    
		aLotOfParams("Dougie","Alphonso","Sarah","Eta Fish","Dr Seus","Mickey","Jim","Francis");// just a lot of strings
         StudentTest ST = new StudentTest(14,"George");
         System.out.println(ST.toString());
	}//End Main
	public static void aLotOfParams(String... names) {
		System.out.printf("Lets's print those param's: ");
		for(String name : names) {
			System.out.print(name + " ");
			System.out.println(System.out.toString());
		}
	}
}
