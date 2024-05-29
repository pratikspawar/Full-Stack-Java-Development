package com.springbootprojectinitialize.projectinitialize.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootprojectinitialize.projectinitialize.Model.Employee;
import com.springbootprojectinitialize.projectinitialize.repository.employeeRepo;
@Service
public class EmpServicesImp implements EmpServices{
	@Autowired
	private employeeRepo empRepe;

	@Override
	public Employee getSave(Employee emp) {
		// TODO Auto-generated method stub
		return empRepe.save(emp);
	}

	@Override
	public Employee getUppdate(Employee emp) {
		// TODO Auto-generated method stub
		return empRepe.save(emp);
	}

	@Override
	public Employee getfindById(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> OpbBr=empRepe.findById(id);
		Employee emp=OpbBr.get();
		return emp;
	}

	@Override
	public void getdelete(long id) {
		// TODO Auto-generated method stub
		empRepe.deleteById(id);
	}

	@Override
	public List<Employee> gerAllEmp() {
		// TODO Auto-generated method stub
		return empRepe.findAll();
	}
	
	

}
