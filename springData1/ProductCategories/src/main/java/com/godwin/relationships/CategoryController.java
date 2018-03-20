package com.godwin.relationships;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.godwin.relationships.models.Category;
import com.godwin.relationships.services.CategoryService;

@Controller
@RequestMapping("")
public class CategoryController {

//	how do you talk to your data base in your contoler
//	we import are Cateroy Service which will allow me 
//	to this 
	private CategoryService cS;
	
//	dependence inject to my models can have 
//	methods that i already created
	public CategoryController(CategoryService cS) {
		this.cS = cS;
	}
	
	@RequestMapping("/new")
	public String categories(Model model) {
//		when user enter a new catergory  it will create
		model.addAttribute("category", new Category());
		return "categories";
	}
	
	
	
}
