package com.example.demo.uss.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.service.UserServiceImpl;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("users")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class UserController {
	private final UserServiceImpl userService;
	
	@GetMapping("")
	public ResponseEntity<Long> getCount() {
		System.out.println("getCount()");
		
		return new ResponseEntity<> (userService.count(), HttpStatus.OK);
	}

	@GetMapping("")
	public ResponseEntity<List<User>> findAll(){
		System.out.println("getItemFindAll()");

		return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<?> doCreate(@RequestBody User user){
		System.out.println("doItemCreate()");
		userService.save(user);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/list/{id}")
	public ResponseEntity<User> getOne(@PathVariable long id){
		System.out.println("getItemOne()");
		
		return new ResponseEntity<>(userService.getOne(id), HttpStatus.OK);
	}

	@GetMapping("/item-number/{id}")
	public ResponseEntity <Optional<User>> findById(@PathVariable long id){
		System.out.println("getItemFindOne()");

		return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/item-number/delete/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable long id){
		System.out.println("doItemDeleteById()");
		userService.deleteById(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
