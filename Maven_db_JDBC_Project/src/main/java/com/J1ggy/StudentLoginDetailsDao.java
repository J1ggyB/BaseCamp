package com.J1ggy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentLoginDetailsDao {
	private String dbUrl = "jdbc:mysql://localhost:3306/student_enrolment_db"; //We need a Url to connect to DBase
	private String dbUserName = "watso"; //A String to hold the user name
	private String dbPassword = "gww22"; //A String to hold the password
	private String dbDriver = "com.mysql.cj.jdbc.Driver"; // We need to know the driver

		public void loadDriver(String dbDriver) { // A method to load the driver
			try { //Use a try/catch in case we have a problem loading the driver
				Class.forName(dbDriver); //forName() method dynamically loads the driver into memory
			} catch (ClassNotFoundException e) { //Catch if the driver is not found
				e.printStackTrace(); //Stores the exception as a String
				System.out.println(e);
			}
		}

		public Connection getConnection() { //Connection is a Java class which has a method getConnection()
			Connection con = null;   // Declares an instance of Connection set to null
			try { //use try catch to make the connection
				con =DriverManager.getConnection(dbUrl, dbUserName, dbPassword); //Uses the DriverManager getConnection() to make the connection
			} catch (SQLException e) { //Catch connection problems
				e.printStackTrace(); //Stores the exception as a String
				System.out.println(e);
			}
			return con; // return the connection instance
		}
		public String getDetails(String Email, String postcode) throws SQLException { //method validate() takes a LoginBean
			loadDriver(dbDriver); // load the driver
			Connection con = getConnection();// get the connection
            String result = "";
			//STRING TO BE USED IN PREPARED STATEMENT (We will inject data and replace the "?" symbols
			String sql = "SELECT studentID, pin FROM student_enrolment_db.students WHERE Email = ? AND postcode = ?";
			PreparedStatement pstat;
			try {//Try to check if user is valid
				pstat= con.prepareStatement(sql); //Load the prepared statement
				pstat.setString(1, Email); //set the prepared statement to the LoginBeans fields
				pstat.setString(2, postcode); //set the prepared statement to the LoginBeans fields
				ResultSet rs = pstat.executeQuery(); //Execute the SQL query and capture result set
				 while (rs.next()) {

		                String StudentID = String.valueOf(rs.getInt("studentID"));
		                String Pin = String.valueOf(rs.getInt("studentID"));
                        result = StudentID + Pin;
		            }

				} catch (SQLException e) {//catch any Error
				e.printStackTrace(); //Stores the exception as a String
				}
			return result;
		}
}
