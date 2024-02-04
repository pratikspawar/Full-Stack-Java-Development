package kbp.day_8._5test;

public class BankAccount {
private int acno=123;
private int bal=0;

public  void setDeposit(int a) {
	this.bal+=a;
	
}

public int getAcco() {
	return acno;
}
public int getBalance() {
	return bal;
}
}
