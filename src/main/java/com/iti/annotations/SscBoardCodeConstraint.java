package com.iti.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.iti.validator.SscBoardCodeValidator;

@Documented
@Constraint(validatedBy = SscBoardCodeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SscBoardCodeConstraint {

	String message() default "SSC/8th Board is required";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
