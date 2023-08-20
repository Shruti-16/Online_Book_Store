package com.onlinebookstore.bookstore.custom_exception;

@SuppressWarnings("serial")
public class UserAlreadyExistsException extends RuntimeException {
	public UserAlreadyExistsException(String mesg) {
		super(mesg);
	}
}
