package com.codingDojo.stringAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// step 1 import RestController
@RestController
public class StringAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringAssignmentApplication.class, args);
	}
//	step 2 RequestMapping
	@RequestMapping("/")
	public String homePage() {
		return "Hello Client! How are you doing?";
	}
//	step 3 RequestMapping
	@RequestMapping("/random")
	public String randomPage() {
		return "Spring is great! So easy to just respond with strings";
	}
	
	
	
}
