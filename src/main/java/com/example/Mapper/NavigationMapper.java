package com.example.Mapper;



import java.util.List;

import com.example.po.Navigation;



public interface NavigationMapper {
public Navigation getNavigationById(int id);
	
	public void insertNavigation(Navigation navigation);
	
	public void deleteNavigation(int id);
	
	public void updateNavigation(Navigation navigation);
	
	public List<Navigation> getNavigationByName(String name);
}