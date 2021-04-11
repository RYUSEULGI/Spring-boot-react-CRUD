package com.test.mapper;

import java.util.List;

import com.test.domain.Board;

public interface BoardMapper {
	public List<Board> list();
	public void insert(Board board);
	public Board read(long id);
	public void update(Board board);
	public void delete(long id);
}
