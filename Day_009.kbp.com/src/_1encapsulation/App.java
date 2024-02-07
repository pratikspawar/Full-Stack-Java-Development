package _1encapsulation;
import java.util.Scanner;

public class App {


	
	 public static void main(String[] args) {
		boolean b=true;
		while(b) {
			int ch =7;
			System.out.println("**********************AP Store*************");
			System.out.println("Press 1 for add Product\nPress 2 for See Product\nPress 3 for Update Product data\nPress 4 for Exit");
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
					b=false;
					break;
				case 7:
					break;
				}
			}
		}
	}
	}


