package com.codingDojo.firstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@SpringBootApplication
// allow us to handle req and res
@RestController
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

//	allow us to controll the root page
//	http verb (this is a get reqest)
	@RequestMapping("/")
	public String hello() {
		return "Hello World"; 
	}
	
	
	 
	
}
