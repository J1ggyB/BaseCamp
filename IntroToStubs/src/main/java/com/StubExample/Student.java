package com.StubExample;

public class Student {
	private int ID;
	private String name; 
    private String course;

public Student (String name, String course) {
	this.name = name;
	this.course=course;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void getStudentDetails(int ID) {
		if(this.getID()==ID) {
		System.out.println(name + course); 
		}
		else {
			System.out.println("Apologies no student found");
		}
	}
}
