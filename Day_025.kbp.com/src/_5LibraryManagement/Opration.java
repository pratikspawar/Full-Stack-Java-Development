package _5LibraryManagement;

import java.util.Scanner;


import java.sql.*;
public class Opration {
	static Scanner sc=new Scanner(System.in); 
    static BookReg br=new BookReg();
	public static void SetBook() {
		@SuppressWarnings("deprecation")
		Date date=new Date(0, 0, 0);
		int ch=1;
		while(ch==1) {
		Book b=new Book();
		System.out.println("Enter Book Id");
		b.setBookid(sc.nextInt());
		System.out.println("Enter Book Name");
		b.setBookname(sc.next());
		System.out.println("Enter Book Autor");
		b.setBookAuthor(sc.next());
		b.setDate(new java.sql.Date(date.getDate()));
		br.addBook(b);
		System.out.println("Press 1 for add book\nPress 2 for save book");
	    ch=sc.nextInt();
		if(ch==2) {
			br.saveToDb();
			break;
		}
		}
		
		
	}

	public static void SetBorrower() {
		Borrower br=new Borrower();
		System.out.println("Enter Borrower Id:");
		br.setId(sc.nextInt());
		System.out.println("Enter Borrower Name:");
		br.setName(sc.next());
		System.out.println("Enter Borrower Address");
		br.setAddr(sc.next());
	}

}
