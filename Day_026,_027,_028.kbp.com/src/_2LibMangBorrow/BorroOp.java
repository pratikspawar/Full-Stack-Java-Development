package _2LibMangBorrow;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import _1LibMangBook.MyConnect;


public class BorroOp {
	 static Scanner sc=new Scanner(System.in);
		
		

		public void addBorrower() throws SQLException   {
			Borrower br=new Borrower();	
			System.out.println("Enter Borrower Id:");
			int id=sc.nextInt();
			br.setId(id);
		    System.out.println("Enter Borrower Name:");
		    String name=sc.next();
		    br.setName(name);
		    Connection co=MyConnect.getConnectionWithDb();
		    PreparedStatement   pst =co.prepareStatement("INSERT INTO borrower(id,name) VALUES(?,?)");
		    pst.setInt(1,id );
		    pst.setString(2, name);
		    pst.execute();
		    System.out.println("Borrower add sussesfull...!\n ");
			
		}

		public void updateBorrower() throws SQLException {
			Borrower br=new Borrower();	
			System.out.println("Enter Borrower Id to update :");
			int id=sc.nextInt();
			br.setId(id);
		    System.out.println("Enter Borrower  New Name:");
		    String name=sc.next();
		    Connection co=MyConnect.getConnectionWithDb();
		    PreparedStatement   pst =co.prepareStatement("UPDATE borrower SET name=? WHERE id="+id+";");
			pst.setString(1, name);
			pst.executeUpdate();
			System.out.println("Borrower Data updated Sussesfuly...!");
		}

		public void displayBorrower() throws SQLException {
			Connection co=MyConnect.getConnectionWithDb();
	        Statement st=co.createStatement();
			ResultSet rst=st.executeQuery("SELECT * FROM borrower;");
	        while(rst.next()) {
	        	int Roll_No=rst.getInt("id");
	        	String name=rst.getString("name");
	        	System.out.println("Id:"+Roll_No+" Name:"+name+"\n");
	        }
		   System.out.println("");	
		}

		public void deleteBorrower() throws SQLException {
			Borrower br=new Borrower();	
			System.out.println("Enter Borrower Id to Delete :");
			int id=sc.nextInt();
		    Connection co=MyConnect.getConnectionWithDb();
		    PreparedStatement   pst =co.prepareStatement("DELETE FROM borrower WHERE id="+id+";");
			pst.executeUpdate();
			
			System.out.println("Borrower Data Delteted...!");
		}
		
}
