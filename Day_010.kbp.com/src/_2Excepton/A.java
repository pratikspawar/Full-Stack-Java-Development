package _2Excepton;

public class A {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try {
		int c=a/b;
		System.out.println("C="+c);
	}catch (Exception e) {
		System.out.println("Can't divide by Zero");
	}
}

}
