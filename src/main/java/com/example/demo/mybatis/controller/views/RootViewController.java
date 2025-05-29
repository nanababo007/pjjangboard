package com.example.demo.mybatis.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class RootViewController {
	@GetMapping
	public ModelAndView root() throws Exception{
		String viewName = "";
		ModelAndView mav = null;
		//---
		viewName = "root/index";
		mav = new ModelAndView("test");
		//---
		mav.addObject("data", "root page data");
		mav.setViewName(viewName);
		return mav;
	}
}
