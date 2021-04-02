package com.example.demo.uss.service;

import com.example.demo.uss.domain.User;

public interface UserService{
	public User login(String username, String password);
}