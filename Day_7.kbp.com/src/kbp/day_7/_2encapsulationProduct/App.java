package kbp.day_7._2encapsulationProduct;

import java.util.Scanner;

public class App {
 public static void main(String[] args) {
	boolean b=true;
	while(b) {
		System.out.println("**********************AP Store*************");
		System.out.println("Press 1 for add Product\nPress 2 for See Product\nPress 3 for Update Product data\nPress 4 for Exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			Opration.setData();
			break;
		case 2:
			Opration.getData();
			break;
		case 3:
			Opration.updateData();
			break;
		case 4:
			b=false;
			break;
		}
	}
}
}
