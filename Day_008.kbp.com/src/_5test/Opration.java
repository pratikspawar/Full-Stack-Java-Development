package _5test;

import java.util.Scanner;

public class Opration {
 static BankAccount ba=new BankAccount();
 static Scanner sc=new Scanner(System.in);
 public static void deposit() {
	 System.out.println("Enter Money to Deposite:");
	 int m=sc.nextInt();
	 ba.setDeposit( m);
 }
 public static void getBalance() {
	 System.out.println("Ac No:"+ba.getAcco());
	 System.out.println("Balance:"+ba.getBalance());
 }
}
