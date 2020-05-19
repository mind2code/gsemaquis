package com.mind2codes.gsemaquis.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Impossible de créer la liaison")
public class LiaisonNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1453229325414304962L;
	
	

}
