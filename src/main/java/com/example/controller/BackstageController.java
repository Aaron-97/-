package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.po.Backstage;
import com.example.po.Index;
import com.example.service.BackstageService;



@Controller
@RequestMapping("/backstage")
public class BackstageController {
	@Autowired
	private BackstageService backstageService;

	@RequestMapping("list")
	public String list(Model model, String name) {
		
		List<Backstage> backstage = null;
		if (name != null && name.length() > 0) {
			backstage = backstageService.queryname(name);
		} else {
			backstage = backstageService.all();
		}
		
		model.addAttribute("backstage", backstage);

		return "admin/backstage/list";
	}

	@RequestMapping("/backtoedit")
	public String toedit(Model model, Integer id) {

		if ( id != null &&id > 0) {
			Backstage backstage = backstageService.one(id);

			model.addAttribute("backstage", backstage);
		}

		return "admin/backstage/edit";
	}

	// 添加和更新
	@RequestMapping("/backedit")
	public String edit(Backstage backstage) {
		System.out.println(backstage.getName()+"---"+backstage.getId());
		Integer id = backstage.getId();// 判断这个流程是添加流程还是更新流程

		if (backstage.getId()>0) {
			backstageService.update(backstage);
		} else {
			backstageService.add(backstage);
			
		}

		return "redirect:list";
	}

	@RequestMapping("/backdelete")
	public String delete(Integer id) {

		if (id != null && id > 0) {
			backstageService.delete(id);
		}

		return "redirect:list";
	}

	@RequestMapping("/backsort")
	public String sort(Integer[] sort, Integer[] id) {

		if (sort != null && sort.length > 0) {
			for (int i = 0; i < sort.length; i++) {

				int s = sort[i];// 排序号
				int j = id[i];// 编号

				backstageService.updateSort(s, j);

			}

		}

		return "redirect:list";
	}
}