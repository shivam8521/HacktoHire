package com.hackathon.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.book.model.BookDetails;
import com.hackathon.book.model.Borrow;
import com.hackathon.book.model.Users;
import com.hackathon.book.service.BooksService;
import com.hackathon.book.service.UserService;


@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	UserService userService;
	
	
	@Autowired
	BooksService booksservice;
	
	
	@PostMapping("/borrow")
	public ResponseEntity<Users> addBorrow( @RequestBody  Borrow borrow)  {
		Users user= userService.findByUserName(borrow.getNames());
		
		List<BookDetails> bookdetails=booksservice.findByName(borrow.getBookId());
		
		if(bookdetails.size()<0) {
			throw new BookNotFound("NOT Available");
		}
		
		if(bookdetails.size()>3) {
			throw new Exception("more than 3 not allowed");
		}
		
		
		booksservice.save(bookdetails);
		
		
		return new ResponseEntity("Success",HttpStatus.OK);
	}
	
}
