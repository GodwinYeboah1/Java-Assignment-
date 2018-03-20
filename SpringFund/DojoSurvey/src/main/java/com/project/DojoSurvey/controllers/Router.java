package com.project.DojoSurvey.controllers;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Router{
	//Member variables go here
	public Router(){}
	// homepage
	@RequestMapping("/")
	public String homePage(){return "homePage";}
	// process  data 
	@PostMapping("/process")
	public String prossdata(HttpSession session, @RequestParam(value="userName") String userName, @RequestParam(value="location") String location, @RequestParam(value="lang") String lang , @RequestParam(value="comment") String comment ){
		System.out.println(userName);
		//store it in session 
		session.setAttribute("userName", userName);
		session.setAttribute("location", location);
		session.setAttribute("lang", lang);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	// final page 
	@RequestMapping("/result")
	public String resultPage( HttpSession session, Model model){
		// pull out from session object and save it String model 
		String userName = (String) session.getAttribute("userName");
		String location = (String) session.getAttribute("location");
		String lang = (String) session.getAttribute("lang");
		String comment = (String) session.getAttribute("comment");

		// model will  recievce the data and set the key 
		model.addAttribute("userName", userName);
		model.addAttribute("location",location);
		model.addAttribute("lang", lang);
		model.addAttribute("comment", comment);
		return "resultPage";
	}
}
