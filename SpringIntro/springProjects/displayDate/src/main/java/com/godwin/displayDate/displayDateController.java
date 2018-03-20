package com.godwin.displayDate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import  java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class displayDateController {
// this is the home page 
	@RequestMapping("")
	public String homePage() {
//		display a html that i set up
		return "homePage.jsp";
	}
	
//	route that hit the datePage method that i created
	@RequestMapping("/date")
//	model object allows me to save my data
//	and set a key 
	public String datePage(Model model) {
//		created a date object 
		Date date = new Date();
//		we created a date format object with the new  SimpleDateFormat
		SimpleDateFormat Dformat = new SimpleDateFormat("EEEE, dd MMM YYYY");
		// add addAttribute() add data in your views with is your essential page
//		dformat object that we created has a format method that to format the date data
		model.addAttribute("Date", Dformat.format(date));
//		we return the data in the datapage.jsp 
		return "dataPage.jsp";
	}
	//Date.now()
//	when i hit the time route 
//	request mapinng() looks for the time route 
	@RequestMapping("/time")
	
//	the Model object allows me to store date to our view 
//	we access the data with the key pair value
	public String timePage(Model model) {
//		i created a instantiate of a date object
//		and named it date 
		Date date = new Date();
//		i created a simpledate format  object  
//		and named it foramt
		SimpleDateFormat format = new SimpleDateFormat("hh :mm :ss a");
//		with the model object i created i will set the formated date object  with a key of 
//		time 
//		{" time" :  format.format(date)}
//		they key to access this in my view is 
		model.addAttribute("Time", format.format(date));
//		all of this data is going to the time page html 
		
		return "timePage.jsp";
	}
}
