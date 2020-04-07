package com.sm.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sm.form.JobSheetForm;

@Component
public class JobSheetValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(JobSheetForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		JobSheetForm form = (JobSheetForm) target;

		if (form.getOwnerName() == null || form.getOwnerName().trim().length() == 0) {
			errors.rejectValue("ownerName", "ownerName.blank");
		}

	}

}
