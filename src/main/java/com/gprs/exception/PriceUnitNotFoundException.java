package com.gprs.exception;

public class PriceUnitNotFoundException  extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3380264836863395114L;

	public PriceUnitNotFoundException(String message) {
		super(message);
	}

	public PriceUnitNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
