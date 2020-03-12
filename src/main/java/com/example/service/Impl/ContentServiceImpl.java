package com.example.service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mapper.ContentMapper;
import com.example.po.Content;
import com.example.service.ContentService;




@Service
public  class ContentServiceImpl implements ContentService {
	@Autowired
	private ContentMapper contentMapper;
	@Override
	public Content getContentById(int id) {
		return contentMapper.getContentById(id);
	}

	@Override
	public void insertContent(Content content) {
		// TODO Auto-generated method stub
		contentMapper.insertContent(content);
	}


	@Override
	public void deleteContent(int id) {
		// TODO Auto-generated method stub
		contentMapper.deleteContent(id);
	}

	@Override
	public void updateContent(Content content) {
		// TODO Auto-generated method stub
		contentMapper.updateContent(content);
	}

	@Override
	public List<Content> getContentByName(String name) {
		// TODO Auto-generated method stub
		return contentMapper.getContentByName(name);
	}

}
