package com.gprs.rest.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gprs.exception.DBAccessException;
import com.gprs.exception.PriceUnitNotFoundException;
import com.gprs.rest.response.ErrorResponse;
import com.gprs.rest.response.SuccessResponse;

@ControllerAdvice
public class RestControllerAdvice {

	@ExceptionHandler
	  public ResponseEntity<ErrorResponse> handleException(PriceUnitNotFoundException exc){
		  
		  ErrorResponse errorResponse=new ErrorResponse();
		  errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		  errorResponse.setMessage(exc.getMessage());
		  String dateTime=LocalDateTime.of(LocalDate.now(),LocalTime.now()).toString();
		  errorResponse.setTimestamp(dateTime);
		  return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	  }
	  @ExceptionHandler
	  public ResponseEntity<ErrorResponse> handleException(Exception exc){
		  
		  ErrorResponse errorResponse=new ErrorResponse();
		  errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		  errorResponse.setMessage(exc.getMessage());
		  String dateTime=LocalDateTime.of(LocalDate.now(),LocalTime.now()).toString();
		  errorResponse.setTimestamp(dateTime);
		  return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
	  }
	  
	  @ExceptionHandler
	  public ResponseEntity<SuccessResponse> handleException(DBAccessException exc){
		  SuccessResponse response=new SuccessResponse();
		  response.setStatus(HttpStatus.CONFLICT.toString());
		  response.setMessage(exc.getMessage());
		  return new ResponseEntity<SuccessResponse>(response,HttpStatus.CONFLICT);
	  }
}
