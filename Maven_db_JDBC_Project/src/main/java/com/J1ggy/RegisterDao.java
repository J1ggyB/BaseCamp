package com.J1ggy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Dao is Data Access Object
public class RegisterDao {
private String dbUrl = "jdbc:mysql://localhost:3306/student_enrolment_db"; //We need a Url to connect to DBase
private String dbUserName = "watso"; //A String to hold the user name
private String dbPassword = "gww22"; //A String to hold the password
private String dbDriver = "com.mysql.cj.jdbc.Driver"; // We need to know the driver

	public void loadDriver(String dbDriver) { // A method to load the driver
		try { //Use a try/catch in case we have a problem loading the driver
			Class.forName(dbDriver); //forName() method dynamically loads the driver into memory
		} catch (ClassNotFoundException e) { //Catch if the driver is not found
			e.printStackTrace(); //Stores the exception as a String
		}
	}

	public Connection getConnection() { //Connection is a Java class which has a method getConnection()
		Connection con = null;   // Declares an instance of Connection set to null
		try { //use try catch to make the connection
		con =DriverManager.getConnection(dbUrl, dbUserName, dbPassword); //Uses the DriverManager getConnection() to make the connection
		} catch (SQLException e) { //Catch connection problems
			e.printStackTrace(); //Stores the exception as a String
		}
		return con; // return the connection instance
	}

	public String insert (Student student) throws SQLException {//method to insert a Student into the DBase
		loadDriver(dbDriver); //Load the driver
		Connection con = getConnection(); //get the connection
		String result = "<html>\n"                           //Prepare a result String
				+ "<head>\n"
				+ "<link rel=\"stylesheet\" href=\"indexPage.css\">\n"   //note we hae linked a stylesheet
				+ "<title>Congratulations</title>\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "<header>\n"
				+ "<h2>Successful Registration</h2>\n"    //Successful Registration
				+ "<h2>Return to home page</h2>\n"
				+ "</header>\n"
				+ "<nav>"
				+ "<ul>\n"
				+ "<li> <a class = \"active\" href=\"index.jsp\">Home</a> </li>\n"
				+ "<li> <a class = \"active\" href=\"Registration.html\">Registration</a> </li>\n"
				+ "</ul>\n"
				+ "</nav>"
				+ "<main>"
				+ "<h2>Successful Registration</h2>\n"
				+ "<h2>Confirm your email and postcode to receive your Login Details\n"
				+ "<form method = \"post\" action = \"StudentLoginDetailsPath\">"
				+ "<label for=\"email\">E-Mail:</label>" + "  "
				+ "<input type=\"text\" id=\"email\" name=\"email\">\n"
				+ "<label for=\"postCode\">Post Code:</label>" + "  "
				+ "<input type=\"text\" id=\"postCode\" name=\"postCode\">\n"
				+ "<input type=\"Submit\" value=\"Submit\" />"
				+ "<h3>Keep these safe as you will not be able to log in without them</h3>"
				+ "</form>"
				+ "<h2>Successful Registration</h2>\n"
				+ "<ul>\n"
				+ "<li><h2>Return to home page:</h2></li>\n"
				+ "<li><a href=\"index.jsp\">Home</a></li>\n"
				+ "<ul>"
				+ "</main>"
				+ "</body>"
				+ "</html>";
		//CREATE A PREPARED SQL STATEMENT
		String sql = "INSERT INTO students (firstName, lastName, Email, houseNumber, postcode) VALUES(?,?,?,?,?)";
        //Prepares a string and then injects into it replacing the "?" symbols with data
		PreparedStatement pstat = con.prepareStatement(sql);

		try {
			pstat.setString(1, student.getFirstName());
			pstat.setString(2, student.getLastName());
			pstat.setString(3, student.getEmail());
			pstat.setInt(4, student.getHouseNumber());
			pstat.setString(5, student.getPostcode());
			pstat.executeUpdate();
			} catch (SQLException e) {//Catch any error
			// TODO Auto-generated catch block
			e.printStackTrace(); //writes the error to a string
			result = "Data not captured" + e; //sets result to failure data
						}

	    return result;  //return the result which will be the html we prepared

	}
}
