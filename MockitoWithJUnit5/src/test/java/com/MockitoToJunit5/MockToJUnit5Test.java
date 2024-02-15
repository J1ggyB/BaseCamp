package com.MockitoToJunit5;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

	
    @ExtendWith(value = {MockitoExtension.class}) 
    // @TestInstance(value=Lifecycle.PER_CLASS)
    @TestInstance(value=Lifecycle.PER_METHOD) 

	public class MockToJUnit5Test {	 //OUR TEST CLASS TO HOLD TESTS
		private ServiceBusImpl serviceBusImpl;     //Field to hold instance of our business logic           
	    private List <Student> allStudents;        //Field to hold a List of our Students
    	
		@Mock                       //We need to (MOCK) the customer/other Dev Teams service
		private ServiceInterface service;        

 	    @InjectMocks
	    private ControllerClass controller; //Our controller class holds all the Test data
 	    
		@BeforeEach                      
		public void initEach(){                           //Set up initial conditions
			serviceBusImpl = new ServiceBusImpl(service);   //pass the (MOCK) service into our business model class
			this.allStudents = controller.retrieveStudents(); //Retrieve the Student List from our controller
		}

		@AfterEach                              
		public void cleanUpEach(){    //Tidy up after each Test - avoids one test affecting the other - Not strictly necessary
			service = null;
			serviceBusImpl = null; 
		}								

		@Test
		public void usingAMockToGetStudentsByCourse() { 
			//***THE CLEVER BIT*****
			//Tell the mock that when the mock gets a method call of retrieveStudents()then return the List allStudents
			when(service.retrieveStudents()).thenReturn(allStudents);
			List<Student> students =  serviceBusImpl.getStudentsFilteredByCourse("Woodwork");//call method with parameter "Woodwork"
			assertEquals(3, students.size()); //Use "assertEquals" to double check that it has returned the correct number of instances
		}
		
		@Test
		public void usingAMockToGetStudentsWhoHavePassed() { 
			//Tell the mock that when the mock gets a method call of retrieveStudents()then return the List allStudents
			when(service.retrieveStudents()).thenReturn(allStudents);
			List<Student> students =  serviceBusImpl.getStudentsFilteredByScorePass();//call method To find who has passed
			assertEquals(5, students.size()); //Use "assertEquals" to double check that it has returned the correct number of instances
		}
		
		@Test
		public void usingAMockToGetStudentsWhoHaveFailed() { 
			//Tell the mock that when the mock gets a method call of retrieveStudents()then return the List allStudents
			when(service.retrieveStudents()).thenReturn(allStudents);
			List<Student> students =  serviceBusImpl.getStudentsFilteredByScoreFail();//call method to find who has failed
			assertEquals(1, students.size()); //Use "assertEquals" to double check that it has returned the correct number of instances
		}
		
		@Test
		public void usingAMockToGetStudentsInfo() { 
			//Tell the mock that when the mock gets a method call of retrieveStudents()then return the List allStudents
			when(service.retrieveStudents()).thenReturn(allStudents);
			List<Student> students = serviceBusImpl.getAllStudents(); //Call "getAllStudents()" to process or serviceBusImpl - Mainly outputs to console
			assertEquals(6,students.size()); //Use "assertEquals" to double check that it has returned the correct number of instances
		}
		//THIS TIME WE NEED TO PASS PARAMETERS _ EACH VALUE BEING A SEPARATE TEST
		@ParameterizedTest                        // A parameterised test
		@ValueSource(ints = {0, 1, 2, 3, 4, 5,})  // In this case we want the results from passing each of 6 integers - So six Tests
		public void usingAMockToGetStudentByID(int ID) { //ID will be replaced each time we run a Test
			//when(some mock service called).thenReturn(some other method)
			when(service.retrieveStudents()).thenReturn(allStudents);//***Used in @Before for initialising allStudents List - see above
			when(service.getStudentByID(ID)).thenReturn(controller.getStudentByID(ID)); //We are basically replacing mock calls with calls to the controller which in turn implements StudentInterface
            Student testStudent = serviceBusImpl.getStudentByID(ID); //Call the business logic version
		    assertEquals(allStudents.get(ID).getID(),testStudent.getID()); //Assert the result
		}
}
