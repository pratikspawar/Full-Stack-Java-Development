package _1InvalidInputException;

import java.io.File;
import java.util.Scanner;




public class Numbers {
	public static void main(String[] args) throws InvalidInputException{
		int dividend,divisor;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend:");
		dividend=sc.nextInt();
		try {
			System.out.println("Enter divisor:");
			divisor=sc.nextInt();
			if (divisor<=0) {
				throw new InvalidInputException("InvalidInputException");
			}
			else {
				Numbers.division(dividend, divisor);
			}
		} 
		catch (InvalidInputException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
		
	

	private static void  division(int dividend, int divisor)  {
		System.out.println("Division:"+(dividend/divisor));
	}	
}