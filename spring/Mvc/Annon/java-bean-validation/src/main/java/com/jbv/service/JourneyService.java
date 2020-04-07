package com.jbv.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.jbv.bean.Journey;
import com.jbv.groups.Group1;

public class JourneyService {
	public void newJourney(Journey journey) {
		Validator validator = null;
		ValidatorFactory validatorFactory = null;
		Set<ConstraintViolation<Journey>> constraintViolations = null;

		validatorFactory = Validation.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();
		constraintViolations = validator.validate(journey, Group1.class);
		if (constraintViolations != null && constraintViolations.size() > 0) {
			for (ConstraintViolation<Journey> violation : constraintViolations) {
				System.out.println(violation.getMessage());
			}
			return;
		}
		// create the new journey into the system
		System.out.println("journey created");
	}
}









