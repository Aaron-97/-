package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.Backstage;
import com.example.po.BackstageDTO;
import com.example.service.BackstageService;

@Controller

public class AdminController {

	@Autowired
	private BackstageService backstageService;
	@RequestMapping(value="/admin.do")
	public String index(Model model){
		List<BackstageDTO> backstageDTOs = backstageService.getAllBackstageDTO();
		List<Backstage> backstage=backstageService.all();
		model.addAttribute("backstage", backstage);
		model.addAttribute("backstageDTOs", backstageDTOs);
		System.out.println(backstage);
		System.out.println(backstageDTOs);
		return "admin/index";
		
	}
}
