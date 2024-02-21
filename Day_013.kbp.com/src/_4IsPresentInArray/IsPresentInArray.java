package _4IsPresentInArray;

import java.util.Scanner;

public class IsPresentInArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Size:");
    int s=sc.nextInt();
    
	int p[]=new int [s];
	for (int i=0;i<p.length;i++) {
		System.out.println("Enter Array at elementat ["+i+"]:");
			p[i]=sc.nextInt();
	}
	
	System.out.println("Enter no to Search In array:");
	int num=sc.nextInt();
	
	System.out.println(IsPresentInArray.isPresent(p,num));
}

private static boolean isPresent(int[] p, int num) {
	// TODO Auto-generated method stub
	for (int a:p) {
		if(a==num) {
			return true;
		}
	}
	return false;
}
}
