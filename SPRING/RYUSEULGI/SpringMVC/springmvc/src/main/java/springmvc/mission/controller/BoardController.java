package springmvc.mission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.java.Log;
import springmvc.mission.domain.Board;
import springmvc.mission.service.BoardService;

@Log
@Controller
@RequestMapping("/boards/*")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("list.do")
	public ModelAndView list() {
		List<Board> list = service.list();
		
		ModelAndView mv = new ModelAndView("board/list", "list", list);
		
		return mv;
	}
	
	@GetMapping("write.do")
	public String getWrite(Board board) {
		log.info("getWrite");
		service.insert(board);
		
		return "board/write";
	}
	
	@PostMapping("write.do")
	public String doWrite(Board board) {
		log.info("doWrite");
		service.insert(board);
		
		return "rediret:list.do";
	}
	
	@GetMapping("content.do")
	public ModelAndView getDetail(long id) {
		log.info("getDetail");
		List<Board> board = service.read(id);
		
		ModelAndView mv = new ModelAndView("board/content", "board", board);
		
		return mv;
	}
	
	@GetMapping("update.do")
	public String getUpdate(Board board) {
		log.info("getUpdate");
		service.update(board);
		
		return "board/update";
	}
	
	@PostMapping("update.do")
	public String doUpdate(Board board) {
		log.info("doUpdate");
		service.update(board);
		
		return "rediret:list.do";
	}
	
	@GetMapping("delete.do")
	public String getDelete(long id) {
		log.info("getDelete");
		service.delete(id);
		
		return "rediret:list.do";
	}

}
