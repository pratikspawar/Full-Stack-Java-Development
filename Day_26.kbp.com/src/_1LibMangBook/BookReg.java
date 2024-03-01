package _1LibMangBook;

import java.util.ArrayList;



public class BookReg {
	ArrayList<Book> lst;
	public BookReg(){
			this.lst=new ArrayList<Book>();
	}
	public void addBook(Book b) {
		lst.add(b);
	}
	public void  saveToDb() {
		MyDatabase.saveData(lst);
	}
}
