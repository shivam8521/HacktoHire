package com.hackathon.book.service;

import java.util.List;

import com.hackathon.book.model.Users;

public interface UserService {
	public Users findByUserName(String UserName);
	
}
