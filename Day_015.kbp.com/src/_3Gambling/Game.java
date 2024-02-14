package _3Gambling;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static double  play() {
		
		System.out.println("Enter No between 1 to 4:");
		Scanner sc=new Scanner(System.in);
		int usrip=sc.nextInt();
		
		Random rn=new Random();
		int mcip=rn.nextInt(1,4);
		if(usrip==mcip) {
			System.out.println("Congratulation You Won The Game!!!!\nYou won 300\n");
			return 300.0;
		}
		System.out.println("Better Luck Next Time!!!\n");
		return 0;
	}

}
