package com.Elc.GlobleException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Elc.Exception.PriceException;

public class GlobleException {
	@ExceptionHandler (PriceException.class)
	public ResponseEntity<Object> nameNot(PriceException ne)
	{
		return new ResponseEntity<Object>(ne.getMessage(),HttpStatus.NOT_FOUND);
	}

}


