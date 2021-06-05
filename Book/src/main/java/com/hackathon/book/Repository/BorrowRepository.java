package com.hackathon.book.Repository;

import java.util.List;

import com.hackathon.book.model.BookDetails;
import com.hackathon.book.model.Borrow;

public interface BorrowRepository {

	List<BookDetails> findByBorrowerId(long borrowerId);
	List<Borrow> findByuuId(long uuid);
}
