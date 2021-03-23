package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.util.Proxy;

@RestController
@RequestMapping(value ="/auth")
@CrossOrigin(origins="*")
public class AuthController extends Proxy{
	
	@GetMapping("/insertMany")
	public ResponseEntity<Map<String, Object>> insertMany() {
		print.accept("insertMany진입");
		
		Map<String, Object> map = new HashMap<>();
		map.put("data", "success");
		
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
}
