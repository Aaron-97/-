package com.example.Mapper;



import java.util.List;

import com.example.po.Index;


public interface IndexMapper {
public Index getIndexById(int id);
	
	public void insertIndex(Index index);
	
	public void deleteIndex(int id);
	
	public void updateIndex(Index index);
	
	public List<Index> getIndexByName(String name);
}

