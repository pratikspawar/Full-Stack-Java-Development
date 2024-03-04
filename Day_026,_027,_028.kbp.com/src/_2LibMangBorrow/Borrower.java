package _2LibMangBorrow;

import java.sql.Date;

public class Borrower {
	private int id;
	private String name;
	private int bookid;
	private int bookname;
	private Date issuedate;
	private Date submitdate;
	private double fine;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getBookname() {
		return bookname;
	}
	public void setBookname(int bookname) {
		this.bookname = bookname;
	}
	public Date getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}
	public Date getSubmitdate() {
		return submitdate;
	}
	public void setSubmitdate(Date submitdate) {
		this.submitdate = submitdate;
	}
	public double getFine() {
		return fine;
	}
	public void setFine() {
		long a=submitdate.getTime()-issuedate.getTime();
		long day = a / (1000 * 60 * 60 * 24);
		if(day<14) {
			this.fine=10*(day-14);
		}
		else {
			this.fine=0;
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
