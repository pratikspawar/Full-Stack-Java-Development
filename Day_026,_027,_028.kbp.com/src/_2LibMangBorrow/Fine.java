package _2LibMangBorrow;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import _1LibMangBook.MyConnect;

public class Fine {
 public static void setFine(int id, int bid) throws SQLException {
	 long day = 0;
	 float fine = 0;
	    Connection co=MyConnect.getConnectionWithDb();
	    PreparedStatement pst1=co.prepareStatement("SELECT issue,submit FROM borrower WHERE  id=? AND BookId=?;");
	    pst1.setInt(1, id);
	    pst1.setInt(2, bid);	   
	    System.out.println("user selected");
	    ResultSet set=pst1.executeQuery();
	    while(set.next()) {
	    	Date date1=set.getDate("issue");
		    LocalDate issue=date1.toLocalDate();
		    Date date2=set.getDate("submit");
		    LocalDate submit=date2.toLocalDate();
		     day=ChronoUnit.DAYS.between(issue, submit);
	    }
	   
	    if(day>14) {
	    	fine=(day-14)*10;
	    }
		PreparedStatement pst=co.prepareStatement("UPDATE borrower SET Fine=? WHERE  id=? AND BookId=?;");
		pst.setFloat(1, fine);
		pst.setInt(2, id);
		pst.setInt(3, bid);
		pst.executeUpdate();
		System.out.println("Fine added");
 }
}
