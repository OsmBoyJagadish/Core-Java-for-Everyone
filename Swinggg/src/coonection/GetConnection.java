package coonection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	public static Connection getconnection() {
		
		try {
			Class.forName("com.jdbc.mysql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		
		try {
			con=DriverManager.getConnection("mysql:jdbc://localhost/:3306:/pr","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;

		}
	
	
	
}
