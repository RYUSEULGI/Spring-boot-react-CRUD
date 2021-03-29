package com.example.demo.item.service;

import com.example.demo.item.domain.Item;

public interface ItemService{
	public void create(Item item);
	public Item detail(long itemNo);
	public long update(long id, Item item);
}