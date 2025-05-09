package com.example.demo.mybatis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mybatis.dao.board.BoardListRequestDao;
import com.example.demo.mybatis.dao.board.BoardListResponseDao;
import com.example.demo.mybatis.dto.board.BoardListRequestDto;
import com.example.demo.mybatis.dto.board.BoardListResponseDto;
import com.example.demo.mybatis.dto.board.BoardListResponseDtoUtil;
import com.example.demo.mybatis.service.BoardService;
import com.example.demo.mybatis.util.PagerUtil;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping(value = "/board")
public class BoardController {
	private BoardService boardService;
	@GetMapping("/list")
	public ResponseEntity<Map<String,Object>> getBoardList(BoardListRequestDto boardListRequestDto) throws Exception {
		Map<String,Object> responseData = new HashMap<String,Object>();
		BoardListRequestDao boardListRequestDao = null;
		List<BoardListResponseDao> boardListResponseDao = null;
		List<BoardListResponseDto> boardListResponseDto = null;
		ResponseEntity<Map<String,Object>> returnValue = null;
		long boardListTotalCount = 0;
		//--- 본문 코드 영역.
		boardListRequestDao = boardListRequestDto.toRequestDao();
		boardListTotalCount = boardService.getBoardListTotalCount(boardListRequestDao);
		PagerUtil.calcPageForDao(boardListRequestDao,boardListTotalCount);
		boardListResponseDao = boardService.getBoardList(boardListRequestDao);
		boardListResponseDto = BoardListResponseDtoUtil.getResponseDtoListFromResponseDaoList(boardListResponseDao);
		responseData.put("boardListResponseDto", boardListResponseDto);
		//--- 반환 정리 코드 영역.
		returnValue = new ResponseEntity<>(responseData,HttpStatus.OK);
		return returnValue;
	}
	@GetMapping("/all/list")
	public ResponseEntity<List<BoardListResponseDto>> getBoardAllList(BoardListRequestDto boardListRequestDto) throws Exception {
		BoardListRequestDao boardListRequestDao = null;
		List<BoardListResponseDao> boardListResponseDao = null;
		List<BoardListResponseDto> boardListResponseDto = null;
		ResponseEntity<List<BoardListResponseDto>> returnValue = null;
		//--- 본문 코드 영역.
		boardListRequestDao = boardListRequestDto.toRequestDao();
		boardListResponseDao = boardService.getBoardAllList(boardListRequestDao);
		boardListResponseDto = BoardListResponseDtoUtil.getResponseDtoListFromResponseDaoList(boardListResponseDao);
		//--- 반환 정리 코드 영역.
		returnValue = new ResponseEntity<>(boardListResponseDto,HttpStatus.OK);
		return returnValue;
	}
}
