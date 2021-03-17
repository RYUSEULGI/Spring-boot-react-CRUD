package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bbs.domain.Article;
import com.example.demo.bbs.repository.ArticleRepository;
import com.example.demo.cmm.service.AbstractService;

@Service
public class ArticleServiceImpl extends AbstractService<Article>{
	@Autowired
	ArticleRepository repo;
	
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
	public Optional<Article> findById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Article save(Article entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	@Override
	public boolean existsById(long id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

	@Override
	public Article getOne(long id) {
		// TODO Auto-generated method stub
		return repo.getOne(id);
	}

}
