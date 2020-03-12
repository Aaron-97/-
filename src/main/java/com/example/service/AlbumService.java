package com.example.service;

import java.util.List;

import com.example.po.Album;


public interface AlbumService {

	public void insert(Album a);
	public void delete(Integer id);
	public void update(Album a);
	public List<Album> selectAll();
	public Album getSingle(Integer id);
	public  List<Album> selectByTags(String tags);
	List<Album> getAlbumByName(String name);
	
	
}
