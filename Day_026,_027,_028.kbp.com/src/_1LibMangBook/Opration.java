package _1LibMangBook;

import java.sql.SQLException;
import java.util.Scanner;


public class Opration {
	static Scanner sc=new Scanner(System.in); 
    static BookReg br=new BookReg();
	public static void SetBook() {
		
		int ch=1;
		while(ch==1) {
		Book b=new Book();
		System.out.println("Enter Book Id");
		b.setBookid(sc.nextInt());
		System.out.println("Enter Book Name");
		b.setBookname(sc.next());
		System.out.println("Enter Book Autor");
		b.setBookAuthor(sc.next());
		
		br.addBook(b);
		System.out.println("Press 1 for add book\nPress 2 for save book");
	    ch=sc.nextInt();
		if(ch==2) {
			br.saveToDb();
			break;

		}
		
	}

}
	public static void updateBook() {
		try {
			MyDatabase.updateBook();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void deleteBook() {
		
		try {
			MyDatabase.delete();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void bookOP() {
		Boolean b=true;
		while(b) {
			System.out.println("Press 1 for add book\nPress 2 for Update Book Data\nPress 3 for Delete \nPress 4 for exit");
		    int ch=sc.nextInt();
		    switch(ch) {
		    case 1:
		    	Opration.SetBook();
		    	break;
		    case 2:
		    	Opration.updateBook();
		    		break;
		    case 3:
		    	Opration.deleteBook();
		    		break;
		    case 4:
		    	b=false;
		    		break;
		    
		    }
		
	}
	
}
	
}
