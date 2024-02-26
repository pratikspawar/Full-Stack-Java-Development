package _3LargerNumInList;

import java.util.ArrayList;
import java.util.Scanner;


public class LargeNum {
public static void main(String[] args) {
	System.out.println("Enter Size of Array:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		System.out.println("Enter no "+(i+1)+":");
		a[i]=sc.nextInt();
		
	}
	System.out.println("Max no:"+LargeNum.getLarge(a));
}

private static int getLarge(int[] a) {
	
int max=a[0];
for(int i:a) {
	if(max<i) {
		max=i;
	}
}
	return max;
}
}
