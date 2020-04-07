package com.fh.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.fh.form.AddDoctorForm;
import static com.fh.utils.ValidationUtils.*;

@Component
public class AddDoctorFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(AddDoctorForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		AddDoctorForm form = (AddDoctorForm) target;

		if (isEmpty(form.getDoctorName())) {
			errors.rejectValue("doctorName", "doctorName.blank");
		}

		if (isEmpty(form.getSpecialization())) {
			errors.rejectValue("specialization", "specialization.blank");
		}

		if (isEmpty(form.getQualification())) {
			errors.rejectValue("qualification", "qualification.blank");
		}

		if (form.getExperience() < 0) {
			errors.rejectValue("experience", "experience.notvalid");
		}

		if (errors.hasFieldErrors("age") == false) {
			if (form.getAge() < 25 || form.getAge() > 100) {
				errors.rejectValue("age", "age.invalidLimit");
			}
		}

		if (isEmpty(form.getGender())) {
			errors.rejectValue("gender", "gender.blank");
		}
		if (isEmpty(form.getContactNo())) {
			errors.rejectValue("contactNo", "contactNo.blank");
		}
		if (isEmpty(form.getEmailAddress())) {
			errors.rejectValue("emailAddress", "emailAddress.blank");
		}
	}

}
