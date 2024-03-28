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
		
		System.out.println("Enter Borrower name:");
		String brname=sc.next();
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
				System.out.println(exid);
				if(exid==id) {
					
					
					PreparedStatement pst2=co.prepareStatement("SELECT * FROM borrower WHERE id=?  And bookname IS NULL;");
					pst2.setInt(1, exid);
					ResultSet set=pst2.executeQuery();
					boolean bn=false;
					while(set.next()) {
						 bn=true;
					}
					
					System.out.println(bn);
					
					
					if(bn) {
					System.out.println("Enter Book Id:");
					int bid=sc.nextInt();
					//to get book data from book id 
					PreparedStatement pst=co.prepareStatement("SELECT * FROM books WHERE BookId=?;");
					pst.setInt(1, bid);
					ResultSet rset=pst.executeQuery();
						System.out.println("in update");
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
							b=true;
							break;
							
						}
					}
					else {
						int count=BorrowerOpration.checkEntryCount(co, exid);
						if(count<=3) {
							System.out.println("Enter Book Id:");
							int bid=sc.nextInt();
							//to get book data from book id 
							PreparedStatement pst=co.prepareStatement("SELECT * FROM books WHERE BookId=?;");
							pst.setInt(1, bid);
							ResultSet rset=pst.executeQuery();
							
							System.out.println("In inset");
							PreparedStatement borrowerOp=co.prepareStatement("INSERT INTO borrower(id,name,bookId,bookname,issue,duedate )VALUES(?,?,?,?,?,?);");
							while(rset.next()) {
								//get book data from book database
								String bname=rset.getString("BookName");
								LocalDate date=LocalDate.now();
								Date date1=Date.valueOf(date);
								
								LocalDate date2=date.plusDays(14);
								Date duedate=Date.valueOf(date2);
								//set data to borrower data 
								borrowerOp.setInt(1, id);
								borrowerOp.setString(2, brname);
								borrowerOp.setInt(3, bid);
								borrowerOp.setString(4, bname);
								borrowerOp.setDate(5, date1);
								borrowerOp.setDate(6, duedate);
								borrowerOp.executeUpdate();
								System.out.println("Book borrowed sussesfull...!");
								b=true;
								break;
							}
						}
						else {
							System.out.println("You alreay borrowed 3 book...!");
							b=true;
							break;
						}
					}
					
					
				}
			} 
				if(b!=true){
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
							b=true;
							break;
						}
						
						
					}
				}
				
			}
			
			
			
		catch (SQLException e) {
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
	 private static int checkEntryCount(Connection connection, int id) throws SQLException {
	        PreparedStatement countStmt = connection.prepareStatement("SELECT COUNT(id) FROM borrower WHERE id = ?");
	        countStmt.setInt(1, id);
	        ResultSet rs = countStmt.executeQuery();
	        int count=0;
	        while(rs.next()) {
	         count = rs.getInt(1);
	        }
	        return count;
	    }

}
