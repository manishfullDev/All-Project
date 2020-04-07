package com.bp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bp.form.TicketForm;

@Component
public class TicketFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(TicketForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		TicketForm form = null;

		form = (TicketForm) target;

		if (isEmpty(form.getPassengerName())) {
			errors.rejectValue("passengerName", "passengerName.blank");
		}
		if (isEmpty(form.getGender())) {
			errors.rejectValue("gender", "gender.blank");
		}
		if (errors.hasFieldErrors("age") == false) {
			if (form.getAge() <= 0 || form.getAge() > 100) {
				errors.rejectValue("age", "age.invalidRange");
			}
		}
		if (isEmpty(form.getMobileNo())) {
			errors.rejectValue("mobileNo", "mobileNo.blank");
		}
		if (isEmpty(form.getEmailAddress())) {
			errors.rejectValue("emailAddress", "emailAddress.blank");
		}
	}

	private boolean isEmpty(String s) {
		if (s == null || s.trim().length() == 0) {
			return true;
		}
		return false;
	}
}
