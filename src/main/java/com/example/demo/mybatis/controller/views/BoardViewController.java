package com.example.demo.mybatis.controller.views;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.mybatis.commons.pager.Pager;
import com.example.demo.mybatis.dao.board.BoardListRequestDao;
import com.example.demo.mybatis.dao.board.BoardListResponseDao;
import com.example.demo.mybatis.dto.board.BoardListRequestDto;
import com.example.demo.mybatis.dto.board.BoardListResponseDto;
import com.example.demo.mybatis.dto.board.BoardListResponseDtoUtil;
import com.example.demo.mybatis.service.BoardService;
import com.example.demo.mybatis.util.PagerUtil;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/board")
public class BoardViewController {
	private BoardService boardService;
	private Pager pager;
	@GetMapping("/list")
	public ModelAndView getBoardList(BoardListRequestDto boardListRequestDto) throws Exception{
		String viewName = "";
		ModelAndView mav = null;
		Map<String,Object> responseData = new HashMap<String,Object>();
		BoardListRequestDao boardListRequestDao = null;
		List<BoardListResponseDao> boardListResponseDao = null;
		List<BoardListResponseDto> boardListResponseDto = null;
		long boardListTotalCount = 0;
		//---
		viewName = "board/listPage";
		boardListRequestDao = boardListRequestDto.toRequestDao();
		boardListTotalCount = boardService.getBoardListTotalCount(boardListRequestDao);
		PagerUtil.calcPageForDao(pager,boardListRequestDao,boardListTotalCount);
		boardListResponseDao = boardService.getBoardList(boardListRequestDao);
		boardListResponseDto = BoardListResponseDtoUtil.getResponseDtoListFromResponseDaoList(boardListResponseDao);
		responseData.put("boardListResponseDto", boardListResponseDto);
		//---
		mav = new ModelAndView();
		mav.addObject("boardList", boardListResponseDto);
		mav.addObject("pager", pager);
		mav.setViewName(viewName);
		return mav;
	}
}
