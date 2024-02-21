package _3Array;

import java.util.Scanner;

public class InsertData {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Size:");
    int s=sc.nextInt();
    
	int p[]=new int [s];
	for (int i=0;i<p.length;i++) {
		System.out.println("Enter Array at elementat ["+i+"]:");
			p[i]=sc.nextInt();
	}
	
	System.out.println("Even No Count in Aray:"+InsertData.evencount(p));
	
}

private static int evencount(int[] p) {
	int c=0;
	for(int a:p) {
		if(a%2==0) {
			c++;
		}
	}
	return c;
}
}
