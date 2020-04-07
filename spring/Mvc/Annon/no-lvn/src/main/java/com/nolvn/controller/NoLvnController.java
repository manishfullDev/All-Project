package com.nolvn.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoLvnController {
	@GetMapping("/no-lvn.htm")
	public ModelMap showNoLvn() {
		ModelMap modelMap = new ModelMap();

		modelMap.addAttribute("today", new Date());

		return modelMap;
	}
}
