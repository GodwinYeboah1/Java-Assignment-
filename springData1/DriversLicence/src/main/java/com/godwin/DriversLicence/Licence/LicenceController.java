package com.godwin.DriversLicence.Licence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LicenceController {

	
	@RequestMapping("")
	public String getLience() {
		System.out.println("just got to the licence page");
		return "Licence";
		}
	
	}
