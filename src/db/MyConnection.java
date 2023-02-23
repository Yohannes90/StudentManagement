package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	private static final String username = "root";
	private static final String password = "";
	private static final String dataConn = "jdbc:mysql://localhost:3306/student_management";
	private static Connection con = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dataConn,username,password);
                   	
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());			
		}
		return con;
	}
}
