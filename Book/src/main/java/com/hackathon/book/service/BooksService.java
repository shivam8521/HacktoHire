package com.hackathon.book.service;

import java.util.List;

import com.hackathon.book.model.BookDetails;
import com.hackathon.book.model.Borrow;

public interface BooksService {

	List<BookDetails> findByName(long borrowerId);
	List<Borrow> findByuuId(long uuid);
}
