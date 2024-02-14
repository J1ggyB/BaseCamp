package com.StubRun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
public class MockitoTest {			         //Create a class to Test our Business implementation
	@Mock
	private ServiceInterface service;        //Create fields: "ServiceInterface service" is the customers interface 
	private ServiceBusImpl serviceBusImpl;                // "ServiceBusImpl serviceBusImpl" is our business logic
    private List <Student> allStudents;                   // "List allStudents" will hold our Student data
    //So the idea is we mock the "ServiceInterface" "INTERFACE" as a mock INSTANCE of a "ServiceInterface" CLASS
    //we can't normally instances of an interface...and we don't know how the customer will implement
    //we do know the ServiceInterface will have a method List<Student> retrieveStudents()
    //This is the behaviour we need to supply with our mock
	@BeforeEach                      
	public void initEach(){
        //Here we:
		// 1] Pass the mock as a parameter to an new instance of ServiceBusImpl() "our business logic class"
		// 2] Populate our "allStudents" List
		
		//service = Mockito.mock(ServiceInterface.class);  //Note: With MockitoAnnotations we don't need the mock instance
		serviceBusImpl = new ServiceBusImpl(service);
		DummyClass studentList = new DummyClass();
		this.allStudents = (studentList.retrieveStudents());
	}

	@AfterEach                               //Cleans up after each test
	public void cleanUpEach(){
		service = null;
		serviceBusImpl = null; 

	}								

	@Test
	public void usingAMock() { 
		//***THE CLEVER BIT*****
		//Tell the mock that when the mock gets a method call of retrieveStudents()then return the List
		MockitoAnnotations.openMocks(this);
		when(service.retrieveStudents()).thenReturn(allStudents);
		List<Student> students =  serviceBusImpl.getStudentsFilteredByCourse("Woodwork");//call method with parameter "Woodwork"
		assertEquals(3, students.size()); //Use "assertEquals" to double check that it has returned the correct number of instances
	}
	
	public class DummyClass implements ServiceInterface{    // A Dummy Class to hold the data until required
		
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
