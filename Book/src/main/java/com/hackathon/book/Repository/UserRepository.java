package com.hackathon.book.Repository;

import java.util.List;

import com.hackathon.book.model.Users;

public interface UserRepository  {

	Users findByUserName(String UserName);
	
}

