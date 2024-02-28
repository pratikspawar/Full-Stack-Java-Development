package _1jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {
public static void main(String[] args)  {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	String url="jdbc:mysql://localhost:3306/myproject";
	String username="user";
	String pass="User@123";
	try {
		Connection co=DriverManager.getConnection(url, username, pass);
        Statement st=co.createStatement();
		ResultSet rst=st.executeQuery("SELECT * FROM student");
        while(rst.next()) {
        	int Roll_No=rst.getInt("id");
        	String name=rst.getString("name");
        	String city=rst.getNString("city");
        	System.out.println("Id:"+Roll_No+" Name:"+name+" City:"+city);
        	
        }
        
        
        
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
