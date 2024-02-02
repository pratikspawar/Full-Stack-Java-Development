package kbp.day_6._5Homework;

import java.util.Scanner;

public class Mobile  {
    
	
	public static void mobileInfo() {
	Oprations op=new Oprations();
	Scanner sc=new Scanner(System.in);
	boolean b=true;
	while(b) {
		System.out.println("Press 1 Iphone\nPress 2 for Samsung\nPress 3 main menu1");
		 int ch=sc.nextInt();
		 switch(ch) {
		 case 1:
			 op.iphone();
		 	break;
		 case 2:
			 op.samsung();
		 	break;
		 case 3:
			 b=false;
		 	break;
		 }
	}
	}
}
