package com.boot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.web.dto.CompanyDto;
import com.boot.web.service.CompanyService;

@Controller
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@RequestMapping("/companies")
	public String showCompanies(Model model) {
		List<CompanyDto> companies = null;

		companies = companyService.getCompanies();
		model.addAttribute("companies", companies);
		model.addAttribute("devtools", "enabled");

		return "companies";
	}
}
