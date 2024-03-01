package _2LibMangBorrow;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import _1LibMangBook.MyConnect;


public class BorroOp {
	 static Scanner sc=new Scanner(System.in);
		public static void checkBorrow() {
			Borrower br=new Borrower();	
			System.out.println("Enter Borrower id");
			int id=sc.nextInt();
			Connection co=MyConnect.getConnectionWithDb();
	        try {
	        	//to check get and check borrower present in database or not
				Statement st=co.createStatement();
				ResultSet rst=st.executeQuery("SELECT * FROM borrower");
				while(rst.next()) {
					int exid=rst.getInt("id");
					if(exid==id) {
						System.out.println("Enter Book Id:");
						int bid=sc.nextInt();
						//to get book data from book id 
						PreparedStatement pst=co.prepareStatement("SELECT * FROM books WHERE BookId=?;");
						pst.setInt(1, bid);
						ResultSet rset=pst.executeQuery();
						
						//to save book data into borrower database
						PreparedStatement borrower=co.prepareStatement("Update borrower SET bookid=?,bookname=? ,issue=? WHERE id="+exid+";");
						while(rset.next()) {
							//get book data from book database
							String bname=rset.getString("BookName");
							LocalDate date=LocalDate.now();
							Date date1=Date.valueOf(date);
							
							//set data to borrower data 
							borrower.setInt(1, bid);
							borrower.setString(2, bname);
							borrower.setDate(3, date1);
							borrower.executeUpdate();
							System.out.println("Book borrowed sussesfull");
						}
						
					}
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		public static void SubmiteBook() {
			Borrower br=new Borrower();	
		}
	 
}
