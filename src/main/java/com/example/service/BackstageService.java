package com.example.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sun.mail.imap.protocol.ID;

import com.example.service.BaseService;

import com.example.po.Backstage;
import com.example.po.BackstageDTO;



public interface BackstageService {

	public List<Backstage> all();
	
	public void add(Backstage t );
	
	public void update(Backstage t);
	
	public List<Backstage> queryname(String name);

	public void updateSort(Integer sort,Integer id);
	public List<BackstageDTO> getAllBackstageDTO();

	Backstage one(Integer id);

	void delete(Integer navId);

}
