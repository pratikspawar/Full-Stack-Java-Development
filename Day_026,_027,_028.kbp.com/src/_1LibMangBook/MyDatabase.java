package _1LibMangBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyDatabase {
	static Scanner sc=new Scanner(System.in);
public static void saveData(ArrayList<Book> lst) {
		
		Connection co=MyConnect.getConnectionWithDb();
		try {
			int a=0;
			PreparedStatement pst=co.prepareStatement("INSERT INTO books(BookId,BookName,BookAuthor) VALUES(?,?,?)");
			for(Book book:lst) {
				
				int id =book.getBookid();
				String BookName=book.getBookname();
				String BookAuthor=book.getBookAuthor();
				
			    
				pst.setInt(1, id);
				pst.setString(2, BookName);
				pst.setString(3, BookAuthor);
				
				 a+=pst.executeUpdate();
				
			}
			
			System.out.println("Done "+a+" Book Added sussefully...!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public static void updateBook() throws SQLException {
	Connection co=MyConnect.getConnectionWithDb();

		int a=0;
		System.out.println("Press 1 For Update Book Name\nPress 2 for Update Auther name ");
		int ch=sc.nextInt();
		System.out.println("Enter Book Id To Update:");
		int BookId=sc.nextInt();
		switch(ch) {
		case 1:
			PreparedStatement pst=co.prepareStatement("UPDATE  books SET BookName=? WHERE BookId="+BookId+" ;");
		    System.out.println("Enter Book New Name:");
			String BookName=sc.next();
			pst.setString(1, BookName);
			 a+=pst.executeUpdate();
			break;
			
		case 2:
			PreparedStatement pst1=co.prepareStatement("UPDATE  books SET BookAuthor=? WHERE BookId="+BookId+" ;");
			System.out.println("Enter Book New Author");
			String BookAuthor=sc.next();
			pst1.setString(1, BookAuthor);
			 a+=pst1.executeUpdate();
			break;
		}
		
			
		
		
		System.out.println("Done "+a+" Book Updated sussefully...1");
	
}

public static void delete() throws SQLException {
	Connection co=MyConnect.getConnectionWithDb();

	int a=0;
	System.out.println("Enter Book Id To Delete:");
	int BookId=sc.nextInt();
	PreparedStatement pst=co.prepareStatement("DELETE  FROM books  WHERE BookId="+BookId+" ;");
	
		
		 a+=pst.executeUpdate();
		
	
	
	System.out.println("Done "+a+" Book Delete sussefully...!");
	
}
	
}
