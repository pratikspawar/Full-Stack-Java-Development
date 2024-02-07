package _2Excepton;

public class ArrayIndex {
public static void main(String[] args) {
	int a[]= {10,20,30};
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	try {
		System.out.println(a[3]);
	} 
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException");	}
	catch (Exception e) {
		System.out.println("Exception");
	}
	finally {
		
	}
	
}
}
//TODO: handle exception// TODO: handle exception