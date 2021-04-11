package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.Board;
import com.test.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<Board> list() {
		return boardMapper.list();
	}

	@Override
	public void insert(Board board) {
		boardMapper.insert(board);
	}

	@Override
	public void update(Board board) {
		boardMapper.update(board);
	}

	@Override
	public void delete(long id) {
		boardMapper.delete(id);
	}

	@Override
	public Board read(long id) {
		return boardMapper.read(id);
	}
	
}
