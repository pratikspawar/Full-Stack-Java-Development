package _2StringCreationMethod;

public class MyString {
	public static void main(String[] args) {
		String a="mumbai";
		System.out.println(a);
		
		String b=new String("Pune");
		System.out.println(b);
		
		char c[]= {'a','b','c'};
		String d=new String(c);
		System.out.println(d);
		
		char e[]= {66,67,68};
		String f=new String(e);
		System.out.println(f);
		}
}
