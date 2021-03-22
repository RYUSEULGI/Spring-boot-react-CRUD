package com.example.demo.uss.service;

import com.example.demo.uss.domain.UserDto;

public interface UserService{
	
	public UserDto login(String username, String password);
}