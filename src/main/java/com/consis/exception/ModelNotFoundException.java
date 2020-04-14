package com.consis.exception;

//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.NOT_FOUND) //esta siendo manejado por el responseExceptionHandler
public class ModelNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 
	public ModelNotFoundException(String mensaje) {
		super(mensaje);
	}
	
	

}
