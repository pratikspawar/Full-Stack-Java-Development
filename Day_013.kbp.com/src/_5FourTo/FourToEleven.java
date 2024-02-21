package _5FourTo;

import java.util.Scanner;

public class FourToEleven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Array Size:");
	    int s=sc.nextInt();
	    
		int p[]=new int [s];
		for (int i=0;i<p.length;i++) {
			System.out.println("Enter Array at elementat ["+i+"]:");
				p[i]=sc.nextInt();
		}
		
		 int q[]=FourToEleven.changeAray(p);
		 
		 for (int a:q) {
			 System.out.print(a+" ");
		 }
	}

	
	private static int[] changeAray(int[] p) {
	    for(int i=0;i<p.length;i++) {
	    	if(p[i]==4) {
	    		p[i]=11;
	    	}
	    }
		return p;
	}
}
