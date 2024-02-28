package _2Employee;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	boolean b=true;
	while(b) {
		System.out.println("****************Emploee Data*********");
		System.out.println("Press 1 For Add Emplyee");
		System.out.println("Press 2 For Remove Emplyee");
		System.out.println("Press 3 For Check Conatain Emplyee");
		System.out.println("Press 4 For Dispay Emplyee Data");
		System.out.println("Press 5 for exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			Oprations.addEmployee();
			break;
		case 2:
			Oprations.removeEmployee();
			break;
		case 3:
			Oprations.checkEmployee();
			break;
		case 4:
			Oprations.displayEmployeeData();
			break;
		case 5:
			b=false;
			break;
		}
	}
}
}
