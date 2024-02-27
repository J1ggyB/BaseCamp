package com.J1ggy;

public class Student {
	private int studentID;
	private String firstName;
	private String lastName;
	private String enrolmentDate;
	private String Email;
	private int houseNumber;
	private String postcode;
	private int pin;
	
	public Student() {
		super();
	}
	public Student(String firstName, String lastName, String email, int houseNumber, String postcode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.Email = email;
		this.houseNumber = houseNumber;
		this.postcode = postcode;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEnrolmentDate() {
		return enrolmentDate;
	}
	public void setEnrolmentDate(String enrolmentDate) {
		this.enrolmentDate = enrolmentDate;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

}
