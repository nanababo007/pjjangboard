package com.example.demo.mybatis.controller;

import java.util.List;

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

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/board")
public class BoardController {
	private BoardService boardService;
	@GetMapping("/list")
	public ResponseEntity<List<BoardListResponseDto>> getBoardList(BoardListRequestDto boardListRequestDto) throws Exception {
		BoardListRequestDao boardListRequestDao = null;
		List<BoardListResponseDao> boardListResponseDao = null;
		List<BoardListResponseDto> boardListResponseDto = null;
		ResponseEntity<List<BoardListResponseDto>> returnValue = null;
		//--- 본문 코드 영역.
		boardListRequestDao = boardListRequestDto.toRequestDao();
		boardListResponseDao = boardService.getBoardList(boardListRequestDao);
		boardListResponseDto = BoardListResponseDtoUtil.getResponseDtoListFromResponseDaoList(boardListResponseDao);
		//--- 반환 정리 코드 영역.
		returnValue = new ResponseEntity<>(boardListResponseDto,HttpStatus.OK);
		return returnValue;
	}
}
