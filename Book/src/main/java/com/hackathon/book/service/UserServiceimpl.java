package com.hackathon.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.book.Repository.UserRepository;
import com.hackathon.book.model.Users;

public class UserServiceimpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Users findByUserName(String UserName) {
		return userRepository.findByUserName(UserName);
		
	}

}
