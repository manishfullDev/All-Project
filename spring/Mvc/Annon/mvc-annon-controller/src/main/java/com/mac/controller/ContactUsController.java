package com.mac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactUsController {
	@RequestMapping("/contact-us.htm")
	public String showContactUsPage() {
		return "contact-us";
	}
}
