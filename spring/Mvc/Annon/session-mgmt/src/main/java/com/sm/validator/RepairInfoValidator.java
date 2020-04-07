package com.sm.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sm.form.JobSheetForm;

@Component
public class RepairInfoValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(JobSheetForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		JobSheetForm form = (JobSheetForm) target;

		if (form.getRepairInfo() == null || form.getRepairInfo().trim().length() == 0) {
			errors.rejectValue("repairInfo", "repairInfo.blank");
		}
	}

}











