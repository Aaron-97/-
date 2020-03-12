package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mapper.NavigationMapper;
import com.example.po.Navigation;
import com.example.service.NavigationService;





@Service
public  class NavigationServiceImpl implements NavigationService {
	@Autowired
	private NavigationMapper navigationMapper;
	@Override
	public Navigation getNavigationById(int id) {
		return navigationMapper.getNavigationById(id);
	}

	@Override
	public void insertNavigation(Navigation navigation) {
		// TODO Auto-generated method stub
		navigationMapper.insertNavigation(navigation);
	}

	@Override
	public void deleteNavigation(int id) {
		// TODO Auto-generated method stub
		navigationMapper.deleteNavigation(id);
	}

	@Override
	public void updateNavigation(Navigation navigation) {
		// TODO Auto-generated method stub
		navigationMapper.updateNavigation(navigation);
	}

	@Override
	public List<Navigation> getNavigationByName(String name) {
		// TODO Auto-generated method stub
		return navigationMapper.getNavigationByName(name);
	}

}
