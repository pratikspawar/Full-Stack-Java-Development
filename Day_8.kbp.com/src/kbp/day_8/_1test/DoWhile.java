package kbp.day_8._1test;

import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
boolean b = true;
Scanner sc=new Scanner(System.in);
do {
	    System.out.println("Enter Numbers:");
		int a=sc.nextInt();
		if(a<=0) {
			b=false;
			System.out.println("Last Entered NO:"+a);
   } 
}while (b);
}
}



