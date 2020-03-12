package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.po.Backstage;
import com.example.service.BackstageService;



@RestController
@RequestMapping("/api/Backstage")
public class BackstageApi {
	@Autowired
	private BackstageService navService;
	
	@RequestMapping("/all")
	public List<Backstage> all() {
		return navService.all();
	}
	@RequestMapping("/one")
	public Backstage one(Integer id) {
		
		
	 return	navService.one(id);
	}
	
	@RequestMapping("/add")
	public String add(Backstage nav) {
		return "插入成功";

	}
	@RequestMapping("/add1")
	public String add(@RequestBody JSONObject json) {
		Backstage nav=null;
		nav=JSON.toJavaObject(json, Backstage.class);
		System.out.println("添加成功");
		navService.add(nav);
		return "添加成功";
		
		

	}
	@RequestMapping("/update1")
	public String update(@RequestBody JSONObject json) {
		Backstage nav=null;
		
		nav=JSON.toJavaObject(json, Backstage.class);
		navService.update(nav);
		return "修改成功";
	}
	@RequestMapping("/update")
	public String update(Backstage nav) {
		navService.update(nav);
		return "修改成功";
	}
	@RequestMapping("/delete")
	public String delete(Integer id) {
		
		return "删除成功";
	}
	@RequestMapping("/delete1/{id}")
	public String delete1(@PathVariable("id") Integer id) {
		navService.delete(id);
		return "删除成功";
	}
	

}
