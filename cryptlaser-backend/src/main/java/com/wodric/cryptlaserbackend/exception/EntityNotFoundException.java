package com.wodric.cryptlaserbackend.exception;

public class EntityNotFoundException extends RuntimeException{
	public EntityNotFoundException(long id, Class entityClass){
		super(entityClass.getName() + " doesn't exist with id " + id);
	}
}
