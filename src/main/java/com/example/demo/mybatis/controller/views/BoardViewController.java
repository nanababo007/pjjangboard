package com.example.demo.mybatis.controller.views;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardViewController {
	@GetMapping("/list")
	public ModelAndView test() throws Exception{
		String viewName = "";
		ModelAndView mav = null;
		List<String> boardList = null;
		//---
		viewName = "board/list";
		mav = new ModelAndView("test");
		boardList = new ArrayList<String>();
		boardList.add("a");
		boardList.add("b");
		boardList.add("c");
		//---
		mav.addObject("name", "goddaehee");
		mav.addObject("boardList", boardList);
		mav.setViewName(viewName);
		return mav;
	}
}
