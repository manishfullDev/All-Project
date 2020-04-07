package com.jbv.constraint.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.jbv.constraint.validator.MatchAnyConstraintValidator;

@Constraint(validatedBy = MatchAnyConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
public @interface MatchAny {
	String message() default "Matching not found";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] values() default {};
}









