package _1LibMangBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyDatabase {
	
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
			
			System.out.println("Done "+a+" Book Added sussefully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
