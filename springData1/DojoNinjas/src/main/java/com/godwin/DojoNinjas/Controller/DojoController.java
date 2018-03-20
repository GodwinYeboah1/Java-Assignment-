package com.godwin.DojoNinjas.Controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.godwin.DojoNinjas.Services.DojoService;
import com.godwin.DojoNinjas.models.Dojo;

@Controller
@RequestMapping("/Dojo")
public class DojoController {
	@Autowired
	private DojoService dj;
	
	@RequestMapping("/new")
	public String getHomePage(@Valid @ModelAttribute("Dojo") Dojo dojo , BindingResult result) {
		if(result.hasErrors()) {
			return "Dojo";
		}
		return "Dojo";
	}
//	saving user data 
	@PostMapping("/new/create")
	public String newDojo(@Valid @ModelAttribute("Dojo") Dojo dojo , BindingResult result ){
		if(result.hasErrors()) {
			return "Dojo";
		}
		dj.create(dojo);
		System.out.println("IS IT GETTING HERE?????");
		return "redirect:/Dojo/new";
	}
	
	@RequestMapping("/showPage")
	public String showPage() {
		return "showPage";
	}
	
	@RequestMapping("/{id}")
	public String showPage(@PathVariable("id") Long id , Model model) {
		Optional<Dojo> dojo = dj.find(id);
		model.addAttribute("dojo",dojo.get());
		return "showPage";
		
	}
	

}