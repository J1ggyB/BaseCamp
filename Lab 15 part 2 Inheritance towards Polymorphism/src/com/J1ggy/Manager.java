package com.J1ggy;

//import java.util.ArrayList;

public class Manager extends Employee{
	//--Fields-----------------------------------------
	//public ArrayList<Employee>employees = new ArrayList<>(); - Moved to Employee (Parent)
	String info;
	//--Constructor---------------------------------------
	public Manager(String name, String jobTitle) {
		super(name, jobTitle);

	}
	//--Methods---------------------------------------
/*public void addEmployee(Employee emp) {
	employees.add(emp);
	
}*/
public String getInfo() { // Call the parent getInfo
	String info =super.getInfo();
	return info;
}


}//END CLASS
