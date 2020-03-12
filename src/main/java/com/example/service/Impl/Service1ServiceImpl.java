package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mapper.Service1Mapper;
import com.example.po.Service1;
import com.example.service.Service1Service;





@Service
public  class Service1ServiceImpl implements Service1Service {
	@Autowired
	private Service1Mapper service1Mapper;
	@Override
	public Service1 getService1ById(int id) {
		return service1Mapper.getService1ById(id);
	}

	@Override
	public void insertService1(Service1 service1) {
		// TODO Auto-generated method stub
		service1Mapper.insertService1(service1);
	}

	@Override
	public void deleteService1(int id) {
		// TODO Auto-generated method stub
		service1Mapper.deleteService1(id);
	}

	@Override
	public void updateService1(Service1 service1) {
		// TODO Auto-generated method stub
		service1Mapper.updateService1(service1);
	}

	@Override
	public List<Service1> getService1ByName(String name) {
		// TODO Auto-generated method stub
		return service1Mapper.getService1ByName(name);
	}

}
