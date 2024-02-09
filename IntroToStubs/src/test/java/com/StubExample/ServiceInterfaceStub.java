package com.StubExample;

import java.util.ArrayList;
import java.util.List;


public class ServiceInterfaceStub implements ServiceInterface{
	private List<Student>students = new ArrayList<>();
	
	public ServiceInterfaceStub() {
		super();
		Student student1 = new Student("Bob Smith", "Woodwork");
		student1.setID(students.size());
		this.students.add(student1);
		Student student2 = new Student("Lucy Brown", "Woodwork");
		student2.setID(students.size());
		this.students.add(student2);
		Student student3 = new Student("Dan MacLeod", "Fishing");
		student3.setID(students.size());
		this.students.add(student3);
		Student student4 = new Student("Juliette Mathie", "Fishing");
		student4.setID(students.size());
		this.students.add(student4);
		Student student5 = new Student("Fiona Mason", "Sewing");
		student5.setID(students.size());
		this.students.add(student5);
		Student student6 = new Student("Ray Charles", "Piano");
		student6.setID(students.size());
		this.students.add(student6);
		
	}



	@Override
	public List<Student> retrieveStudents() {

		return this.students;
	}


}

