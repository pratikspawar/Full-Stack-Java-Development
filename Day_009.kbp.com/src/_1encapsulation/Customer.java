package _1encapsulation;

public class Customer {
private int id;
private String name;
private int qyt;
private double amt;
private double tamt;
private double change; 
public  void setId(int id2) {
	// TODO Auto-generated method stub
	this.id=id2;
}
public void setName(String name2) {
	// TODO Auto-generated method stub
	this.name=name2;
}
public  void setQyt(int qyt) {
	// TODO Auto-generated method stub
	this.qyt=qyt;
}
public  void setAmt(double amt2) {
	// TODO Auto-generated method stub
	this.amt=amt2;
	
}
public int getQyt() {
	
	// TODO Auto-generated method stub
	return qyt;
}

public void setToatalAmaount(double price) {
	this.tamt=qyt*price;
	System.out.println("Price(GST):"+price);
	System.out.println("Quntity:"+qyt);
}


public double getTotalAmaount() {
	return tamt;
}


public double getChange() {
	return amt-tamt;
	}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public double getAmountByCustomer() {
	return amt;
}
}
