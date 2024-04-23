package com.example.demo.myFirstApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
@RestController
public class StudentController {
	List<Student> stdList=new ArrayList<Student>();
	
@PostConstruct
public List<Student> setStudent() {
	Student st=new Student();
	stdList.add(new Student(1,"Pratik","Solapur"));
	stdList.add(new Student(2,"Atharv","Satara"));
	return stdList;
	
}
@GetMapping("/getstd")
public List <Student>getStudent(){
	
	return stdList;
	
}
@GetMapping("/get/{id}")
public Student getStudents(@PathVariable int id) {
	
		
		if (id > stdList.size()  || id<0) {
			 throw new PersonNotPresent("Person Not Found");
 		} 
		else{
			return stdList.get(id);
			}
		
	
}
@ExceptionHandler
ResponseEntity<StudentResponce> hendleExp(PersonNotPresent notFound){
	StudentResponce error=new StudentResponce();
	error.setStatus(HttpStatus.NOT_FOUND.value());
	error.setMessege(notFound.getMessage());
	error.setTime(System.currentTimeMillis());
	return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	
}}
