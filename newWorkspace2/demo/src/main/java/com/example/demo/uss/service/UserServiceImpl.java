package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;

@Service
public class UserServiceImpl extends AbstractService<User>{
	@Autowired UserRepository repo;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return repo.count();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<User> findById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(User entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}


	@Override
	public boolean existsById(long id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

	@Override
	public User getOne(long id) {
		// TODO Auto-generated method stub
		return repo.getOne(id);
	}

}
