package com.wodric.cryptlaserbackend.exception;

public class ApiCallsException extends RuntimeException{
	public ApiCallsException(Exception e){
		super("Error during external API call" + e);
	}
}
