package br.com.foursys.api.service.exceptions;

public class DataIntegrityViolationException extends RuntimeException{
	
	public DataIntegrityViolationException (String message) {
		super(message);
	}
}
