package kbp.day_8._3test;

import java.util.Scanner;

public class Vehicals {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Car cr= new Car();
	Motorcycle mc=new Motorcycle();
	
	boolean b=true;
	while(b) {
		System.out.println("****************Vehicals_Details*****************");
		System.out.println("Press 1 for car\nPress 2 for MotorCylce\nPress 3 for Exit");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Model:"+cr.getModel()+"\nYear:"+cr.getYear()+"\n\n");
			break;
			
		case 2:
			System.out.println("Model:"+mc.getModel()+"\nYear:"+mc.getYear()+"\n\n");
			break;
			
		case 3:
			System.out.println("**************Thank You***********************");
			b=false;
			break;
		}
	}
}
}
