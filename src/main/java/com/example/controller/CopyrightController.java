package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.po.Copyright;
import com.example.service.CopyrightService;



@Controller
@RequestMapping("/copyright")
public class CopyrightController {

	@Autowired
	private CopyrightService copyrightService;

	@RequestMapping("/ao.do")
	public ModelAndView queryItem() {
		List<Copyright> copyrights = copyrightService.getCopyrightByName("");
		
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("copyrights", copyrights);
		modelAndView.setViewName("copyright");

		return modelAndView;
	}
	
	@RequestMapping(value="/copyright.do" ,method=RequestMethod.GET)
	public String copyright(Model model,String name){
		if(name == "" ||name == null) {
			model. addAttribute("copyright", copyrightService.getCopyrightByName(name));
		}else {
			model. addAttribute("copyright", copyrightService.getCopyrightByName(name));
		}
		return "admin/copyright/list";
		
	}
	@RequestMapping(value="/toedit.do" ,method=RequestMethod.GET)
	public String toEdit(Model model,Integer id){
		if(id!=null) {
		Copyright copyright = copyrightService.getCopyrightById(id);
		model.addAttribute("copyright",copyright);
		}
		return "admin/copyright/edit";
		
	}
	@RequestMapping(value="/edit.do" ,method=RequestMethod.POST)
	public String Edit(Copyright copyright){
		
		if(copyright.getId()!=0){
			copyrightService.updateCopyright(copyright);
		}else {
			copyrightService.insertCopyright(copyright);
		}
		
		return "redirect:copyright.do";
		
	}
	@RequestMapping(value="/delete.do" ,method=RequestMethod.GET)
	public String delet(int id){
		copyrightService.deleteCopyright(id);
		return "redirect:copyright.do";
	}
}