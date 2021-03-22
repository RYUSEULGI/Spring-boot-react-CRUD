package com.example.demo.cmm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@RestController
@Log
public class HomeController{
	
	@GetMapping("/")
	public String getHome(){
		log.info("getHome()");
		
		return "hello";
	}
}
