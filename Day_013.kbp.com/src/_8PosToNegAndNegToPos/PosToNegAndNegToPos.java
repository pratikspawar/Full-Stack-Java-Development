package _8PosToNegAndNegToPos;

import java.util.Scanner;

public class PosToNegAndNegToPos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Array Size:");
	    int s=sc.nextInt();
	    
		int p[]=new int [s];
		for (int i=0;i<p.length;i++) {
			System.out.println("Enter Array at elementat ["+i+"]:");
				p[i]=sc.nextInt();
		}
		
		for(int i=0;i<p.length;i++) {
		p[i]*=-1;
		}
		
		for(int a:p) {
			System.out.print(a+" ");
		}
}
}
