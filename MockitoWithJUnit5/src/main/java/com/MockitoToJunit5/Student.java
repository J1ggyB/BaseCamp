package com.MockitoToJunit5;

public class Student {  // A CLASS STUDENT WITH 3 FIELDS "ID", "name" & "Course"
	private int ID;
	private String name; 
    private String course;
    private int score;

public Student (String name, String course, int score) {  
	this.name = name;
	this.course=course;
	this.score=score;
	}
	public Student() {
	super();
}
	// Getter and Setter methods
	public int getID() { // Get the ID
		return ID;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setID(int iD) {  //Set the ID
		ID = iD;
	}
	public String getName() {  //Get the name
		return name;
	}
	public void setName(String name) { //Set the name
		this.name = name;
	}
	public String getCourse() {  //Get the course
		return course;
	}
	public void setCourse(String course) { //Set the course
		this.course = course;
	}
	
	
}
