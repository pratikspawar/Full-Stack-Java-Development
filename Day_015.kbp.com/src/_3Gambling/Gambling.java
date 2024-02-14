package _3Gambling;

import java.util.Scanner;

public class Gambling {
public static void main(String[] args) {
	boolean b=true;
	while(b) {
		System.out.println("***************Ashpak Fantasy*************\n\n");
		System.out.println("Press 1 New user :");
		System.out.println("Press 2 For Login:");
		System.out.println("Press 3 For Exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			Opration.addUser();
			break;
		case 2:
			Opration.login();
			break;
		case 3:
			Opration.getUsersData();
			break;
		}
		
	}
}
}
