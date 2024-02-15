package com.MockitoToJunit5;

import java.util.ArrayList;
import java.util.List;

public class ControllerClass implements ServiceInterface{  //Controller Class "IMPLEMENTS" ServiceInterface
	List <Student> students;   //Holds the List of Student Data
	Student selectedStudent;   // Holds the instance of Student returned by getStudentByID() method
	ControllerClass(){  //Constructor creates the Student instances and initialises the fields (student & selected student)
	super();
	List <Student> students = new ArrayList<>();  //Create an ArrayList to hold Students
	this.students = students;  
	//Assign the List to our field and populate it
	
	Student student1 = new Student("Bob Smith", "Woodwork", 51); //Create an instance
	student1.setID(students.size()+1); //Student ID's created on the fly
	this.students.add(student1); //Add instance to the "students" ArrayList
	
	Student student2 = new Student("Lucy Brown", "Woodwork", 49);//Create an instance
	student2.setID(students.size()+1);//Student ID's created on the fly
	this.students.add(student2);//Add instance to the "students" ArrayList
	
	Student student3 = new Student("Dan MacLeod", "Sewing", 73);//Create an instance
	student3.setID(students.size()+1);//Student ID's created on the fly
	this.students.add(student3);//Add instance to the "students" ArrayList
	
	Student student4 = new Student("Juliette Mathie", "Fishing", 82);//Create an instance
	student4.setID(students.size()+1);//Student ID's created on the fly
	this.students.add(student4);//Add instance to the "students" ArrayList
	
	Student student5 = new Student("Aarav Khan", "Woodwork",88);//Create an instance
	student5.setID(students.size()+1);//Student ID's created on the fly
	this.students.add(student5);//Add instance to the "students" ArrayList
	
	Student student6 = new Student("Ray Charles", "Piano",100);//Create an instance
	student6.setID(students.size()+1);//Student ID's created on the fly
	this.students.add(student6);//Add instance to the "students" ArrayList
	
	selectedStudent = students.get(0);
	}
	public List<Student>retrieveStudents(){   //IMPLEMENT THE CUSTOMER INTERACE AND RETURN OUR STUDENT DATA
	return this.students;  //initialise selectedStudent
	}
	public Student getStudentByID(int ID) {  //IMPLEMENT THE CUSTOMER INTERACE AND RETURN A STUDENT BY ID
		selectedStudent = students.get(ID);
	    return selectedStudent;
	}
	
}
