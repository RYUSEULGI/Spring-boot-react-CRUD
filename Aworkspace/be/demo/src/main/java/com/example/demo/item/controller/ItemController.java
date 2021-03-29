package com.example.demo.item.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.item.domain.Item;
import com.example.demo.item.service.ItemServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor
@RequestMapping(value="/items")
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class ItemController {
	private final ItemServiceImpl itemService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Item>> findAll(){
		System.out.println("getItemFindAll()");

		return new ResponseEntity<>(itemService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<?> doCreate(@RequestBody Item item){
		System.out.println("doItemCreate()");
		itemService.save(item);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/list/{id}")
	public ResponseEntity<Item> getOne(@PathVariable long id){
		System.out.println("getItemOne()");
		
		return new ResponseEntity<>(itemService.getOne(id), HttpStatus.OK);
	}

	@GetMapping("/item-number/{id}")
	public ResponseEntity <Optional<Item>> findById(@PathVariable long id){
		System.out.println("getItemFindOne()");

		return new ResponseEntity<>(itemService.findById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/item-number/delete/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable long id){
		System.out.println("doItemDeleteById()");
		itemService.deleteById(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
