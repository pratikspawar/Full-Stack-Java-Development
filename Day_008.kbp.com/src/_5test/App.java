package _5test;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean b=true;
	while(b) {
		System.out.println("\n\n******************Bank***************************");
		System.out.println("Press 1 for Deposite money\nPress 2 for Balance Cheak\nPress 3 for Exit");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			Opration.deposit();
			break;
		
		case 2:
			Opration.getBalance();
			break;
			
		case 3:
			b=false;
			break;
			
		}
	}
}
}
