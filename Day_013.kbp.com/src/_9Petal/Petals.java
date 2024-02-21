package _9Petal;

import java.util.Scanner;

public class Petals {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of Petals:");
	int p=sc.nextInt();
	String str[]={"a lot","madaly","very much","littaly"};
	System.out.println(Petals.petals(str,p));
}

private static String petals(String[] str, int i) {
	int j=i%str.length;
	System.out.println(j);
 	
	return "I Love You "+str[j];
}
}
