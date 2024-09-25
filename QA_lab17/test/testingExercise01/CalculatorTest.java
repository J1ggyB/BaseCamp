package testingExercise01;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calculator;
	
	//Annotations in JUnit are used to mark specific methods and classes with metadata that defines how the testing framework should handle them

	@BeforeEach                                        //Annotation to indicate steps required before running test
	void setUp() throws Exception {   //Set up our test or throw an Exception
		calculator = new Calculator();      // Create an instance of Calculator and assign it to the field "calculator"
	}

	@AfterEach												//Annotation to indicate steps required after running test
	void tearDown() throws Exception {
		calculator = null;
	}

	@Test																				//Annotation to indicate start of test
	void addSmallNumbersTest() {
		// Arrange                                                                  //Each test has 3 sections Arrange ; Act ; Assert
		double num1 = 10, num2 = 20;
		double expected = 30;
		
		// Act
		double actual = calculator.add(num1, num2);
		
		// Assert
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void subtractSmallNumbersTest() {
		// Arrange
		double num1 = 10, num2 = 20;
		double expected = -10;
		
		// Act
		double actual = calculator.subtract(num1, num2);
		
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
		
		// Assert
		Assertions.assertEquals(expected, actual);
	}
	
	
	//WE NEED TWO TESTS FOR THE divide() method of calculator in order to test the possibility of division by zero
	@Test
	void divideSmallNumbersTest() {
		// Arrange
		double num1 = 10, num2 = 20;
		double expected = 0.5;
		
		// Act
		double actual = calculator.divide(num1, num2);
		
		// Assert
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void divideByZeroTest() {
		// Arrange
		double num1 = 10, num2 = 0;
	// Act
		   // Try to perform the division and catch the exception
        try {
            calculator.divide(num1, num2);
        } catch (IllegalArgumentException ae) {
        	//Assert
            // Check the exception message contains the expected result
            assertTrue(ae.getMessage(). contains("Division by zero"));
        }

	}
	
}