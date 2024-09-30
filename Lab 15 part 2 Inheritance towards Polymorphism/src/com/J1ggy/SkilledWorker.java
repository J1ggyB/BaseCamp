package com.J1ggy;

import java.util.ArrayList;

public class SkilledWorker extends Employee {

//--Fields-------------------------------------
String skill;
	
	//--Constructor--------------------------------
	public SkilledWorker(String name, String jobTitle, String skill) {
		super(name, jobTitle);
		this.skill = skill;
	}
	//--Methods-----------------------------------

	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	protected String getInfo() { // return info for an Employee
	      String result = super.getInfo() +  this.skill;
		  return result;		
}
}
