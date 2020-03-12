package com.example.Mapper;

import java.util.List;

public interface BaseMapper<T> {
	public void  insert(T t)throws Exception;
	
	public void delete(int id)throws Exception;
	
	public void update(T t)throws Exception;
	
	public T getById(int id)throws Exception;
	
	public List<T> getByName()throws Exception;
}
