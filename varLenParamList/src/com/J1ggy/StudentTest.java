package com.J1ggy;

public class StudentTest {
private int ID;
private String Name;
public StudentTest(int iD, String name) {
	super();
	setID(iD);
	setName(name);
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String toString() {
	int id = this.getID();
	String str = this.getName();
	str = "This is an instance of StudentTest ID is " + id + " Name is " + str;
	return str;
}
}
