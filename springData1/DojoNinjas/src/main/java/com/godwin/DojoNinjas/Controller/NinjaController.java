package com.godwin.DojoNinjas.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.godwin.DojoNinjas.Services.DojoService;
import com.godwin.DojoNinjas.Services.NinjaService;
import com.godwin.DojoNinjas.models.Ninja;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
//	Reference service not Repository
	@Autowired
	private NinjaService  nr;
	
	@Autowired
	private DojoService ds;

	@RequestMapping("/new")
	public String getHomePage(@ModelAttribute("ninja") Ninja ninja, Model model) {
		
//	this step is to have error showing on your page
//		this step should  find all the dojo
		model.addAttribute("dojos", ds.getAll());
//		this get all dojo 
		System.out.println(ds.getAll());
		return "ninja";
	}
	
	@PostMapping("/new")
	public String saveNinja(@Valid @ModelAttribute("ninja") Ninja ninja ,BindingResult result) {
		if(result.hasErrors()) {
			return "ninja";
		}
		nr.create(ninja);
		return "redirect:/ninjas/new";
	}
	

	
	
	
	
}