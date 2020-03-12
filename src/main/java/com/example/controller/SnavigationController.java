package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.po.Snavigation;
import com.example.service.SnavigationService;



@Controller
@RequestMapping("/snavigation")
public class SnavigationController {

	@Autowired
	private SnavigationService snavigationService;

	@RequestMapping("/qo.do")
	public ModelAndView queryItem() {
		List<Snavigation> snavigations = snavigationService.getSnavigationByName("");
		
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("snavigations", snavigations);
		modelAndView.setViewName("snavigation");

		return modelAndView;
	}
	
	@RequestMapping(value="/snavigation.do" ,method=RequestMethod.GET)
	public String snavigation(Model model,String name){
		if(name == "" ||name == null) {
			model. addAttribute("snavigation", snavigationService.getSnavigationByName(name));
		}else {
			model. addAttribute("snavigation", snavigationService.getSnavigationByName(name));
		}
		return "admin/snavigation/list";
		
	}
	@RequestMapping(value="/toedit.do" ,method=RequestMethod.GET)
	public String toEdit(Model model,Integer id){
		if(id!=null) {
		Snavigation snavigation = snavigationService.getSnavigationById(id);
		model.addAttribute("snavigation",snavigation);
		}
		return "admin/snavigation/edit";
		
	}
	@RequestMapping(value="/edit.do" ,method=RequestMethod.POST)
	public String Edit(Snavigation snavigation){
//		snavigation.setSort(1);
		
		if(snavigation.getId()!=0){
			snavigationService.updateSnavigation(snavigation);
		}else {
			snavigationService.insertSnavigation(snavigation);
		}
		
		return "redirect:snavigation.do";
		
	}
	@RequestMapping(value="/delete.do" ,method=RequestMethod.GET)
	public String delet(int id){
		snavigationService.deleteSnavigation(id);
		return "redirect:snavigation.do";
	}
	
}