package com.qa.main.jslabs.lab07;

public class Lab7 {
	
	public int[] sort(int[] numbers) { //sort Takes an Array as a parameter - It is a method that returns an integer Array
		// This is probably a naff way to do it 
		boolean working = true; //Declare a flag - A boolean just to hold current state
		int[] list = numbers; // pass in our Array and assign it to a variable called list
		while(working) {
			boolean changed = false; //Change Flag to false
			for (int i = 0; i < list.length; i++) { //iterate the Array that was assigned to list
				if(i == 0) continue; // Simply to avoid a runtime error caused by i-1 on first pass as this would throw an OutOfBoundsArray exception
				if(list[i] < list[i-1]) { //So imagine we take each array item and check that it is greater than the previous item - (we could use > for alternative sort)
					int tmp = list[i];  // if it is then save i temporarily just in an int tmp variable
					list[i] = list[i-1]; //Lets make i equal the greater number
					list[i-1] = tmp; // Overwrite the original smaller number with tmp (ie: swap them)
					changed = true; // Tag changed back to true - We should now have a sorted list
				}
			}
			if(!changed) {  // If it didn't work  keep our Flag as false
				working = false;
			}
		}
		return list;
	}
	
	public void start() {
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 }; //Declares an Array of ints
		int sum = Sum(numbers);//Calls Sum() method with the Array as the parameter
		System.out.println("Sum = " + sum);
		float avg = Average(numbers);//Calls Average() method with the Array as the parameter
		System.out.println("Average = " + avg);
		int min = Minimum(numbers); //Calls Min() method with the Array as the parameter
		System.out.println("Minimum = " + min);
		int max = Maximum(numbers);//Calls Max() method with the Array as the parameter
		System.out.println("Maximum = " + max);
		int indexOfZero = FindFirstZero(numbers);//Calls FindFirstZero() method with the Array as the parameter
		System.out.println("Zero = " + indexOfZero);
	}

	private int FindFirstZero(int[] numbers) {// Takes an Array as parameter and returns value of i where the first 0 can be found
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	private int Maximum(int[] numbers) { //find the min number by comparison
		int max = numbers[0];
		for(int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}

	private int Minimum(int[] numbers) { //find the min number by comparison
		int min = numbers[0];
		for(int number : numbers) {
			if (number < min) {
				min = number;
			}
		}
		return min;
	}

	private float Average(int[] numbers) {//Calculate Average
		int sum = Sum(numbers);
		return (float) sum / numbers.length;
	}

	private int Sum(int[] numbers) { //Total up Numbers
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}
}



///    IF WE HAVE AN  ARRAY {17, 0, 45,62,3, 101}
// INDEXES  17=0   0 = 1   45=2  62 = 3   3 = 4   101 =5   WE HAVE 6 ELEMENTS
// If 17 is at index 0 then nothing comes before it in the array
// we can' t compare 17 to the previous value as 17 is the first value
// This would throw an IndexOutOfBounds exception
// To avoid this we use the line - if(i == 0) continue; 
// continue simply skips this iteration of the loop and re-enters the for loop at index 1

