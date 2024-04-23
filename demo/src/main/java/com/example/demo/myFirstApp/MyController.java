package com.example.demo.myFirstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/")
 public String getHome() {
	return "My Home";
	 
 }


}
