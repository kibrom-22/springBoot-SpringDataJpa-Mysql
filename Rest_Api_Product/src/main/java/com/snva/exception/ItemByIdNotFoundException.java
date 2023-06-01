package com.snva.exception;

public class ItemByIdNotFoundException extends RuntimeException{
	
    public ItemByIdNotFoundException(String errorMessage) {
    	super(errorMessage);
    }
}
