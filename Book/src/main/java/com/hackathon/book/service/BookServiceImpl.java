package com.hackathon.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.book.Repository.BorrowRepository;
import com.hackathon.book.Repository.UserRepository;
import com.hackathon.book.model.BookDetails;
import com.hackathon.book.model.Borrow;
import com.hackathon.book.model.Users;


public class BookServiceImpl implements BooksService {

	@Autowired
	BorrowRepository borrowRepository;
	
	@Override
	public List<BookDetails> findByName(long borrowerId) {
		// TODO Auto-generated method stub
		return borrowRepository.findByBorrowerId(borrowerId);
	}

	@Override
	public List<Borrow> findByuuId(long uuid) {
		// TODO Auto-generated method stub
		return borrowRepository.findByuuId(uuid);
	}

}
