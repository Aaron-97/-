package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.po.Content;
import com.example.service.ContentService;



@RestController
@RequestMapping("/api/Content")
public class ContentApi {
	@Autowired
	private ContentService navService;
	
	@RequestMapping("/all")
	public List<Content> getContentByName() {
		return navService.getContentByName(null);
	}
	@RequestMapping("/one")
	public Content getContentById(Integer id) {
		
		
	 return	navService.getContentById(id);
	}
	
	@RequestMapping("/add")
	public String add(Content nav) {
		return "插入成功";

	}
	@RequestMapping("/add1")
	public String add(@RequestBody JSONObject json) {
		Content nav=null;
		nav=JSON.toJavaObject(json, Content.class);
		System.out.println("添加成功");
		navService.insertContent(nav);
		return "添加成功";
		
		

	}
	@RequestMapping("/update1")
	public String update(@RequestBody JSONObject json) {
		Content nav=null;
		
		nav=JSON.toJavaObject(json, Content.class);
		navService.updateContent(nav);
		return "修改成功";
	}
	@RequestMapping("/update")
	public String updateContent(Content nav) {
		navService.updateContent(nav);
		return "修改成功";
	}
	@RequestMapping("/delete")
	public String deleteContent(Integer id) {
		
		return "删除成功";
	}
	@RequestMapping("/delete1/{id}")
	public String delete1(@PathVariable("id") Integer id) {
		navService.deleteContent(id);
		return "删除成功";
	}
	

}
