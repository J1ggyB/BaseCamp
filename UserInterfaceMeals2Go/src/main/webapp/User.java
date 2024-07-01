package main.webapp;

public class User {
	String fname,lname,password;

	public User(String fname, String lname, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}
