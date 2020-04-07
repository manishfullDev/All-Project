package com.fh.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fh.form.AddDoctorForm;
import com.fh.validator.AddDoctorFormValidator;

@Controller
@RequestMapping("/add-doctor.htm")
public class AddDoctorController {
	@Autowired
	private AddDoctorFormValidator validator;

	@GetMapping
	public String showAddDoctorForm(Model model) {
		AddDoctorForm addDoctorForm = null;

		addDoctorForm = new AddDoctorForm();
		model.addAttribute("addDoctorForm", addDoctorForm);
		return "add-doctor";
	}

	@PostMapping
	public String saveDoctor(@ModelAttribute("addDoctorForm") AddDoctorForm addDoctorForm, Errors errors, Model model) {
		String doctorNo = null;

		if (validator.supports(addDoctorForm.getClass())) {
			validator.validate(addDoctorForm, errors);
			if (errors.hasErrors()) {
				return "add-doctor";
			}
		}

		doctorNo = UUID.randomUUID().toString();
		model.addAttribute("doctorNo", doctorNo);

		return "add-doctor-success";
	}
}
