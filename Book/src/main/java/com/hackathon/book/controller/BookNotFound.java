package com.hackathon.book.controller;

public class BookNotFound extends RuntimeException{

	public BookNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BookNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BookNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
