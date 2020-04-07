package com.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewBasicBootController {
	@RequestMapping("/basic-boot")
	public String showBasicBootPage() {
		return "basic-boot";
	}
}
