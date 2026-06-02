package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;




public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUser(long id) {
		
		return userRepository.findById(id).get();
	}

}
