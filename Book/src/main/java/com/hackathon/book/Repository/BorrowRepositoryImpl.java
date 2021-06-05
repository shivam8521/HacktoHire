package com.hackathon.book.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.book.model.BookDetails;
import com.hackathon.book.model.Borrow;

public class BorrowRepositoryImpl implements BorrowRepository {

	
	@Override
	public List<BookDetails> findByBorrowerId(long borrowerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Borrow> findByuuId(long uuid) {
		// TODO Auto-generated method stub
		return null;
	}

}
