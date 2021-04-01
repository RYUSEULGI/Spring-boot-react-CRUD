package com.example.demo.uss.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.service.UserServiceImpl;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping(value="/users")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class UserController {
	private final UserServiceImpl userService;
	
	@GetMapping("/list")
	public ResponseEntity<List<User>> findAll(){
		System.out.println("getUSerList()");

		return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<?> doCreate(@RequestBody User user){
		System.out.println("doUserCreate()" + user.toString());
		userService.save(user);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> doLogin(@RequestBody User user){
		System.out.println("doItemCreate()");
		userService.login(user);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
