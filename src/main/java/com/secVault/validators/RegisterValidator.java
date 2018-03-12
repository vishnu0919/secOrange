package com.secVault.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class RegisterValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		
				return false;
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		
	}

	
}
