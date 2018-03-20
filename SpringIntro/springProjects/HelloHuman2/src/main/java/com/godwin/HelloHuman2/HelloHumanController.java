package com.godwin.HelloHuman2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHumanController {

	//add my path 
	@RequestMapping("")
	//	i set the default to to human 
	public String homepage(@RequestParam(value="name", defaultValue="Human") String Name, Model model) {
		//step 1 get the request param and set the value and its key
		// step 2  use model object to set key pair value 
		// step 3 use the model object to set the key to use
		// to check see this on the page i need to ? tell that we are looking for url variable 
		model.addAttribute("name", Name);
		System.out.println(Name);
		return "home.jsp";
	}
	
}
