package springmvc.mission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.mission.domain.Board;
import springmvc.mission.mapper.BoardMapper;

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
	public List<Board> read(long id) {
		return boardMapper.read(id);
	}

	@Override
	public void update(Board board) {
		boardMapper.update(board);
	}

	@Override
	public void delete(long id) {
		boardMapper.delete(id);
	}
	
}
