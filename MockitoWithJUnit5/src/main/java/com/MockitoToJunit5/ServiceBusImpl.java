package com.MockitoToJunit5;

import java.util.ArrayList;
import java.util.List;


public class ServiceBusImpl { //Class for Business Logic
	ServiceInterface service; //DECLARES A FIELD TO HOLD "ServiceInterface" Which we will pass and assign our Mock SrrviceInterface
	Student identifiedStudent;                           //variable to take current value of getStudentByID() "returns" (the current Student)- see below
	public ServiceBusImpl(ServiceInterface service) {   //The Constructor accepts an instance of (In our case a "ServiceInterface" Mock
		this.service = service;   //Our Mock(the "ServiceInterface" called service)is passed to the ServiceInterface field -also "service"
	}

	
	public List <Student> getStudentsFilteredByCourse(String course){//THE METHOD TO BE TESTED TAKES A String (course) as a parameter
	       System.out.println("\nSTUDENTS ON Course: " + course);     //Just prints out a description of what is to Happen
		   List <Student> filteredResult = new ArrayList<>();       //Create an ArrayList to hold the filtered result
		   List <Student> getAllStudents = service.retrieveStudents(); //(MOCK)Assign List "getAllStudents to result of a method "retrieveStudents()" of "ServiceInterface that returns ALL students
				   for (Student std : getAllStudents) { //iterate the List getAllStudents and assign Students matching "course" to List "filteredResult"
					   if (std.getCourse().contains(course)) {  //Check they meet the condition before filtering
							filteredResult.add(std);            //if they meet the filter then add them to the filtered list
							System.out.println(std.getID() + ", " +std.getName() + " are on " + course); //Print out id, name, course to console
						}                                                                                //Print not necessary for auto Test
				   }

		return filteredResult; //return the filteredResult

		}
	public List <Student> getStudentsFilteredByScorePass(){//THE METHOD TO BE TESTED RETURNS STUDENTS FILTERED FOR PASSES
	    System.out.println("\nSTUDENT ACHIEVEMENT:");			 //Just prints out a description of what is to Happen
		   List <Student> filteredResultPasses = new ArrayList<>();       //Create an ArrayList to hold the filtered result or passes
		   List <Student> getAllStudents = service.retrieveStudents(); //(MOCK) Assign List "getAllStudents to result of a method "retrieveStudents()" of "ServiceInterface" that returns ALL students
				   for (Student std : getAllStudents) { //iterate the List getAllStudents and assign Students matching "course" to List "filteredResult"
					   if (std.getScore()>= 50) {        //filter for passes
							filteredResultPasses.add(std);    //add to filtered list
							System.out.println(std.getID() +
							", " +std.getName() + " Has passed their score was: " + std.getScore()); //Print to console

						}

					   }
					return filteredResultPasses; //return the filteredResult
				   }
		
		public List <Student> getStudentsFilteredByScoreFail(){//THE METHOD TO BE TESTED RETURNS STUDENTS FILTERED FOR FAILS
		    System.out.println("\nSTUDENT FURTHER WORK REQ'D:");			 //Just prints out a description of what is to Happen
			   List <Student> filteredResultFails = new ArrayList<>();       //Create an ArrayList to hold the filtered result or passes
			   List <Student> getAllStudents = service.retrieveStudents(); //(MOCK) Assign List "getAllStudents to result of a method "retrieveStudents()" of "ServiceInterface" that returns ALL students
					   for (Student std : getAllStudents) { //iterate the List getAllStudents and assign Students matching "course" to List "filteredResult"
						   if (std.getScore()<50) {        //filter or fails
							   filteredResultFails.add(std);     //Print out failures 
								System.out.println(std.getID() // Print the ID and name of matching instances of "Student"
								+ ", " +std.getName() + " Has unfortunately not passed at this time " + std.getScore()); 

						   }
					   }
					return filteredResultFails; //return the filteredResult
			}
	
	public List <Student>getAllStudents(){                  //METHOD RETURNS ALL STUDENTS
		   List <Student>getAllStudents = new ArrayList<>();  //Declare a list to hold all student instances
		        System.out.println("\nSTUDENT INFO:");        //Just describes our intention to console
			    getAllStudents = service.retrieveStudents();  //(MOCK) retrieve all students
		        for (Student std : getAllStudents){          //For loop to print out each students data
			         System.out.println( std.getID()  // Print the ID and name of matching instances of "Student"
			         + ", " + std.getName()
			         + ", " + std.getCourse()
			         +", " + std.getScore());
		             }
		   return getAllStudents;      //Return all students
		   }
	
	  public Student getStudentByID(int ID){     //METHOD TAKES PARAM "int ID" AND RETURNS THE STUDENT ASSOCIATED
		System.out.println("\nINDIVIDUAL STUDENT INFO:");   //Just describes our intention to console
		List <Student>getAllStudents = new ArrayList<>();  //Declare a list to hold all student instances
        getAllStudents = service.retrieveStudents();   //(MOCK) retrieve all students
		for (Student std : getAllStudents){             //for Loops through each Student instance
			std = service.getStudentByID(ID);           //(MOCK) Search for Student with "current ID" assign to std variable
				if(std.getID() == getAllStudents.get(ID).getID()) { //If std's ID matches the ID of the Student instance - Then...
					System.out.println(std.getID()  // Print the ID, name, course & score of current Student assigned to std to console
					+ ", " + std.getName()
					+ ", " + std.getCourse()
					+", " + std.getScore());
					identifiedStudent = std;  //Assign the current Student referenced by std to identifiedStudent Student instance
					break;    //Break out current loop
					}
				else{
					System.out.println("Student ID: " +ID + " Not Found"); //If no Student instance found - Print message to console
					}
			}
          return identifiedStudent;  //Return identifiedStudent

	  }            //Note: The multiple runs are initiated by @ParameterizedTest @ValueSource Data
}
