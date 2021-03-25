package com.example.demo.item.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.item.domain.Item;
import com.example.demo.item.service.ItemServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor
@RequestMapping(value="/items")
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class ItemController {
	private final ItemServiceImpl itemService;
	
	@GetMapping("/count")
	public ResponseEntity<Long> count(){
		System.out.println("getItemCount()");
		
		return new ResponseEntity<>(itemService.count(), HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<?> doCreate(@RequestBody Item item){
		System.out.println("doItemCreate()");
		itemService.save(item);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/item-number/{itemNo}")
	public ResponseEntity<Item> detail(long itemNo) {
		System.out.println("getItemDetail()");

		return new ResponseEntity<>(itemService.detail(itemNo), HttpStatus.OK);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> deleteById(@PathVariable long id){
		System.out.println("getItemDeleteById()");

		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Item>> findAll(){
		System.out.println("getItemFindAll()");

		return new ResponseEntity<>(itemService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/exist/{id}")
	public ResponseEntity<Boolean> existsById(@PathVariable long id){
		System.out.println("getItemExistsById()");

		return new ResponseEntity<>(itemService.existsById(id), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Item> getOne(@PathVariable long id){
		System.out.println("getItemOne()");

		return new ResponseEntity<>(itemService.getOne(id), HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <Optional<Item>> findById(@PathVariable long id){
		System.out.println("getItemFindOne()");

		return new ResponseEntity<>(itemService.findById(id), HttpStatus.OK);
	}
}
