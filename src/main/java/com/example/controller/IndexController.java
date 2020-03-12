package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.po.Index;
import com.example.service.IndexService;






@Controller
@RequestMapping("/index")
public class IndexController {

	@Autowired
	private IndexService indexService;

	@RequestMapping("/bo.do")
	public ModelAndView queryItem() {
		List<Index> indexs = indexService.getIndexByName("");
		
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("indexs", indexs);
		modelAndView.setViewName("index");

		return modelAndView;
	}
	
	
	@RequestMapping(value="/index.do" ,method=RequestMethod.GET)
	public String index(Model model){
		List<Index> index=indexService.getIndexByName("");
		model.addAttribute("index",index);
		return "admin/index/list";
		
	}
	@RequestMapping(value="/toedit.do" ,method=RequestMethod.GET)
	public String toEdit(Model model,Integer id){
		if(id!=null) {
		Index index = indexService.getIndexById(id);
		model.addAttribute("index",index);
		}
		return "admin/index/edit";
		
	}
	@RequestMapping(value="/edit.do" ,method=RequestMethod.POST)
	public String Edit(Index index){
		
		if(index.getId()!=0){
			indexService.updateIndex(index);
		}else {
			indexService.insertIndex(index);
		}
		
		return "redirect:index.do";
		
	}
	@RequestMapping(value="/delete.do" ,method=RequestMethod.GET)
	public String delet(int id){
		indexService.deleteIndex(id);
		return "redirect:index.do";
	}
}