package com.example.demo.myFirstApp;

public class StudentResponce {
private int status;
private String messege;
private long time;
public StudentResponce(int status, String messege, long time) {
	super();
	this.status = status;
	this.messege = messege;
	this.time = time;
}
public StudentResponce() {
	super();
	// TODO Auto-generated constructor stub
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getMessege() {
	return messege;
}
public void setMessege(String messegse) {
	this.messege = messegse;
}
public long getTime() {
	return time;
}
public void setTime(long time) {
	this.time = time;
}
}
