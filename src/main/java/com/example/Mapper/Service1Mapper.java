package com.example.Mapper;



import java.util.List;

import com.example.po.Service1;



public interface Service1Mapper {
public Service1 getService1ById(int id);
	
	public void insertService1(Service1 service1);
	
	public void deleteService1(int id);
	
	public void updateService1(Service1 service1);
	
	public List<Service1> getService1ByName(String name);
}