package com.qa.main.jslabs.lab03;

public class Program4 {//Start of Class Definition

	public static void main(String[] args) { //Start of main
		// Lab 3 Part 4
		System.out.println("This exercise uses classes\n");//Just printing out a title
		Lab3Exercise myLab3 = new Lab3Exercise();//Creates a new "instance" of the Lab3Exercise class "myLab3"
        //Calls the methods we already know but this time on the "instance variable" myLab3
		int pounds = myLab3.getInt("Enter your weight in pounds: ");
		myLab3.convertInputToStonesPounds(pounds);
		int kilograms = myLab3.getInt("\nEnter your weight in kilograms: ");
		myLab3.convertKgsToStonesPounds(kilograms);
	}//End of main

}//End of Class Definition

//AS AN ASIDE DISCUSSION:  INTERFACES & ABSTRACT CLASSES

//note: if Lab3Exercise implemented an interface (say interface Lab3) that gave us the method signatures
//then we would have Abstraction - ie: the implementation would be hidden.

//An interface is a completely "abstract class" that is used to group related methods with empty bodies

/*interface Lab3{
	    public void convertKgsToStonesPounds(int kg)          interface method (does not have a body)
        public void convertInputToStonesPounds(int pounds)    interface method (does not have a body)
        public int getInt(String prompt)                      interface method (does not have a body)
        public int getInt(String prompt)                      interface method (does not have a body)
	    }                                                                                              
	    SO INTERFACE METHODS ARE IMPLICITLY ABSTRACT
	    Think about a UK WALL SOCKET - It takes three pins Live Neutral and Earth
	    These are a certain size, length spacing etc.
	    If I give that signature to someone who is designing a product then they can implement it.
	    One Designer might come up with a Circular plug with side grips
	    Another Designer may come up with a square plug with an additional USB port
	    USB being a further interface with which they must comply
	    SO INTERFACES ENCOURAGE STANDARDS, CODE REUSE & SHARING.
	    
	    Abstract Classes are more about commonality a Cat & a Dog are both types of Animal (INHERITANCE)
	    ie: Both a Cat and a Dog could inherit characteristics and behaviours from Animal
	    Characteristics could be fields and behaviours methods.
	    We can have both: 
	    1/ Abstract (methods to be defined in the child class) defined methods in an abstract class
	    2 Defined methods which are inherited by all child classes but can be overridden
	    
	    It can be confusing at the outset when to use one and not the other.
	    So - More on this later!
	    */
