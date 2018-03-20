package com.project.ninjaGold.controllers;

import java.security.Principal;
import java.util.Date;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
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
public class ninjaRouter{
	//Member variables go here
	

	public ninjaRouter(){
		// private  static int = 0;
	}

	// homepage
	@RequestMapping("")
	public String homePage(HttpSession session){
		// start with a number 
		if(session.getAttribute("totalGold") == null){
			session.setAttribute("totalGold",0);
		 }else{
			session.getAttribute("totalGold");
		 }
		String farm	= (String)session.getAttribute("farm");
		String cave	= (String)session.getAttribute("cave");
		String house = (String)session.getAttribute("house");
		String casino = (String)session.getAttribute("casino");
		return "index";
	}	
	// process data
	@PostMapping("/process")
	public String processData(HttpSession session, @RequestBody String body){
		// varibale needed here
		System.out.println(body);
		int fgold = 0;

		String response = " ";
		Random rGold = new Random();

		// brake it down again 
		// finding 0 to =
		// broke it down
		// substring() looks at a index of a string (begins , ends)
		// indexof() find the index of the para 
		// newBody serch the beginning of the string and ends at the end of "="
		String newBody = body.substring(0, body.indexOf("="));
		System.out.println(newBody);
		// if the farm is hit
		if(newBody.equals("farm")){
			// random number
			// session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + gold);
			// System.out.println("total gold = " + session.getAttribute("total_gold"));
			
			int fGold = rGold.nextInt(10)+ 20;
			Integer temp = (Integer)session.getAttribute("totalGold");
			session.setAttribute("totalGold",temp+fgold);
			// (Integer) temp += (int)fgold;
			// Integer totalGold += (Integer) session.getAttribute("totalGold");
			// store it in a string to display 
			response += "You entered a farm and your earned "+ fGold + ".  (" + new Date() + ")";
			System.out.println(response);
			session.setAttribute("farm", response);
			
		}
		if(newBody.equals("cave")){
			// random number
			int fGold = rGold.nextInt(5)+ 10;
			// store it in a string to display 
			response += "You entered a cave and your earned "+ fGold + ".  (" + new Date() + ")";
			System.out.println(response);
			session.setAttribute("cave", response);
		}
		if(newBody.equals("house")){
			// random number
			int fGold = rGold.nextInt(2)+ 5;
			// store it in a string to display 
			response += "You entered a house and your earned "+ fGold + ".  (" + new Date() + ")";
			System.out.println(response);
			session.setAttribute("house", response);
		}
		if(newBody.equals("casino")){
			// random number
		
			int fGold = rGold.nextInt(100)-50;
			// store it in a string to display 
			response += "You entered a casino and your earned "+ fGold + ".  (" + new Date() + ")";
			System.out.println(response);
			session.setAttribute("casino", response);
		}

		// gold += (Integer)session.getAttribute("gold") + fgold;

		return "redirect:/";
	}


}