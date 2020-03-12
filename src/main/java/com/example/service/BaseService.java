package com.example.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T,ID extends Serializable> {
	
	public void insert(T t);
	
	public void update(T t);
	
	public void delete(int id);
	
	public T selectById(int id);
	
	public List<T> selectAll();
}
