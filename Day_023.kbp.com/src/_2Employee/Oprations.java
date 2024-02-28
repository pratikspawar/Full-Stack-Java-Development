package _2Employee;

import java.util.Scanner;

public class Oprations {
    static private Emplyee_registar er=new Emplyee_registar();
    static Scanner sc=new Scanner(System.in);
	public static void addEmployee() {
		Employee e=new Employee();
		System.out.println("Enter Employee Id:");
		e.setEid(sc.nextInt());
		System.out.println("Enter Employee Name:");
		e.setName(sc.next());
		System.out.println("Enter Employee Salary:");
		e.setSalary(sc.nextDouble());
		System.out.println("Enter Employee age:");
		e.setAge(sc.nextInt());
		System.out.println("Enter Employee Experiance:");
		e.setExp(sc.nextInt());
		er.addemp(e);
	}

	public static void removeEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Name to remove:");
		er.remove(sc.next());
	}

	public static void checkEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Name to Check:");
		er.isCotain(sc.next());
	}

	public static void displayEmployeeData() {
		// TODO Auto-generated method stub
		er.displayEmployee();
	}

}
