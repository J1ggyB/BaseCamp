package com.J1ggy;

public class Program {

	public static void main(String[] args) {
SimpleSingleton simpleSingle = SimpleSingleton.getInstance(" Hello  I exist!")	;
simpleSingle.printSomeData();
		
 SingletonClass single = SingletonClass.getInstance(1);
 single.getSomeDataField();

	}
}
