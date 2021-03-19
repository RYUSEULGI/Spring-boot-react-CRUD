package com.example.demo.cmm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.util.Proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public abstract class HomeController extends Proxy{
	
	@GetMapping("/")
	public String inti() {
		print.accept("-----------");
		print.accept("boot init");
		print.accept("-----------");
		
		return "hello";
	}
}
