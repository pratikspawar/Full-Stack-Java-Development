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

public class BorrowerOpration {
	static Scanner sc=new Scanner(System.in);
	public static void checkBorrow() {
		
		
		System.out.println("Enter Borrower id:");
		int id=sc.nextInt();
		Connection co=MyConnect.getConnectionWithDb();
        try {
        	//to check get and check borrower present in database or not
			Statement st=co.createStatement();
			ResultSet rst=st.executeQuery("SELECT * FROM borrower");
			boolean b=false;
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
					PreparedStatement borrower=co.prepareStatement("Update borrower SET bookid=?,bookname=? ,issue=?,duedate=? WHERE id="+exid+";");
					while(rset.next()) {
						//get book data from book database
						String bname=rset.getString("BookName");
						LocalDate date=LocalDate.now();
						Date date1=Date.valueOf(date);
						
						LocalDate date2=date.plusDays(14);
						Date duedate=Date.valueOf(date2);
						//set data to borrower data 
						borrower.setInt(1, bid);
						borrower.setString(2, bname);
						borrower.setDate(3, date1);
						borrower.setDate(4, duedate);
						borrower.executeUpdate();
						System.out.println("Book borrowed sussesfull...!");
					}
					b=true;
					break;
					
				}
				if(b==false || !rst.next()){
					System.out.println("New User?\nFor registar New User Press 1");
					int a=sc.nextInt();
					if(a==1) {
						System.out.println("Enter Borrower Name:");
						String name=sc.next();
						PreparedStatement pst1=co.prepareStatement("INSERT INTO borrower(id,name) VALUES(?,?)");
						pst1.setInt(1, id);
						pst1.setString(2, name);
						pst1.executeUpdate();
						System.out.println("User added sussesfully...!");
						System.out.println("Enter Book Id:");
						int bid=sc.nextInt();
						
						PreparedStatement pst2=co.prepareStatement("SELECT * FROM books WHERE BookId=?;");
						pst2.setInt(1, bid);
						ResultSet rset1=pst2.executeQuery();
						
						
						PreparedStatement borrowerInfo=co.prepareStatement("Update borrower SET bookid=?,bookname=? ,issue=?,duedate=? WHERE id="+id+";");
						while(rset1.next()) {
							
							String bname=rset1.getString("BookName");
							LocalDate date=LocalDate.now();
							Date date1=Date.valueOf(date);		
							LocalDate date2=date.plusDays(14);
							Date duedate=Date.valueOf(date2);
							borrowerInfo.setInt(1, bid);
							borrowerInfo.setString(2, bname);
							borrowerInfo.setDate(3, date1);
							borrowerInfo.setDate(4, duedate);
							borrowerInfo.executeUpdate();
							System.out.println("Book borrowed sussesfull....!");
						}
						
						
					}
				}
				break;
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void SubmiteBook() throws SQLException {
		System.out.println("Enter Borrower Id:");
		int id=sc.nextInt();
		System.out.println("Enter Book Id");
		int bid=sc.nextInt();
		LocalDate date=LocalDate.now();
		Date date1=Date.valueOf(date);
		Connection co=MyConnect.getConnectionWithDb();
		PreparedStatement pst=co.prepareStatement("UPDATE borrower SET submit=? WHERE BookId=? AND id=?;");
		pst.setDate(1, date1);
		pst.setInt(2, bid);
		pst.setInt(3, id);
		pst.executeUpdate();
		Fine.setFine(id,bid);
		System.out.println("Book submited Sussefull");
		
		
	}

}
