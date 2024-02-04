package kbp.day_8._4test;

import java.util.Scanner;

public class Calculater {
	static Scanner sc1=new Scanner(System.in);
  public static void add(int a,int b) {
	  
	  
	  int c=a+b;
	  System.out.println("Addition of Two No:"+c);
  }
  
  public static void sub(int a,int b) {
	  
	  
	  int c=a-b;
	  System.out.println("Substraction of Two No:"+c);
  }
  public static void mul(int a,int b) {
	  
	  
	  int c=a*b;
	  System.out.println("Multiplication of Two No:"+c);
  }
  public static void div(int a,int b) {
	  
	  
	  int c=a/b;
	  System.out.println("Division of Two No:"+c);
	  
  }
  public static void add(int a,int b,int d) {
	  
	  
	  int c=a+b+d;
	  System.out.println("Addtion  of Three No:"+c);
  }
  
  public static void main(String[] args) {
	boolean b=true;
	while(b) {
		System.out.println("\n\nPress 1 for Addtion of two No\nPress 2 for Addtion of three No\nPress 3 for substraction of two No\nPress 4 for Multipliation of two No\nPress 5 for division of two No\nPress 6 for Exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("Enter No1:");
			int a1=sc.nextInt();
			System.out.println("Enter No2:");
			int b1=sc.nextInt();
			
			Calculater.add(a1,b1);
			break;
		}
			
		case 2:
			System.out.println("Enter No1:");
			int a2=sc.nextInt();
			System.out.println("Enter No2:");
			int b2=sc.nextInt();
			System.out.println("Enter No3:");
			int d2=sc.nextInt();
			Calculater.add(a2,b2,d2);
			break;
			
		case 3:
			System.out.println("Enter No1:");
			int a3=sc.nextInt();
			System.out.println("Enter No2:");
			int b3=sc.nextInt();
			Calculater.sub(a3,b3);
			break;
		
		case 4:
			System.out.println("Enter No1:");
			int a4=sc.nextInt();
			System.out.println("Enter No2:");
			int b4=sc.nextInt();
			
			Calculater.mul(a4,b4);
			break;
			
		case 5:
			System.out.println("Enter No1:");
			int a5=sc.nextInt();
			System.out.println("Enter No2:");
			int b5=sc.nextInt();
			
			Calculater.div(a5,b5);
			break;
		
		case 6:
			b=true;
			break;
		
		
			
		}
	}
}
}
