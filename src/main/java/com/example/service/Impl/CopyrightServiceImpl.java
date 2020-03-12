package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mapper.CopyrightMapper;
import com.example.po.Copyright;
import com.example.service.CopyrightService;




@Service
public  class CopyrightServiceImpl implements CopyrightService {
	@Autowired
	private CopyrightMapper copyrightMapper;
	@Override
	public Copyright getCopyrightById(int id) {
		return copyrightMapper.getCopyrightById(id);
	}

	@Override
	public void insertCopyright(Copyright copyright) {
		// TODO Auto-generated method stub
		copyrightMapper.insertCopyright(copyright);
	}

	@Override
	public void deleteCopyright(int id) {
		// TODO Auto-generated method stub
		copyrightMapper.deleteCopyright(id);
	}

	@Override
	public void updateCopyright(Copyright copyright) {
		// TODO Auto-generated method stub
		copyrightMapper.updateCopyright(copyright);
	}

	@Override
	public List<Copyright> getCopyrightByName(String name) {
		// TODO Auto-generated method stub
		return copyrightMapper.getCopyrightByName(name);
	}

}
