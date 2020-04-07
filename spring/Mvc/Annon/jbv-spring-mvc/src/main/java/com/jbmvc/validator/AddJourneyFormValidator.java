package com.jbmvc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jbmvc.form.AddJourneyForm;

@Component
public class AddJourneyFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(AddJourneyForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		AddJourneyForm form = (AddJourneyForm) target;

		if (errors.hasFieldErrors("source") == false) {
			if (!form.getSource().equals("Hyderabad")) {
				errors.rejectValue("source", "source.invalid");
			}
		}
	}

}
