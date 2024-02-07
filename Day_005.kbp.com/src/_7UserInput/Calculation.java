package _7UserInput;

import java.util.Scanner;

public class Calculation {
 public void add(int a,int b) {
	int c=a+b;
	System.out.println("Addition="+c);
 }
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Calculation cl=new Calculation();
	System.out.println("Enter No1:");
	int n1=sc.nextInt();
	System.out.println("Enter No1:");
	int n2=sc.nextInt();
	cl.add(n1, n2);
}
}
