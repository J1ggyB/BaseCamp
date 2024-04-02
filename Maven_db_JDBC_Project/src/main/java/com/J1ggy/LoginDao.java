package com.J1ggy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//Dao is Data Access Object
public class LoginDao {
private String dbUrl = "jdbc:mysql://localhost:3306/student_enrolment_db";
private String dbUserName = "watso";
private String dbPassword = "gww22";
private String dbDriver = "com.mysql.cj.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
			}
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {
				con =DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
			}
				return con;
			}

	public boolean validate (LoginBean loginBean) throws SQLException {
		loadDriver(dbDriver);
		Connection con = getConnection();
				
		boolean match = false; 
		String sql = "SELECT studentID, pin FROM students WHERE studentID = ? AND pin = ?";

		PreparedStatement pstat;

	
		try {
			pstat= con.prepareStatement(sql);
			pstat.setInt(1, loginBean.getStudentID());
			pstat.setInt(2, loginBean.getPin());
			ResultSet rs = pstat.executeQuery();
			match = rs.next();//returns true if match found
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e);
			}
		return match;
	}
}