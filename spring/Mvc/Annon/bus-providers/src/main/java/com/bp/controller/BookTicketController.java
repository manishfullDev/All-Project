package com.bp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bp.dto.JourneyDto;
import com.bp.form.TicketForm;
import com.bp.service.JourneyService;
import com.bp.validator.TicketFormValidator;

@Controller
@RequestMapping("/bookTicket.htm")
public class BookTicketController {
	@Autowired
	private JourneyService journeyService;

	@Autowired
	private TicketFormValidator validator;

	@GetMapping
	public String showBookTicketFormPage(@RequestParam("journeyId") int journeyId, Model model) {
		JourneyDto journeyDto = null;
		TicketForm form = null;

		journeyDto = journeyService.getJourney(journeyId);
		form = new TicketForm();
		form.setJourneyId(journeyDto.getJourneyId());
		form.setSource(journeyDto.getSource());
		form.setDestination(journeyDto.getDestination());
		form.setBusProviderName(journeyDto.getBusProviderName());
		form.setPrice(journeyDto.getPrice());
		form.setJourneyDate(journeyDto.getTravelDate());

		model.addAttribute("ticketForm", form);

		return "book-ticket";
	}

	@PostMapping
	public String bookTicket(@ModelAttribute("ticketForm") TicketForm ticketForm, Errors errors, Model model) {
		int ticketNo = 0;

		if (validator.supports(ticketForm.getClass())) {
			validator.validate(ticketForm, errors);
			if (errors.hasErrors()) {
				return "book-ticket";
			}
		}

		ticketNo = journeyService.bookTicket(ticketForm);
		model.addAttribute("ticketNo", ticketNo);

		return "ticket-details";
	}

}
