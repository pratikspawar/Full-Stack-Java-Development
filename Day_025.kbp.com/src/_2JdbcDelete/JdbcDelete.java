package _2JdbcDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
	
		
		try {
			Connection	co = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "user", "User@123");
			 Statement st=co.createStatement();
			 int a=st.executeUpdate("DELETE FROM student  WHERE city='city' ;");
			 System.out.println("done "+a+" row deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
