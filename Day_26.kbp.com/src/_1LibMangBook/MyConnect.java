package _1LibMangBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect {
	public static Connection getConnectionWithDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		Connection co1 = null;
		try {
			 co1=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","user","User@123");
		    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return co1;
	}
}
