package com.hc.yuwen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hc.yuwen.entities.NewsDetail;
import com.hc.yuwen.service.NewsService;

@Controller
public class TestController {
	
	@Autowired
	NewsService newsService;
	
	@RequestMapping("/index")
	public ModelAndView indexPage(){
		
		ModelAndView modelAndView = new ModelAndView("index");
		List<NewsDetail> nList = newsService.selectNews();
		modelAndView.addObject("nList", nList);
		
		return modelAndView;
	}
}
