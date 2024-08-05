package com.J1ggy;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
	//--Fields-------------------------------------
	ArrayList<String>skills = new ArrayList<>();
	
	//--Constructor--------------------------------
	public SkilledWorker(String name, String jobTitle, String skill) {
		super(name, jobTitle);
		this.skills.add(skill);
	}
	//--Methods-----------------------------------
	public void addSkill(String skill) {
		skills.add(skill);
	}
}
