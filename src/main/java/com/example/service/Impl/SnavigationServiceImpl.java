package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mapper.SnavigationMapper;
import com.example.po.Snavigation;
import com.example.service.SnavigationService;





@Service
public  class SnavigationServiceImpl implements SnavigationService {
	@Autowired
	private SnavigationMapper snavigationMapper;
	@Override
	public Snavigation getSnavigationById(int id) {
		return snavigationMapper.getSnavigationById(id);
	}

	@Override
	public void insertSnavigation(Snavigation snavigation) {
		// TODO Auto-generated method stub
		snavigationMapper.insertSnavigation(snavigation);
	}

	@Override
	public void deleteSnavigation(int id) {
		// TODO Auto-generated method stub
		snavigationMapper.deleteSnavigation(id);
	}

	@Override
	public void updateSnavigation(Snavigation snavigation) {
		// TODO Auto-generated method stub
		snavigationMapper.updateSnavigation(snavigation);
	}

	@Override
	public List<Snavigation> getSnavigationByName(String name) {
		// TODO Auto-generated method stub
		return snavigationMapper.getSnavigationByName(name);
	}

}
