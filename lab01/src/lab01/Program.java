
// All code should be well commented so that others can quickly see your intentions
// Single line comments start with "//" two forward slashes
/* Multiple line comments open with "/*" slash asterisk
... and close with asterisk slash ...*/


package lab01;// The package is a place to group related classes (ie: code structures)

// A class is a template/blueprint used to describe objects (a car, a student etc)
// An object is a particular "instance" of a class ( that single BMW, Brian Smith etc)



public class Program {  /* Every program needs a class with a main method 
	this is where execution starts */
	
	// Note the class name "Program" in this case is capitalised
	
	// The "main()" method (a method of the class Program is lower case
	
	//public - Means that the method is accessible (or visible) by all other classes
	
	//static - Means that it is a class method & there will be no instances of it
	// An example will be that there will be only one "main()method or the program"
	
	// void - Means that the method main will run but not return a value on completion
	
	/* Items enclosed in the brackets are parameters or arguments that can be passed
	   into the main method - think of a command line program with a command like:
	   ipconfig /all /release /renew (/all /release & /renew can be thought of 
	   as arguments or parameters of a command ipconfig  */

	public static void main(String[] args) {   // The main method           
		
			System.out.println("Hello World"); //Each statement must be terminated by ;
		    System.out.println("My name is Figsuffer Burningboom");
		    // Thoughts - So "System" must be a class it is capitalised
		    // ... and "println()" looks like a method it is lower case
		    // So what is "out" ????
		    /* The answer is that classes also have fields or properties
		       A car has wheels a Student has a name etc
		       The System class has a field defined as a type of PrintStream
		       PrintStream is another class
		       Each System object contains an "instance" of a PrintStream class
		       called out
		       So printLn() is actually a method of the PrintStream class which
		       in turn has an instance that is a member of the System class.
		     */
		    
		     // Quite a lot to take in but we will cover things in more detail - Lol
		     
	}
}




/* EXAMPLE OF A CLASS___________________not code


class Student{  
  
_____________________Student attributes fields members_________________not code
 
 int studentID;
 String name;  

__________________________Methods______________________________________not code

_____________The constructor method__________notice capitalisation_____not code

 
 public Student(int studentID, String name,){
 
  
_______________________this keyword refers to itself___________________not code

   this.studentID = studentID;
   this.name = name;
 }
 
 someOtherMethod(){
 }
 
}    __________________End of Class Declaration_________________________
          
*/
