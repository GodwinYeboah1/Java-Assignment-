package com.codingDojo.secondProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecondProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondProjectApplication.class, args);
	}
	
//	 main  route 
	@RequestMapping("/")
	public String homePage() {
		return "Hello New User";
	}
	
	@RequestMapping("/new/user")
	public String addingNewUser() {
		return "This page is going to add new user";
	}
	
	
	
	
}
