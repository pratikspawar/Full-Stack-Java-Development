package _1LibMangBook;

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
}
