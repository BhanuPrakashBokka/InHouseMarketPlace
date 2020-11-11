package com.cg.InHouseMarketPlace.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidOfferException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public InvalidOfferException() {
		super();
	}

	public InvalidOfferException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidOfferException(String message) {
		super(message);
	}

	public InvalidOfferException(Throwable cause) {
		super(cause);
	}

}
