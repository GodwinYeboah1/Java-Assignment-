package com.godwin.DriversLicence.Person;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {

	@Autowired
	PersonService personService;
	
	@RequestMapping(method=RequestMethod.GET, value="/persons/new")
	public String homePage(@Valid @ModelAttribute("Person") Person person, BindingResult res, Model model) {
		if(res.hasErrors()) {
			model.addAttribute("Person",person);
			return "Person";
		}
		
		System.out.println("HomePage");
		return "Person";
	}
	
	@RequestMapping(method=RequestMethod.POST ,value="/save/new")
	public  String create(@ModelAttribute("Person") Person person, Model model) {
		 personService.createPerson(person);
		model.addAttribute("Person");
		return "redirect:/persons/new";
	}
	
	
}
