package com.J1ggy;

public interface StudentInterface {
	
	public static final String responsibleBody = "SQA"; // In an interface static content has to be public
	
	public static String getResponsibileBody() { // final static method does not need overriding - sets responsible body as SQA
		return responsibleBody;
	}
	public static String University = null; // In an interface static content has to be public
	
	public static String setUni(String University) { // provides a static method to be overridden by each Uni to the Universities Name
		return University;
	}	
String getStudentState(Student s);	// method to return full details on a current Student ie: Uni, ID, fName, lName,Course
int getID();  //getters and setters
void setID(int iD);
String getfName();
void setfName(String fName);
String getlName();
void setlName(String lName);
String getCourse();
void setCourse(String Course);
}
//THINK OF YOUR INTERFACE AS A SET OF INSTRUCTIONS ON HOW TO BUILD YOUR CLASS
// The keyword final is the non-access modifier so prevents inheritance and overriding
//In our case the SQA is always going to be our awarding body - this is a final decision
//Each University will want a static description for "Their" description - but this will be set by them

//Interfaces are "Completely" abstract so we do not require the "abstract keyword"

// We are setting the rules of interaction ie: by defining message signatures.
// This means our code will be very flexible we can replace a class with the same signature without affecting
// the rest of the system (the class implementation is hidden from a system perspective)

// Above we can see that we will have:
//Fields:
//responsibleBody, University, ID, fName, lName and Course
//We can see the variable types ie: int ID, String fName
//We have our method signatures showing return types and parameters etc