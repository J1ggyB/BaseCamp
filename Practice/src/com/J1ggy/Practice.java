package com.J1ggy;

public class Practice {

	public static void main(String[] args) {

		Student Student1 = new Student();
		System.out.println("Student1 University: " + Student.getUni());   // Correct for static variable
		//System.out.println("Student1 University: " + Student1.getUni()); // Don't access static data with instance calls
		Student1.setfName("John"); 
		System.out.println(Student.responsibleBody);
	}

}
