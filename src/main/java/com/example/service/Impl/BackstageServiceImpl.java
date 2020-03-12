package com.example.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mapper.BackstageMapper;

import com.example.po.Backstage;
import com.example.po.BackstageDTO;
import com.example.po.BackstageExample;
import com.example.po.BackstageExample.Criteria;

import com.example.service.BackstageService;




@Service
public class BackstageServiceImpl implements BackstageService {
    @Autowired
	private BackstageMapper backstageMapper;
	@Override
	public List<Backstage> all() {
		// TODO Auto-generated method stub
//		ArticleCateExample articlecateExample=new ArticleCateExample();
//	    Criteria criteria=	articlecateExample.createCriteria();
//	    //"select * from articlecate where pid in (0,1,2) "
//	    criteria.andPidEqualTo(0);
	  
		return backstageMapper.selectByExample(null);
	}


	@Override
	public void delete(Integer navId) {
		// TODO Auto-generated method stub
		backstageMapper.deleteByPrimaryKey(navId);
	}

	@Override
	public List<Backstage> queryname(String name) {
		// TODO Auto-generated method stub
		BackstageExample example=new BackstageExample();
		
		Criteria criteria=example.createCriteria();
		criteria.andNameLike("%"+name+"%");
		
		return backstageMapper.selectByExample(example);
		
	}

	@Override
	public void updateSort(Integer sort, Integer backId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Backstage one(Integer id) {
		// TODO Auto-generated method stub
		
		return backstageMapper.selectByPrimaryKey(id);
	}

	@Override
	public void add(Backstage t) {
		// TODO Auto-generated method stub
		backstageMapper.insertSelective(t);
		
	}

	@Override
	public void update(Backstage t) {
		// TODO Auto-generated method stub
		backstageMapper.updateByPrimaryKeySelective(t);
		
	}

	@Override
	public List<BackstageDTO> getAllBackstageDTO() {
		List<Backstage> backstages = new ArrayList<Backstage>();
		backstages=backstageMapper.selectByExample(null);
		List<BackstageDTO> backstageDTOs=new ArrayList<BackstageDTO>(); 
		for(Backstage backstage:backstages) {
			if(backstage.getIds()==0) {
				BackstageDTO item = new BackstageDTO();
				item.setId(backstage.getId());
				item.setName(backstage.getName());
				item.setUrl(backstage.getUrl());
				for(Backstage backstage2:backstages) {
					if(backstage2.getIds()==item.getId()) {
						BackstageDTO item2 = new BackstageDTO();
						item2.setId(backstage2.getId());
						item2.setName(backstage2.getName());
						item2.setUrl(backstage2.getUrl());
						item.getChildren().add(item2);
					}
				}
				backstageDTOs.add(item);
			}
		}
		return backstageDTOs;
	}


	/*@Override
	public void updateSort(Integer sort, Integer navId) {
		// TODO Auto-generated method stub
		Nav record=new Nav();
		record.setNavId(navId);
		record.setSort(sort);
		navMapper.updateByPrimaryKeySelective(record);
		
	}*/

}
