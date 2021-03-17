package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.uss.domain.User;

public interface UserService {
	public long count();
	public void deleteById(long id);
	public void deleteAll(Iterable<User> entities);
	public Optional<User> findById(long id);
	public List<User> findAllById(Iterable<User> ids);
	public Optional <User> findOne(User user);
	public List<User> findAll();
	public User save(User entity);
	public List<User> saveAll(Iterable<User> entities);
	public boolean existsById(long id);
	public User getOne(long id);
}