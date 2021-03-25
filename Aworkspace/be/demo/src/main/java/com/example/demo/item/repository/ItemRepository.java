package com.example.demo.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.item.domain.Item;

interface ItemCustomRepository{}

public interface ItemRepository extends JpaRepository<Item, Long>,
											ItemCustomRepository{
	@Query(value = "SELECT * FROM items i WHERE i.item_no = :itemNo", nativeQuery = true)
	public void create(@Param("itemNo") Item item);
	
	@Query(value = "INSERT INTO items i SELECT * FROM 0", nativeQuery = true)
	public Item detail(long itemNo);
}
