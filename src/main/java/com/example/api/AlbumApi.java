package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.po.Album;
import com.example.service.AlbumService;



@RestController
@RequestMapping("/api/album")
public class AlbumApi {
	@Autowired
	private AlbumService navService;
	
	@RequestMapping("/all")
	public List<Album> all() {
		return navService.selectAll();
	}
	@RequestMapping("/one")
	public Album one(Integer id) {
		
		
	 return	navService.getSingle(id);
	}
	@RequestMapping("/one1/{id}")
	public Album one1(@PathVariable("id") Integer id) {
		return navService.getSingle(id);
	}
	@RequestMapping("/add")
	public String add(Album nav) {
		return "插入成功";

	}
	@RequestMapping("/add1")
	public String add(@RequestBody JSONObject json) {
		Album nav=null;
		nav=JSON.toJavaObject(json, Album.class);
		System.out.println("添加成功");
		navService.insert(nav);
		return "添加成功";
		
		

	}
	@RequestMapping("/update1")
	public String update(@RequestBody JSONObject json) {
		Album nav=null;
		
		nav=JSON.toJavaObject(json, Album.class);
		navService.update(nav);
		return "修改成功";
	}
	@RequestMapping("/update")
	public String update(Album nav) {
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
