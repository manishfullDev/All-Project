package com.sm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.sm.form.JobSheetForm;
import com.sm.validator.JobSheetValidator;
import com.sm.validator.RepairInfoValidator;

import org.springframework.ui.Model;
import org.springframework.validation.Errors;

@Controller
@SessionAttributes({ "jobSheetForm" })
public class JobSheetController {
	@Autowired
	private JobSheetValidator jobSheetValidator;
	@Autowired
	private RepairInfoValidator repairInfoValidator;

	@RequestMapping(value = "/new-job-sheet.htm", method = RequestMethod.GET)
	public String showJobsheetForm(Model model) {
		JobSheetForm jobSheetForm = null;
		jobSheetForm = new JobSheetForm();

		model.addAttribute("jobSheetForm", jobSheetForm);

		return "new-job-sheet";
	}

	@RequestMapping(value = "/new-job-sheet.htm", method = RequestMethod.POST)
	public String validateJobSheetAndShowRepairInfo(@ModelAttribute("jobSheetForm") JobSheetForm jobSheetForm,
			Errors errors, Model model) {
		if (jobSheetValidator.supports(jobSheetForm.getClass())) {
			jobSheetValidator.validate(jobSheetForm, errors);
			if (errors.hasErrors()) {
				return "new-job-sheet";
			}
		}
		return "add-repair-info";
	}

	@RequestMapping(value = "/add-repair-info.htm", method = RequestMethod.POST)
	public String validateRepairInfoAndShowJobsheet(@ModelAttribute("jobSheetForm") JobSheetForm jobSheetForm,
			Errors errors, Model model) {
		if (repairInfoValidator.supports(jobSheetForm.getClass())) {
			repairInfoValidator.validate(jobSheetForm, errors);
			if (errors.hasErrors()) {
				return "add-repair-info";
			}
		}
		return "create-job-sheet";
	}

	@RequestMapping("/create-job-sheet.htm")
	public String createJobSheet(@SessionAttribute("jobSheetForm") JobSheetForm jobSheetForm,
			SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "success";
	}
}
