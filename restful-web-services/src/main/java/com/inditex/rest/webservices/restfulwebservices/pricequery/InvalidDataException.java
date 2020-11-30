package com.inditex.rest.webservices.restfulwebservices.pricequery;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidDataException extends RuntimeException {

	public InvalidDataException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


}