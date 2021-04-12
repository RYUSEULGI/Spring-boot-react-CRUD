package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.domain.Board;
import com.test.service.BoardService;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/list.do")
	public ModelAndView list() {
		List<Board> list = service.list();
		
		ModelAndView mv = new ModelAndView("board/list", "list", list);
		
		return mv;
	}
	
	@GetMapping("/write.do")
	public String getWrite() {
		log.info("getWrite");
		
		return "board/write";
	}
	
	@PostMapping("/write.do")
	public String doWrite(Board board) {
		log.info("doWrite");
		service.insert(board);
		
		return "redirect:list.do";
	}
	
	@GetMapping("/content.do")
	public ModelAndView getContent(@RequestParam long id) {
		log.info("getContent");
		
		Board board = service.read(id);
		ModelAndView mv = new ModelAndView("board/content", "board", board);
		
		return mv;
	}
	
	@GetMapping("/update.do")
	public ModelAndView getUpdate(long id) {
		log.info("getUpdate");
		Board board = service.read(id);
		
		return new ModelAndView("/board/update", "board", board);
	}
	
	@PostMapping("/update.do")
	public String doUpdate(Board board) {
		log.info("doUpdate");
		service.update(board);
		
		return "redirect:list.do";
	}
	
	@GetMapping("/delete.do")
	public String getDelete(long id) {
		log.info("getDelete ");
		service.delete(id);
		
		return "redirect:list.do";
	}

}
