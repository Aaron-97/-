package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mapper.IndexMapper;
import com.example.po.Index;
import com.example.service.IndexService;



@Service
public  class IndexServiceImpl implements IndexService {
	@Autowired
	private IndexMapper indexMapper;
	@Override
	public Index getIndexById(int id) {
		return indexMapper.getIndexById(id);
	}

	@Override
	public void insertIndex(Index index) {
		// TODO Auto-generated method stub
		indexMapper.insertIndex(index);
	}

	@Override
	public void deleteIndex(int id) {
		// TODO Auto-generated method stub
		indexMapper.deleteIndex(id);
	}

	@Override
	public void updateIndex(Index index) {
		// TODO Auto-generated method stub
		indexMapper.updateIndex(index);
	}

	@Override
	public List<Index> getIndexByName(String name) {
		// TODO Auto-generated method stub
		return indexMapper.getIndexByName(name);
	}

}
