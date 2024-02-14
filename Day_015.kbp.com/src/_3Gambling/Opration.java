package _3Gambling;

import java.util.Scanner;

public class Opration {
	static Scanner sc=new Scanner(System.in);
	static UserRecord ur=new UserRecord();
	public static void addUser() {
		User usr=new User();
		int age;
		System.out.println("Enter user Name:");
		usr.setName(sc.next());
		while(true) {
			System.out.println("Enter User Age:");
			age=sc.nextInt();
			if(age>=18) {
			
				break;
			}System.out.println("You are not mature for play this game!!!");
		}
		usr.setAge(age);
		System.out.println("Set Password");
		usr.setPassword(sc.next());
		ur.addItem(usr);
	}

	public static void login() {
		
		ur.GetLogin();
	}

	public static void getUsersData() {
		// TODO Auto-generated method stub
	ur.displayItem();
	}

}
