package com.jbmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbmvc.dto.BusProviderDto;
import com.jbmvc.form.AddJourneyForm;
import com.jbmvc.validator.AddJourneyFormValidator;

@Controller
@RequestMapping("/add-journey.htm")
public class AddJourneyController {
	@Autowired
	private AddJourneyFormValidator addJourneyFormValidator;

	@InitBinder
	public void init(WebDataBinder binder) {
		System.out.println("initBinder()");
		binder.addValidators(addJourneyFormValidator);
	}

	@GetMapping
	public String showAddJourneyForm(Model model) {
		AddJourneyForm addJourneyForm = new AddJourneyForm();
		model.addAttribute("addJourneyForm", addJourneyForm);
		return "add-journey";
	}

	@PostMapping
	public String saveJourney(@ModelAttribute("addJourneyForm") @Validated AddJourneyForm addJourneyForm, Errors errors,
			Model model) {

		if (errors.hasErrors()) {
			return "add-journey";
		}

		return "success";
	}

	@ModelAttribute("busProviders")
	public List<BusProviderDto> populateBusProviders() {
		List<BusProviderDto> busProviders = null;

		busProviders = new ArrayList<BusProviderDto>();
		busProviders.add(new BusProviderDto(1, "Kaleswara"));
		busProviders.add(new BusProviderDto(2, "Morning Star"));
		busProviders.add(new BusProviderDto(3, "Kesineni"));
		busProviders.add(new BusProviderDto(4, "Orange Travels"));

		return busProviders;
	}
}
