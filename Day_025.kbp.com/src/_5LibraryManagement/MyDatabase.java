package _5LibraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class MyDatabase {
public static <Date> void saveData(ArrayList<Book> lst) {
		
		Connection co=MyConnect.getConnectionWithDb();
		try {
			PreparedStatement pst=co.prepareStatement("INSERT INTO books(BookId,BookName,BookAuthor) VALUES(?,?,?)");
			for(Book book:lst) {
				int id =book.getBookid();
				String BookName=book.getBookname();
				String BookAuthor=book.getBookAuthor();
			
				pst.setInt(1, id);
				pst.setString(2, BookName);
				pst.setString(3, BookAuthor);
				
				int a=pst.executeUpdate();
				System.out.println("Done "+a+" Book Added sussefully");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
