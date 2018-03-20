package com.project.fakeReloaded.controllers;

import javax.validation.Valid;

import com.project.fakeReloaded.models.language;

// import java.security.Principal;
// import java.util.Date;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpSession;
// import javax.validation.Valid;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class fakeRouter{
	//Member variables go here

	public fakeRouter(){

	}
	
	@RequestMapping("")
	public String homePage(Model model){
		// lang ref to the client data that we are passing in
		model.addAttribute("lang", new language());
		return "homepage";
	}	

	@RequestMapping("/edit")
	public String editPage(){
		return "editpage";
	}	


	@PostMapping("/new")
	public String processData(@Valid @ModelAttribute("lang") language  lang, BindingResult result){
		// result has an error 
		// binding looks for errors
		if(result.hasErrors()){
			return "homepage";

		}else{
			// gives me  location in ram
			// but ask tony 
			System.out.println("saved user"+ lang);
			// if no errors it will redirect to the edit page
			return "redirect:/edit";
		}

		
	}

}
