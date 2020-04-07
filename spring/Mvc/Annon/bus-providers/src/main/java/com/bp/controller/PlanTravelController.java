package com.bp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bp.dto.BusProviderDto;
import com.bp.dto.JourneyDto;
import com.bp.form.PlanTravelForm;
import com.bp.service.BusProviderService;
import com.bp.service.JourneyService;

@Controller
@RequestMapping("/plan-travel.htm")
public class PlanTravelController {
	@Autowired
	private BusProviderService busProviderService;
	@Autowired
	private JourneyService journeyService;

	@RequestMapping(method = RequestMethod.GET)
	public String showPlanTravelPage(Model model) {
		List<BusProviderDto> busProviders = null;

		busProviders = busProviderService.getActiveBusProviders();
		model.addAttribute("busProviders", busProviders);

		return "plan-travel";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String searchJourneys(@ModelAttribute PlanTravelForm planTravelForm, Model model) {
		List<JourneyDto> matchingJourneys = null;

		matchingJourneys = journeyService.getMatchingJourneys(planTravelForm);
		model.addAttribute("journeys", matchingJourneys);

		return "journeys";
	}

}
