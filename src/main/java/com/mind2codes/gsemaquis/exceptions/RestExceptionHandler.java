package com.mind2codes.gsemaquis.exceptions;


import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

//	@ExceptionHandler(EntityNotFoundException.class)
//    private ResponseEntity<ErrorModel> handleEntityNotFound(EntityNotFoundException ex){
//        ErrorModel error = new ErrorModel(HttpStatus.NOT_FOUND, "Entity not found", ex.getMessage());
//
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }
}
