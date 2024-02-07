package _4Product;

import java.util.Scanner;
import _4Customer.OprationCustomer;

public class App {


	
	 public static void main(String[] args) {
		boolean b=true;
		while(b) {
			int ch =7;
			System.out.println("**********************AP Store*************");
			System.out.println("Press 1 for add Product\nPress 2 for See Product\nPress 3 for Update Product data\nPress 4 set Customer\nPress 5 for Get billing \nPress 6 for Exit");
			Scanner sc=new Scanner(System.in);
			try {
			int ch1=sc.nextInt();
			ch=ch1;
			}
			catch (Exception e) {
				System.out.println("Please enter input of intiger datatype  !!!!!!!!\n\n");
				
			}
			finally {
				switch(ch) {
				case 1:
					OprationShope.setData();
					break;
				case 2:
					OprationShope.getData();
					break;
				case 3:
					OprationShope.updateData();
					break;
				case 4:
					OprationCustomer.setCustomer();;
					break;
				case 5:
					OprationCustomer.get_billing();;
				case 6:
					b=false;
					break;
				case 7:
					break;
				}
			}
		}
	}
	}



