package com.example.service;

import java.util.List;

import com.example.po.Copyright;



public interface CopyrightService {
public Copyright getCopyrightById(int id);
	
	public void insertCopyright(Copyright copyright);
	
	public void deleteCopyright(int id);
	
	public void updateCopyright(Copyright copyright);
	
	public List<Copyright> getCopyrightByName(String name);



}