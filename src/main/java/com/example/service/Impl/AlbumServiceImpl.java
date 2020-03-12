package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mapper.AlbumMapper;
import com.example.po.Album;
import com.example.po.Content;
import com.example.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService{

	@Autowired
	private AlbumMapper albumMapper;
	@Override
	public void insert(Album a) {
		// TODO Auto-generated method stub
		albumMapper.insert(a);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		albumMapper.delete(id);
	}

	@Override
	public void update(Album a) {
		// TODO Auto-generated method stub
		albumMapper.update(a);
	}

	@Override
	public List<Album> selectAll() {
		// TODO Auto-generated method stub
		return albumMapper.selectAll();
	}

	@Override
	public Album getSingle(Integer id) {
		// TODO Auto-generated method stub
		return albumMapper.getSingle(id);
	}

	@Override
	public List<Album> selectByTags(String tags) {
		// TODO Auto-generated method stub
		return albumMapper.selectByTags(tags);
	}

	@Override
	public List<Album> getAlbumByName(String name) {
		// TODO Auto-generated method stub
		return albumMapper.getAlbumByName(name);
	}

}
