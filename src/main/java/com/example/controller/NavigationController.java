package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.po.Navigation;
import com.example.service.NavigationService;



@Controller
@RequestMapping("/navigation")
public class NavigationController {

	@Autowired
	private NavigationService navigationService;

	@RequestMapping("/do.do")
	public ModelAndView queryItem() {
		List<Navigation> navigations = navigationService.getNavigationByName("");
		
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("navigations", navigations);
		modelAndView.setViewName("navigation");

		return modelAndView;
	}
	
	@RequestMapping(value="/navigation.do" ,method=RequestMethod.GET)
	public String navigation(Model model,String name){
		if(name == "" ||name == null) {
			model. addAttribute("navigation", navigationService.getNavigationByName(name));
		}else {
			model. addAttribute("navigation", navigationService.getNavigationByName(name));
		}
		return "admin/navigation/list";
		
	}
	@RequestMapping(value="/toedit.do" ,method=RequestMethod.GET)
	public String toEdit(Model model,Integer id){
		if(id!=null) {
		Navigation navigation = navigationService.getNavigationById(id);
		model.addAttribute("navigation",navigation);
		}
		return "admin/navigation/edit";
		
	}
	@RequestMapping(value="/edit.do" ,method=RequestMethod.POST)
	public String Edit(Navigation navigation){
//		navigation.setSort(1);
		
		if(navigation.getId()!=0){
			navigationService.updateNavigation(navigation);
		}else {
			navigationService.insertNavigation(navigation);
		}
		
		return "redirect:navigation.do";
		
	}
	@RequestMapping(value="/delete.do" ,method=RequestMethod.GET)
	public String delet(int id){
		navigationService.deleteNavigation(id);
		return "redirect:navigation.do";
	}
	
}