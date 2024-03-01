package _4JdbcUserInput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcUserInput {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","user","User@123");
		PreparedStatement co1=co.prepareStatement("INSERT INTO student(id ,name,city) VALUES(?,?,?);");
		System.out.println("Enter Student roll no:");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		co1.setInt(1, id);
		System.out.println("Enter Student name:");
		String name=sc.next();
		co1.setString(2, name);
		System.out.println("Enter Student city:");
		String city=sc.next();
		co1.setString(3, city);
		int a=co1.executeUpdate();
		System.out.println("done "+a+" row added");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
