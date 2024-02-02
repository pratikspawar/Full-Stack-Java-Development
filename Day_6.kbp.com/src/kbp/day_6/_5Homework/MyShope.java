package kbp.day_6._5Homework;

import java.util.Scanner;

public class MyShope {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
MyShope.name();

boolean b=true;
while(b){
	System.out.println("Press 1  For Mobiles\nPress 2 for tv\nPress 3 for Ac\nPress 4 for exits");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
		Mobile.mobileInfo();
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		b=false;
	}
}

}

public static void name() {
	System.out.println("***********************AP Store**********************");
}
}
