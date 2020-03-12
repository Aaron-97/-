package com.example.Mapper;

import java.util.List;

import com.example.po.Album;

public interface AlbumMapper {

	public void insert(Album a);
	public void delete(Integer id);
	public void update(Album a);
	public List<Album> selectAll();
	public Album getSingle(Integer id);
	public  List<Album> selectByTags(String tags);
	public List<Album> getAlbumByName(String name);
	
}
