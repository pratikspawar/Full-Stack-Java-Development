package _1BoxingUnboxing;

public class A {
public static void main(String[] args) {
	//boxing 
	int a=10;
	Integer b=Integer.valueOf(a);
	
	//Unboxing
	Integer c=10;
	int r=c.valueOf(c);
	
	//Sting acccepting any type of data
	//to convert data into string We use tostring Static method 
	
	byte ab=3;
	String jk=Byte.toString(ab);
	
	//To cenvert string data into another data type then we use ther parase 
	String gh="100";
	int kl=Integer.parseInt(gh);
	
	Integer mn=150;
	String mp=mn.toString();
	
	String mo="100000";
	Integer po=Integer.parseInt(mo);
}
}
