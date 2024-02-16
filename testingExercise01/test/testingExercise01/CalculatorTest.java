package testingExercise01;

import org.junit.jupiter.api.AfterEach;    //Imported the required junit libraries
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {      // Create a class with a meaningful name ~CalculatorTest
	private Calculator calculator;  // Create a field to hold an instance of Calculator

	@BeforeEach                          // Tells junit what to setup before each test
	void setUp() throws Exception {   
		calculator = new Calculator();   // Before each test we create a new instance of Calculator
	}                                    // and assign it to our field

	@AfterEach                           // Tells junit what to take down after each test
	void tearDown() throws Exception {   // After each test we throw away the instance
		calculator = null;               // ie: each unit test get it's own instance of Calculator
	}

	@Test                                  // Okay junit this is a test
	void addSmallNumbersTest() {           // The test is the addSmallNumbersTest() method test
		// Arrange
		double num1 = 10, num2 = 20;       // ARRANGE -  set up data and expected result
		double expected = 30;              // Tell junit what is expected
		
		// Act
		double actual = calculator.add(num1, num2);    // ACT  - Carry out the test
		System.out.println("Addition result: " + expected + " " + actual);
		// Assert									   
		Assertions.assertEquals(expected, actual);     // ASSERT - Check the results are equal
	}
	
	@Test
	void subtractSmallNumbersTest() {
		// Arrange
		double num1 = 10, num2 = 20;
		double expected = -10;

		
		// Act
		double actual = calculator.subtract(num1, num2);
		System.out.println("Subtraction result: " + expected + " " + actual);
		// Assert
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void multiplySmallNumbersTest() {
		// Arrange
		double num1 = 10, num2 = 20;
		double expected = 200;
		
		// Act
		double actual = calculator.multiply(num1, num2);
		System.out.println("Multiplication result: " + expected + " " + actual);
		// Assert
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void divideSmallNumbersTest() {
		// Arrange
		double num1 = 10, num2 = 20;
		double expected = 0.5;
		
		// Act
		double actual = calculator.divide(num1, num2);
		System.out.println("Division result: " + expected + " " + actual);
		// Assert
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void throwsIllegalArgumentExceptionTest() {       // Testing an exception throw is working
		// Arrange
		double num1 = 10, num2 = 0;                   // Test data sets up division by zero
		boolean thrown = false;                       // Boolean used track the throw occurrence
		
		// Act
		try {
		double actual = calculator.divide(num1, num2);
		} catch (IllegalArgumentException e) {
		System.out.println("Division  by zero result: " +e );
		thrown = true;                                 // Boolean records the throw occurrence
		}
		// Assert
		Assertions.assertTrue(thrown);                 // Asserts the occurrence of the throw
	}


}
