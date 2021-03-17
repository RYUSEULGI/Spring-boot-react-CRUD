package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.bbs.domain.Board;

public interface BoardService {
	public long count();
	public void deleteById(long id);
	public void deleteAll(Iterable<Board> entities);
	public Optional<Board> findById(long id);
	public List<Board> findAllById(Iterable<Board> ids);
	public Optional <Board> findOne(Board board);
	public List<Board> findAll();
	public Board save(Board entity);
	public List<Board> saveAll(Iterable<Board> entities);
	public boolean existsById(long id);
	public Board getOne(long id);
}