package com.project.firstplay.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class firstController{
	//Member variables go here

	public firstController(){

	}
	
	@RequestMapping("yourRoute")
	public String yourMethod(){
		return "yourView";
	}	

	 // get request

	// display home page
	@RequestMapping("/show")
	public  String showPage(){

		return "fakePage";
	}

	// display dashboard
	@RequestMapping("/dashboard")
	public String Dashboard(HttpSession session,  Model model){
			// Get the session data 
			String name = (String) session.getAttribute("name");
			String email = (String) session.getAttribute("email");
			// set session to the model
			// rem its add for model 
			model.addAttribute("name", name);
			model.addAttribute("email", email);


		return "dashboard";
	}

	// post request 
	@PostMapping("/process")
	public String process(@RequestParam(value="name") String name , @RequestParam(value="email") String email , HttpSession session){
		session.setAttribute("name", name);
		session.setAttribute("email", email);

		return "redirect:/dashboard";

	}
}
