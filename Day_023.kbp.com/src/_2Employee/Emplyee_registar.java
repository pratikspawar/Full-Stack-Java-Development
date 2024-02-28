package _2Employee;

import java.util.HashSet;
import java.util.Iterator;


public class Emplyee_registar {
HashSet<Employee> eset;
Emplyee_registar(){
	this.eset=new HashSet<Employee>();
}
public void addemp(Employee e) {
	eset.add(e);
}
public void remove(String name) {
	Iterator<Employee> itr= eset.iterator();
	while(itr.hasNext()) {
		Employee e= itr.next();
		if(name.equals(e.getName())) {
			itr.remove();
		}
		
	}
	
}
public  void isCotain(String name) {
	Iterator<Employee> itr= eset.iterator();
	while(itr.hasNext()) {
		Employee e= itr.next();
		if(name.equals(e.getName())) {
			System.out.println("contains");
		}
		
	}
}
public  void displayEmployee() {
	for( Employee e:eset) {
		System.out.println("Employee Id:"+e.getEid()+"\nEmplyee Name:"+e.getName()+"\nUser age:"+e.getAge()+"\nSalary:"+e.getSalary()+"\nExperiance:"+e.getExp()+"\n\n");
	}
}
}
