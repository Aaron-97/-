package com.example.Mapper;

import java.util.List;

import com.example.po.Content;



public interface ContentMapper  {
public Content getContentById(int id);
	
	public void insertContent(Content content);
	
	public void deleteContent(int id);
	
	public void updateContent(Content content);
	
	public List<Content> getContentByName(String name);
}






