package com.springbootprojectinitialize.projectinitialize.Services;

import java.util.List;


import com.springbootprojectinitialize.projectinitialize.Model.Employee;


public interface EmpServices {

	public Employee getSave(Employee emp);
	public Employee getUppdate(Employee br);
	public Employee getfindById(long id);
	void getdelete(long id);
	public List<Employee> gerAllEmp();

}
