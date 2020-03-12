package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.po.Service1;
import com.example.service.Service1Service;



@Controller
@RequestMapping("/service1")
public class Service1Controller {

	@Autowired
	private Service1Service service1Service;

	@RequestMapping("/eo.do")
	public ModelAndView queryItem() {
		List<Service1> service1s = service1Service.getService1ByName("");
		
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("service1s", service1s);
		modelAndView.setViewName("service1");

		return modelAndView;
	}
	
	@RequestMapping(value="/service1.do" ,method=RequestMethod.GET)
	public String service1(Model model,String name){
		if(name == "" ||name == null) {
			model. addAttribute("service1", service1Service.getService1ByName(name));
		}else {
			model. addAttribute("service1", service1Service.getService1ByName(name));
		}
		return "admin/service1/list";
		
	}
	@RequestMapping(value="/toedit.do" ,method=RequestMethod.GET)
	public String toEdit(Model model,Integer id){
		if(id!=null) {
		Service1 service1 = service1Service.getService1ById(id);
		model.addAttribute("service1",service1);
		}
		return "admin/service1/edit";
		
	}
	@RequestMapping(value="/edit.do" ,method=RequestMethod.POST)
	public String Edit(Service1 service1){
		
		if(service1.getId()!=0){
			service1Service.updateService1(service1);
		}else {
			service1Service.insertService1(service1);
		}
		
		return "redirect:service1.do";
		
	}
	@RequestMapping(value="/delete.do" ,method=RequestMethod.GET)
	public String delet(int id){
		service1Service.deleteService1(id);
		return "redirect:service1.do";
	}
	
}