package com.StubExample;

import java.util.ArrayList;
import java.util.List;
//THIS IS OUR STUB - PURELY FOR JUNIT TESTING PURPOSES - ie: IT IS THE DATA PROVIDER

public class ServiceInterfaceStub implements ServiceInterface{ // STUB CLASS IMPLEMENTS
	//THE CUSTOMER INTERFACE - THE CUSTOMER IMPLEMENTATION OF DATA PROVISION
	//WILL BE DIFFERENT - ie: possibly retrieval from a database.
	//SO NOTICE THE "ServiceInterfaceStub" class "implements" the "ServiceInterface"
	//REMINDER _ ServiceInterface states that we must have a no parameter method
	// called "retrieveStudents()" which returns a "List" of type "Student"
	
	//FIRST WE CREATE A "new" INSTANCE OF AN "ArrayList" called "students"
	//Nb: ArrayList is a subclass of or is a type of List                              ***STUB IS OUR TEST DATA**********
	
	private List<Student>students = new ArrayList<>();
	
	//THE CONSTRUCTOR FOR THE "ServiceInterfaceStub" CLASS CREATES SIX INSTANCES
	//OF THE STUDENT CLASS AND ASSIGNS THEM TO THE ArrayList "Students"
	public ServiceInterfaceStub() {
		super();
		Student student1 = new Student("Bob Smith", "Woodwork"); //Create an instance
		student1.setID(students.size()+1); //Student ID's created on the fly
		this.students.add(student1); //Add instance to the "students" ArrayList
		
		Student student2 = new Student("Lucy Brown", "Woodwork");//Create an instance
		student2.setID(students.size()+1);//Student ID's created on the fly
		this.students.add(student2);//Add instance to the "students" ArrayList
		
		Student student3 = new Student("Dan MacLeod", "Sewing");//Create an instance
		student3.setID(students.size()+1);//Student ID's created on the fly
		this.students.add(student3);//Add instance to the "students" ArrayList
		
		Student student4 = new Student("Juliette Mathie", "Fishing");//Create an instance
		student4.setID(students.size()+1);//Student ID's created on the fly
		this.students.add(student4);//Add instance to the "students" ArrayList
		
		Student student5 = new Student("Ahmed Khan", "Woodwork");//Create an instance
		student5.setID(students.size()+1);//Student ID's created on the fly
		this.students.add(student5);//Add instance to the "students" ArrayList
		
		Student student6 = new Student("Ray Charles", "Piano");//Create an instance
		student6.setID(students.size()+1);//Student ID's created on the fly
		this.students.add(student6);//Add instance to the "students" ArrayList
		
		//Student ID's created as the size of the ArrayList +1
		//ie: first index position is 0 ~ So + 1 makes the first students ID equal 1
	}

//***IMPORTANT BIT*****
//***HERE WE OVERRIDE THE CUSTOMER INTERFACE BY SIMPLY RETURNING A LIST OF STUDENTS***
	@Override
	public List<Student> retrieveStudents() {

		return this.students;//RETURN OUR STUB ~ Effectively A LIST OF SIX DUMMY USERS
		//Three of which are doing the "Woodwork" course
	}


}

