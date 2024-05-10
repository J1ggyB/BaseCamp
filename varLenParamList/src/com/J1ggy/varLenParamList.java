package com.J1ggy;

public class varLenParamList {

	public static void main(String[] args) {
    
		aLotOfParams("Dougie","Alphonso","Sarah","Eta Fish","Dr Seus","Mickey","Jim","Francis");

	}//End Main
	public static void aLotOfParams(String... names) {
		System.out.printf("Lets's print those param's: ");
		for(String name : names) {
			System.out.print(name + " ");
		}
	}
}
