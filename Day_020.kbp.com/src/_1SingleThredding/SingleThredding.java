package _1SingleThredding;

public class SingleThredding {
public static void main(String[] args) {
	SingleThredding.m1();
	System.out.println();
	for(int j=0;j<10;j++) {
		System.out.print(" J:"+j);
	}
}

private static void m1() {
	for(int j=0;j<10;j++) {
		System.out.print(" i:"+j);
	}
}
}
