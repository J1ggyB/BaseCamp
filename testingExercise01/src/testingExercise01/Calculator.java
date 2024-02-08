package testingExercise01;


public class Calculator { // A simple calculator class ~ Calculator


	// method takes two doubles adds them and returns answer as a double
		public double add(double num1, double num2) {
			return num1 + num2;
		}
	// method takes two doubles and subtracts val of num1 from val of num2 
	//returns answer as a double
		public double subtract(double num1, double num2) {
			return num1 - num2;
		}
	// method takes two doubles and multiplies val of num1 by val of num2 
	//returns answer as a double
		public double multiply(double num1, double num2) {
			return num1 * num2;
		}
		/* method takes two doubles checks for division by zero attempt
		   if num2 is equal to zero an IllegalArgumentException is thrown
		   else it divides val of num1 by val of num2 
		   returns answer as a double */
		public double divide(double num1, double num2) {
			if (num2 == 0) throw new IllegalArgumentException("Division by zero: divisor must not be 0");
			return num1 / num2;
		}

}