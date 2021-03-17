package com.example.demo.cmm.service;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T> {
	public abstract long count();
	public abstract void deleteById(long id);
	public abstract Optional<T> findById(long id);
	public abstract List<T> findAll();
	public abstract T save(T entity);
	public abstract boolean existsById(long id);
	public abstract T getOne(long id);
}
 