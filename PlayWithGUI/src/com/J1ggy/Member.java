package com.J1ggy;

public class Member {
	


	String fName;
	String lName;
	String age;
	String email;

	public Member(String fName, String lName, String age, String email) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.email = email;
		
	}
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return lName;
	}

	public void setLName(String lName) {
		lName = lName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void printDetails() {
		System.out.println("Forename: " + fName + " Surname: " + lName + " Age: " + age + " email: " + email 
				+ " - Is a new member - Congratulations!");
	}

}
