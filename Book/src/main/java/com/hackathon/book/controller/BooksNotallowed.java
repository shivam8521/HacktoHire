package com.hackathon.book.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class BooksNotallowed {

	@ControllerAdvice
	public class StudentExceptionHandler {

		@ExceptionHandler
		public ResponseEntity<ErrorResponse> handleException(BookNotFound exc){
			
			ErrorResponse error = new ErrorResponse();
			
			error.setStatus(HttpStatus.NOT_FOUND.value());
			error.setMessage(exc.getMessage());
			error.setTimestamp(System.currentTimeMillis());
			
			return new ResponseEntity<ErrorResponse>(error,HttpStatus.NOT_FOUND);
			
		}
		@ExceptionHandler
		public ResponseEntity<ErrorResponse> handleException(Exception exc){
			
			ErrorResponse error = new ErrorResponse();
			
			error.setStatus(HttpStatus.BAD_REQUEST.value());
			error.setMessage(exc.getMessage());
			error.setTimestamp(System.currentTimeMillis());
			
			return new ResponseEntity<ErrorResponse>(error,HttpStatus.BAD_REQUEST);
		}
}
	}
