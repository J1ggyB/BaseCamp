package guiProject;

import java.util.ArrayList;
import java.util.List;

public class Student {
	//Fields----------------------------------------------------------------------------------------------------
private static List <Student>students = new ArrayList<>();
	private String name;
	private String email;
	private String Mobile;
	//Constructor-----------------------------------------------------------------------------------------
	public Student(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.Mobile = mobile;
	}
	//Getters & Setters---------------------------------------------------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	//Methods--------------------------------------------------------------------------------------------
	public static void addStudent(Student student) {
		students.add(student);
	}
	public static void printStudents() {
		for(Student student : students) {
			System.out.println("\tStudent: " + student.toString() +"\n");
		}
	}
}

