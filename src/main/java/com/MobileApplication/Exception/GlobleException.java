package com.MobileApplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleException {
	@ExceptionHandler (NameNotFoundException.class)
	
	public ResponseEntity<Object> NameNot (NameNotFoundException ne) {
		return new ResponseEntity<Object>(ne.getMessage(),HttpStatus.NOT_FOUND);
		
		
	}

//	@ExceptionHandler (IdNotFoundException.class)
//	
//	public ResponseEntity<Object> IdNot(IdNotFoundException ie) {
//		return new ResponseEntity<Object>(ie.getMessage(),HttpStatus.NOT_FOUND);
//	}
	
//@ExceptionHandler (StringIndexOutOfBoundException.class)
//	
//	public ResponseEntity<Object> StringOut(StringIndexOutOfBoundException ie) {
//		return new ResponseEntity<Object>(ie.getMessage(),HttpStatus.NOT_FOUND);
//	}

@ExceptionHandler(StringIndexOutOfBoundsException.class)
public ResponseEntity<String> handleStringOutOfBounds(StringIndexOutOfBoundsException ex) {
    return new ResponseEntity<>("Custom: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(IdNotFoundException.class)
public ResponseEntity<String> handleIdNotFound(IdNotFoundException ex) {
    return new ResponseEntity<>("Custom: " + ex.getMessage(), HttpStatus.NOT_FOUND);
}
}
