package com.StubRun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestServiceBusImplWithStub{  //Create a class to Test our Business implementation
	public DummyStudentsStub allStudents = new DummyStudentsStub();  //CREATE A STUB THAT RETURNS ALL STUDENTS


	private ServiceBusImpl serviceBusImpl; //Create an instance of the class "ServiceBusImpl"
	                                       //Which ~ PROVIDES OUR BUSINESS LOGIC
	                                   //ie:(CONTAINS THE METHOD "getStudentsFilteredByCourse()" THAT WE WANT TO TEST)


	@BeforeEach                      //Things to happen before each Unit Test
	public void initEach(){
		serviceBusImpl = new ServiceBusImpl(allStudents); //CREATE A "serviceBusImpl" PASSING IN OUR STUB DATA "allstudents"
	}

	@AfterEach                               //Things to do after each unit test is run (We only have one Unit Test
	public void cleanUpEach(){
		serviceBusImpl = null;      // Drop the service and serviceBusImpl instances
	}								// If we keep them then they hold data and may adversely affect subsequent tests

	@Test
	public void usingAStub() { //Tests the getStudentsFilteredByCourse() method using a STUB
		List<Student> students =  serviceBusImpl.getStudentsFilteredByCourse("Woodwork");//call method with parameter "Woodwork"
		assertEquals(3, students.size()); //Use "assertEquals" to double check that it has returned the correct number of instances
	}


}
