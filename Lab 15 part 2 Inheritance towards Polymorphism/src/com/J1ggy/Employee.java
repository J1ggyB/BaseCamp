package com.J1ggy;

import java.util.ArrayList;

public class Employee {
protected static ArrayList<Employee>employees = new ArrayList<>(); // Static exists before instances of class
private String info;											// note protected - avail to sub class
private String name;                                            // But not accessible directly from main
private String jobTitle;										// Only via method provided
private int id;
protected static int idCount;
public String getName() {  return name; }
private void setName(String name) { this.name = name; }
public String getJobTitle() { return jobTitle; }
private void setJobTitle(String jobTitle) { this.jobTitle = jobTitle;}
private void setId(int id) { this.id = id; }
public int getId() { return id;	}

public Employee(String name, String jobTitle ) {
			      setId(++Employee.idCount * 10);
			      setName(name);
			      setJobTitle(jobTitle);		
}
protected String getInfo() { // return info for an Employee
			      info = "\n**** *****\n";
			      info += "Name: " + getName() + "\n";
			      info += "Job Title: "+ getJobTitle() + "\n";
			      info += "Employee ID: "+ getId()+ "\n";
				  return info;		
}
}