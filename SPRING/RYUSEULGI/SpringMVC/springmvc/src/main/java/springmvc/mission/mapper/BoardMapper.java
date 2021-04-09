package springmvc.mission.mapper;

import java.util.List;

import springmvc.mission.domain.Board;

public interface BoardMapper {
	public List<Board> list();
	public void insert(Board board);
	public List<Board> read(long id);
	public void update(Board board);
	public void delete(long id);
}
