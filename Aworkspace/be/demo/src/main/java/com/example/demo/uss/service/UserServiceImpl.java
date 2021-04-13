package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends AbstractService<User> implements UserService {
	private final UserRepository userRepo;

	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public User save(User entity) {
		return userRepo.save(entity);
	}

	@Override
	public Optional<User> findById(long id) {
		return userRepo.findById(id);
	}

	@Override
	public long count() {
		return userRepo.count();
	}

	@Override
	public void deleteById(long id) {
		userRepo.deleteById(id);
	}

	@Override
	public boolean existsById(long id) {
		return userRepo.existsById(id);
	}

	@Override
	public User getOne(long id) {
		return userRepo.getOne(id);
	}

	@Override
	public void delete(User entity) {
		userRepo.delete(entity);
	}

	@Override
	public String login(String username, String password) {
		return userRepo.login(username, password);
	}
}
