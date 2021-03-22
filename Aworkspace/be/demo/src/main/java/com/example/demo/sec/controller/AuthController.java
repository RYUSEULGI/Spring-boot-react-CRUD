package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.util.Proxy;

import lombok.extern.java.Log;

@Log
@RestController
@RequestMapping(value ="/auth")
@CrossOrigin(origins="*")
public class AuthController extends Proxy{
	
	@GetMapping("/insertMany")
	public Map<String, Object> insertMany() {
		log.info("insertMany진입");
		
		Map<String, Object> map = new HashMap<>();
		map.put("data", "success");
		
		return map;
	}
}
