package com.qa.main.jslabs.lab12;

public class Duck extends Bird implements Insurable{

	public Duck(String name) {
		super(name);
	}

	@Override
	public String getPremium() {
		return "Expensive premium - Must be a Duck";
	}

	@Override
	public String expires() {
		return "Expires on blah blah - Must be a Duck";
	}
}