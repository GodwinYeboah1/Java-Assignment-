package com.codingDojo.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PortfolioController {

	@RequestMapping("/")
	public String home() {
		System.out.println("Just got to the index page");
		
		return "forward:/index.html";
	}
	
	@RequestMapping("/me")
	public String me() {
		System.out.println("Just got to the about me page");
		
		return "forward:/me.html";
	}
	
	@RequestMapping("/projects")
	public String projects() {
		System.out.println("Just got to the project page");
		return "forward:/project.html";
	}
//	jsp file  render bellow
	@RequestMapping("/newWebPage")
	public String newPage(Model model) {
//		
		model.addAttribute("dojoName", "dallas");
		model.addAttribute("userName","Godwin");
        //this is how i am able to use jps
		return "/WEB-INF/index.jsp";
	}
	
}
