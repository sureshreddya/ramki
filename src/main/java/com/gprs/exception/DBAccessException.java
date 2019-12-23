package com.gprs.exception;

public class DBAccessException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 673305270869952970L;

	public DBAccessException() {
		super();
	}

	public DBAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DBAccessException(String message, Throwable cause) {
		super(message, cause);
	}

	public DBAccessException(String message) {
		super(message);
	}

	public DBAccessException(Throwable cause) {
		super(cause);
	}

	
}
