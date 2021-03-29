package com.example.demo.item.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.item.domain.Item;
import com.example.demo.item.repository.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl extends AbstractService<Item> implements ItemService {
	private final ItemRepository itemRepo;

	@Override
	public long count() {
		return itemRepo.count();
	}

	@Override
	public void deleteById(long id) {
		itemRepo.deleteById(id);
	}

	@Override
	public List<Item> findAll() {
		return itemRepo.findAll();
	}

	@Override
	public boolean existsById(long id) {
		return itemRepo.existsById(id);
	}

	@Override
	public Item getOne(long id) {
		return itemRepo.getOne(id);
	}

	@Override
	public Item detail(long itemNo) {
		return itemRepo.detail(itemNo);
	}

	@Override
	public void create(Item item) {
		itemRepo.create(item);
	}

	@Override
	public Optional<Item> findById(long id) {
		return itemRepo.findById(id);
	}

	@Override
	public Item save(Item entity) {
		return itemRepo.save(entity);
	}


	@Override
	public void delete(Item entity) {
		itemRepo.delete(entity);
	}

	@Override
	public long update(long id, Item item) {
		Item i = itemRepo.findById(id).orElseThrow();
		
		i.setItemBrand(item.getItemBrand());
		i.setItemColor(item.getItemColor());
		i.setItemName(item.getItemName());
		i.setModelNo(item.getModelNo());
		i.setReleaseDate(item.getReleaseDate());
		i.setSoldOut(item.getSoldOut());
		
		Item updateItem = itemRepo.save(i);
		return updateItem.getItemNo();
	}
}
