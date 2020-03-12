package com.example.Mapper;


import java.util.List;

import com.example.po.Snavigation;



public interface SnavigationMapper {
public Snavigation getSnavigationById(int id);
	
	public void insertSnavigation(Snavigation snavigation);
	
	public void deleteSnavigation(int id);
	
	public void updateSnavigation(Snavigation snavigation);
	
	public List<Snavigation> getSnavigationByName(String name);
}