package com.J1ggy;


//I am the University of HipHop

public class Student {
	private static String University;
	private int ID;
	private String fName;
	private String lName;
	private String course;
	

		public Student() {
		super();
		setUni();
	}
		
		public Student(int iD, String fName, String lName) {
			super();
			this.ID  = iD;
			this.fName = fName;
			this.lName = lName;
		}

		public Student(int iD, String fName, String lName, String course) {
			super();
			setUni();
			this.ID = iD;
			this.fName = fName;
			this.lName = lName;
			this.course = course;
		}
	
	public  static void setUni() {
		University = "University of HipHop";
	}
	public static String getUni() {
	return University;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
