package com.J1ggy;

public class SingletonClass {
	
// Fields
	private static volatile SingletonClass instance;  // volatile indicates that a thread may not have finished instantiating
	private int someDataField;
//-------------------------------------------------------------------------------------------------------------------------	
	
//Private Constructor - Can only be called by instances of the  Class SingletonClass
	private SingletonClass(int someData) {
		this.someDataField = someData;
	}
//--------------------------------------------------------------------------------------------------------------------------
//Public method to call Private Constructor
	public static SingletonClass getInstance(int someData) {
		SingletonClass theInstance = instance;    //get the existing instance if there is one
		if (theInstance == null) {
			synchronized(SingletonClass.class ){ //synchronised creates a lock allowing only one thread  to execute
				theInstance = instance;  // check if a thread has created an instance meantime
				if(theInstance == null) { //If still none
					instance = theInstance = new SingletonClass(someData); // Statically call private Constructor
				}
			}
		}
		System.out.println("THREAD SAFE: Message from SingletonClass I have successfully been instantiated! ");
	return theInstance;  //return the single instance
}
	//--------------------------------------------------------------------------------------------------------------------------
	
	//Public  method that accesses the data field
	public void getSomeDataField() {
		System.out.println("someDataField is: " + someDataField);
	}
	//-------------------------------------------------------------------------------------------------------------------------
}//End of Class

//Note: "theInstance is a local variable used to hold the single instance of SingletonClass that is created"