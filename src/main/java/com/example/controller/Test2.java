package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.AlbumService;
import com.example.service.BackstageService;
import com.example.service.ContentService;
import com.example.service.CopyrightService;
import com.example.service.IndexService;
import com.example.service.NavigationService;
import com.example.service.Service1Service;
import com.example.service.SnavigationService;


@Controller
public class Test2{

	@Autowired
	private IndexService indexService;
	@Autowired
	private NavigationService navigationService;
	@Autowired
	private ContentService contentService;
	@Autowired
	private CopyrightService copyrightService;
	@Autowired
	private Service1Service service1Service;
	@Autowired
	private SnavigationService snavigationService;
	@Autowired
	private AlbumService albumService;
	
	@RequestMapping("/index2")
	public String a(Model model){
		model.addAttribute("index",indexService.getIndexByName(""));
		model.addAttribute("navigation",navigationService.getNavigationByName(""));

		model.addAttribute("content",contentService.getContentByName(""));
		model.addAttribute("copyright",copyrightService.getCopyrightByName(""));
		model.addAttribute("service1",service1Service.getService1ByName(""));
		model.addAttribute("snavigation",snavigationService.getSnavigationByName(""));
		model.addAttribute("album",albumService.getAlbumByName(""));
		return "index2";
	}
	

}
