package _3Incometax;

import java.util.Scanner;

public class IncomeTax {
public static void main(String[] args) {
	System.out.println("Enter Your Total Income:");
	Scanner sc=new Scanner(System.in);
	long  income=sc.nextLong();
	System.out.println("New Regim="+IncomeTax.getNewRegime(income));
}

private static double getNewRegime(long income) {
	// TODO Auto-generated method stub
	if(income>1500000) {
		return income-(income*0.03);
	}
	else if(income>1250000){
		return income-(income*0.025);
	}
	else if(income>1000000){
		return income -(income*0.02);
	}
	else if(income>750000){
		return income -(income*0.015);
	}
	else if(income>500000){
		return income -(income*0.01);
	}
	else if(income>250000){
		return income-(income*0.05);
	}
	else {
      return income;
	}
	
}
}
