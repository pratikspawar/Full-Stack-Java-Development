package com.springbootprojectinitialize.projectinitialize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootprojectinitialize.projectinitialize.Model.Employee;

@Repository
public interface employeeRepo extends JpaRepository<Employee, Long> {

}
