import java.time.LocalDate;
import java.sql.*;
public class MyDbConnection {

	public static void main(String[] args) {
		try{
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students_db","admin","12345");
		System.out.println("Connection Good!");
		
		PreparedStatement pstat = c.prepareStatement("insert into students values(?,?,?)");
		
		pstat.setNString(1, "1");
		pstat.setNString(2, "Mohammed");
		pstat.setNString(3, "Ali");

		
		pstat.executeUpdate();
		System.out.println("successful Update");  
		
		}catch(Exception e) {System.out.println("Error connecting to Database" );e.printStackTrace();}
	}

}
