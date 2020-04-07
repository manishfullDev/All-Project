package com.jbv.constraint.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.jbv.constraint.annotations.MatchAny;

public class MatchAnyConstraintValidator implements ConstraintValidator<MatchAny, String> {
	protected String[] values;

	@Override
	public void initialize(MatchAny constraintAnnotation) {
		values = constraintAnnotation.values();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean valid = false;
		for (String v : values) {
			if (v.equals(value)) {
				valid = true;
				break;
			}
		}
		return valid;
	}

}
