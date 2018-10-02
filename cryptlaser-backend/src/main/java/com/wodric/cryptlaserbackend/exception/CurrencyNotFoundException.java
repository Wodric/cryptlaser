package com.wodric.cryptlaserbackend.exception;

public class CurrencyNotFoundException extends RuntimeException{
	public CurrencyNotFoundException(long id){
		super("Currency doesn't exist with id " + id);
	}
}
