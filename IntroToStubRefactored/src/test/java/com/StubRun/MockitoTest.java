package com.StubRun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
public class MockitoTest {
 //Create a class to Test our Business implementation
	private ServiceInterface service;  

	private ServiceBusImpl serviceBusImpl; 
    public List <Student> allStudents;  
	@BeforeEach                      
	public void initEach(){

		service = Mockito.mock(ServiceInterface.class);
		serviceBusImpl = new ServiceBusImpl(service);
		DummyClass studentList = new DummyClass();
		this.allStudents = (ArrayList) studentList.retrieveStudents();
	}

	@AfterEach                               
	public void cleanUpEach(){
		service = null;
		serviceBusImpl = null;      
	}								

	@Test
	public void usingAMock() { 
		when(service.retrieveStudents()).thenReturn(allStudents);
		List<Student> students =  serviceBusImpl.getStudentsFilteredByCourse("Woodwork");//call method with parameter "Woodwork"
		assertEquals(3, students.size()); //Use "assertEquals" to double check that it has returned the correct number of instances
	}
	
	public class DummyClass implements ServiceInterface{
		
		private List<Student>students;
	    DummyClass(){   //Constructor
	    	super();
	    	List <Student> students = new ArrayList<>();  //Create an ArrayList to hold Students
	    	this.students = students;  
	    	//Assign the List to our field and populate it
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
	    }
		
	};

}
