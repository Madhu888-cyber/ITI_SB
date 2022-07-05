package com.iti.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.iti.annotations.SscBoardCodeConstraint;

public class SscBoardCodeValidator implements ConstraintValidator<SscBoardCodeConstraint, String>{
	
	public void initialize(SscBoardCodeConstraint ssc_board) {}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value != null && value.matches("[0-9]{1,2}") && (value.length() > 0 && value.length() < 61);
	}

}
