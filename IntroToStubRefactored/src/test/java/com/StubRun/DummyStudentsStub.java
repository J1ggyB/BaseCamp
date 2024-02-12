package com.StubRun;

import java.util.ArrayList;
import java.util.List;

import com.StubRun.ServiceInterface;
import com.StubRun.Student;

public class DummyStudentsStub implements ServiceInterface{
	
	private List<Student>students;
    DummyStudentsStub(){   //Constructor
    	super();
    	List <Student> students = new ArrayList<>();  //Create an ArrayList to hold Students
    	this.students = students;                     //Assign the List to our field and populate it
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
    }
    public List<Student>retrieveStudents(){   //IMPLEMENT THE CUSTOMER INTERACE AND RETURN OUR STUDENT DATA
    	return this.students;
    };
	
}


