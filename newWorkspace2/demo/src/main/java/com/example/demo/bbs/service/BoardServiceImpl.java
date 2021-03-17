package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bbs.domain.Board;
import com.example.demo.bbs.repository.BoardRepository;
import com.example.demo.cmm.service.AbstractService;

@Service
public class BoardServiceImpl extends AbstractService<Board>{
	@Autowired
	BoardRepository repo;
	
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
	public Optional<Board> findById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<Board> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Board save(Board entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	@Override
	public boolean existsById(long id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

	@Override
	public Board getOne(long id) {
		// TODO Auto-generated method stub
		return repo.getOne(id);
	}

}
