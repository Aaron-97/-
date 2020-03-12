package com.example.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.po.Album;

import com.example.service.AlbumService;



@Controller
@RequestMapping("/album")
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;

	@RequestMapping(value="/album.do")
	public ModelAndView all(){
		
		List<Album> albums=albumService.selectAll();
	
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("albums", albums);
		
		mv.setViewName("admin/album/list");
		
		return mv;
		
	}
	@RequestMapping(value="/al.do" ,method=RequestMethod.GET)
	public String content(Model model,String name){
		if(name == "" ||name == null) {
			model. addAttribute("albums", albumService.getAlbumByName(name));
		}else {
			model. addAttribute("albums", albumService.getAlbumByName(name));
		}
		return "admin/album/list";
		
	}
	
	@RequestMapping(value="/toedit.do" ,method=RequestMethod.GET)
	public String toEdit(Model model,Integer id){
		
			Album album=albumService.getSingle(id);
			model.addAttribute("album", album);
		
		return "admin/album/edit";		
		
	}
	@RequestMapping(value="/edit.do" ,method=RequestMethod.POST)
	public String index(Album album){
		if(album.getId()!=null){
			album.setCreateTime(new Date());
			albumService.update(album);
		}else{
			
			album.setCreateTime(new Date());
			albumService.insert(album);}
		return "redirect:album.do";
		
		
	}
	@RequestMapping(value="/delete.do" ,method=RequestMethod.GET)
	public String delet(Integer id){
		albumService.delete(id);
		return "redirect:album.do";
		
	}
	
	

}




