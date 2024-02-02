package kbp.day_7._1encapsulation;

import java.util.Scanner;

public class Employee {
private int empId;
private String name;
private String salary;
public void setId(int empId){
	this.empId=empId;
}
public void setName(String name){
	this.name=name;
}
public void setSalary(String salary){
	this.salary=salary;
}
public int getEmpId() {
	return empId;
}
public String getName() {
	return name;
}
public String getSalary() {
	return salary;
}

public static void main(String[] args) {
	Employee emp= new Employee();
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Employee Id");
	int empId=sc.nextInt();
	emp.setId(empId);
	
	System.out.println("Enter name");
	String name=sc.next();
	emp.setName(name);
	
	System.out.println("Enter salary");
	String salary=sc.next();
	emp.setSalary(salary);
	
	System.out.println("Id:"+emp.getEmpId());
	System.out.println("name:"+emp.getName());
	System.out.println("Salary:"+emp.getSalary());
	
;}
}

