package com.J1ggy;

public class Program {  //The idea of a Singleton class is to create one and only one instance of a class

	public static void main(String[] args) {   //Here we are constucting one and only one instance of a SimpleSingleton Class ...and one and only one instance of a Singleton Class
SimpleSingleton simpleSingle = SimpleSingleton.getInstance(" Hello  I exist!")	;   // Notice we are using a method to call a PRIVATE Constructor rather than a Constructor
simpleSingle.printSomeData(); // method to print the contents of the PRIVATE "someData" field of the instance of SimpleSingleton
//***	Note the above class is not Thread safe.	

// *** A better way
 SingletonClass single = SingletonClass.getInstance(1);// Again - Notice we are using a method to call a PRIVATE Constructor rather than a Constructor
 single.getSomeDataField();  // method to print the contents of the PRIVATE "someDataField" field of the instance of SingletonClass
// Note if you examine the Singleton Class it uses a lock to prevent alternative constructions occurring at the same time
 //Look at the line 19 of our Singleton Class  - synchronized(SingletonClass.class ){ //synchronised creates a lock allowing only one thread  to execute
 //This is therefore a Thread safe version of the same Pattern
	}
}
