package testingExercise02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceTest {                 // The test Class is called UserServiceTest
	
	private UserService service;        // Creates a private field in the UserServiceTest that
                                        // holds an instance of UserService called service
	@BeforeEach                         // Okay JUnit I need this setup for each test
	void setUp() throws Exception {     // Create me an instance of the UserService Class
		service = new UserService();    // and assign it to the "service" field
	}

	@AfterEach
	void tearDown() throws Exception {
		service = null;                  // After each test dump the instance associated with
	}                                    // the service field ie: new instance each test please

	@Test                     // 1st Test
	void registerValidDetails() {
		// Arrange
		String username = "bobby", password = "Codes123";  //Set up & init  2 Strings as user data 
		String expected = username; // Assign the user "bobby" to a String var "expected" 
		// Remember a HashMap uses a Key/Value pair so "expected" now holds the expected Key
		
		// Act
		String actual = service.register(username, password); //Call the register() method of the
		//class UserService on the instance of that class "service" passing username & password as
		//parameters and assign String result returned from the "register()" method to a String
		// variable declared as actual.
		
		// Assert
		Assertions.assertEquals(expected, actual); //Assert that expected (or "bobby") matches the
		// String returned by the service.register() method
	}

	@Test
	void registerInvalidPasswordNoNumbers() {
		// Arrange
		String username = "bobby", password = "CodesAlot";
		String expected = "Password must contain at least 1 number character";
		
		try {
			// Act
			service.register(username, password);
			fail("Expected an illegal argument exception due to missing number characters.");
		} catch (IllegalArgumentException iae) {
			// Assert
			Assertions.assertEquals(expected, iae.getMessage());
		}
	}
	
	@Test
	void registerInvalidPasswordNoUppercaseLetter() {
		// Arrange
		String username = "bobby", password = "codes123";
		String expected = "Password must contain at least 1 uppercase character";
		
		// Act
		IllegalArgumentException iae = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.register(username, password);
		}, "Expected an illegal argument exception due to missing uppercase characters.");
		
		// Assert
		Assertions.assertEquals(expected, iae.getMessage());
	}
	
	@Test
	void loginValidDetails() {
		// Arrange
		String username = "bobby", password = "Codes123";
		String expected = username;
		service.register(username, password);
		
		// Act
		String actual = service.login(username, password);
		
		// Assert
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void loginInvalidDetailsIncorrectPassword() {
		// Arrange
		String username = "bobby", password = "Codes123", wrongPassword = "Codes12";
		String expected = "Invalid password supplied";
		service.register(username, password);
		
		// Act
		IllegalArgumentException iae = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.login(username, wrongPassword);
		}, "Expected an illegal argument exception due to incorrect password on login.");
		
		// Assert
		Assertions.assertEquals(expected, iae.getMessage());
	}
}