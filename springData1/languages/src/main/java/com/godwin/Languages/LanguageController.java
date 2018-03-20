package com.godwin.Languages;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/languages")
public class LanguageController {
	@Autowired
	//	this allow us to make all the method that we just made in our service 
	private LanguageService lS;

	//	dependencies injection
	public LanguageController(LanguageService lS) {
		this.lS = lS;
	}
	
	@RequestMapping("")
	public String languages(Model model) {
		//this will get all the of the languages in our service we created the all methods
		model.addAttribute("languages", lS.all());
		// this creates a new Language  
		//	Storing the new created language in a key named language which is also binding the 
		//	this here create a blank Object to access this use language
		model.addAttribute("language", new Language());
		return "languages";
	}
	
	@PostMapping("")
	public String create(@Valid @ModelAttribute("language") Language lang, BindingResult res) {
		//	the @valid @ model Attribute is also in the Request route 
		//	this create a new language when user post any data 
		//	@ModelAttribute("language")  is looking for the object that is not blank
		//	because user has enter the data in 
		//	binding Result grabs the errors and this function stores it in res
		if(res.hasErrors()) {
			return "languages";
		}else {
			lS.create(lang);
			System.out.println("you are trying to make a language");
			return "redirect:/languages";
		}	
	}
	
	@RequestMapping("/{id}")
	public String find(@PathVariable("id") Long id, Model model) {
//		this is looking for that 1 id and render it to my page
		 model.addAttribute("language", lS.find(id));
		
		return "showLanguage";
	}
	
	@RequestMapping("/{id}/update")
	public String updateLanguage(@Valid @PathVariable("id") Long id, Model model, @ModelAttribute("language") Language lang, BindingResult res) {
//		this is looking for that 1 id and render it to my page
		 model.addAttribute("language", lS.find(id));
		 model.addAttribute("language");
		if(res.hasErrors()) {
			
			return "updateLanguage";
		}
		return "updateLanguage";
	}
	
		@PostMapping("/{id}/update")
		public String updateLanguageCompleted( @PathVariable("id") Long id, Model model, @ModelAttribute("language") Language lang, BindingResult res) {
			 model.addAttribute("language", lS.find(id));

			if(res.hasErrors()) {
				return "updateLanguage";
			}else {
				lS.update(lang);
				return "redirect:/languages";
			}
		
		}
//		ninja code 
		     		
		
		@RequestMapping("/{id}/delete")
			public String delete(@PathVariable("id") Long id , Model model){
			 model.addAttribute("language", lS.find(id));

			lS.destory(id);
			return "redirect:/languages";
		}
		
		
	
}
