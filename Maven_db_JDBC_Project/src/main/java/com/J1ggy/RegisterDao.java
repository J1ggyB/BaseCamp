package com.J1ggy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Dao is Data Access Object
public class RegisterDao {
private String dbUrl = "jdbc:mysql://localhost:3306/student_enrolment_db";
private String dbUserName = "watso";
private String dbPassword = "gww22";
private String dbDriver = "com.mysql.cj.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {
			con =DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public String insert (Student student) throws SQLException {
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "<html>\n"
				+ "<head>\n"
				+ "<link rel=\"stylesheet\" href=\"indexPage.css\">\n"
				+ "<title>Congratulations</title>\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "<header>\n"
				+ "<h2>Successful Registration</h2>\n"
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
				+ "<h2>Return to home page:</h2>\n"
				+ "<a href=\"index.jsp\">Home</a>\n" 
				+ "</main>"
				+ "</body>"
				+ "</html>";
		
		String sql = "INSERT INTO students (firstName, lastName, Email, houseNumber, postcode) VALUES(?,?,?,?,?)";

		PreparedStatement pstat = con.prepareStatement(sql);
	
		try {
			pstat.setString(1, student.getFirstName());
			pstat.setString(2, student.getLastName());
			pstat.setString(3, student.getEmail());
			pstat.setInt(4, student.getHouseNumber());
			pstat.setString(5, student.getPostcode()); 
			pstat.executeUpdate();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not captured" + e;
						}
		
	    return result;
	    
	}
}
