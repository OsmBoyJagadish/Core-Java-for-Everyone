package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement stmt=con.createStatement();
		ResultSet rst=stmt.executeQuery("select*from emp");
		ResultSetMetaData rstm= rst.getMetaData();
		for(int i=1;i<=rstm.getColumnCount();i++) {
			System.out.print(rstm.getColumnName(i) +" ");
		}
		System.out.println();
		
		while(rst.next()){
			System.out.print(rst.getString("id")+" "+ rst.getString("name")+" "+rst.getString("subject")+" "+rst.getString("age"));
			System.out.println("");
		}
		con.close();
	}
}