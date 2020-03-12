package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.po.Content;
import com.example.service.ContentService;




@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;

	@RequestMapping("/co.do")
	public ModelAndView queryItem() {
		List<Content> contents = contentService.getContentByName("");
		
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("contents", contents);
		modelAndView.setViewName("content");

		return modelAndView;
	}
	
	@RequestMapping(value="/content.do" ,method=RequestMethod.GET)
	public String content(Model model,String name){
		if(name == "" ||name == null) {
			model. addAttribute("content", contentService.getContentByName(name));
		}else {
			model. addAttribute("content", contentService.getContentByName(name));
		}
		return "admin/content/list";
		
	}
	@RequestMapping(value="/toedit.do" ,method=RequestMethod.GET)
	public String toEdit(Model model,Integer id){
		if(id!=null) {
		Content content = contentService.getContentById(id);
		model.addAttribute("content",content);
		}
		return "admin/content/edit";
		
	}
	@RequestMapping(value="/edit.do" ,method=RequestMethod.POST)
	public String Edit(Content content){
		
		if(content.getId()!=0){
			contentService.updateContent(content);
		}else {
			contentService.insertContent(content);
		}
		
		return "redirect:content.do";
		
	}
	@RequestMapping(value="/delete.do" ,method=RequestMethod.GET)
	public String delet(int id){
		contentService.deleteContent(id);
		return "redirect:content.do";
	}
	
}