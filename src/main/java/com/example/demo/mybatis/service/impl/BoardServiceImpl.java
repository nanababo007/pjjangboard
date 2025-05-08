package com.example.demo.mybatis.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mybatis.dao.board.BoardInsertRequestDao;
import com.example.demo.mybatis.dao.board.BoardListRequestDao;
import com.example.demo.mybatis.dao.board.BoardListResponseDao;
import com.example.demo.mybatis.dao.board.BoardUpdateDeleteRequestDao;
import com.example.demo.mybatis.dao.board.BoardUpdateRequestDao;
import com.example.demo.mybatis.mapper.BoardMapper;
import com.example.demo.mybatis.service.BoardService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {
	private BoardMapper boardMapper;
	public List<BoardListResponseDao> getBoardList(BoardListRequestDao boardListRequestDao) throws Exception {
		return boardMapper.getBoardList(boardListRequestDao);
	}
	public List<BoardListResponseDao> getBoardAllList(BoardListRequestDao boardListRequestDao) throws Exception {
		return boardMapper.getBoardAllList(boardListRequestDao);
	}
	public int insertBoard(BoardInsertRequestDao boarInsertRequestDao) {
		return boardMapper.insertBoard(boarInsertRequestDao);
	}
	public int updateBoard(BoardUpdateRequestDao boardUpdateRequestDao) {
		return boardMapper.updateBoard(boardUpdateRequestDao);
	}
	public int updateDeleteBoard(BoardUpdateDeleteRequestDao boardUpdateDeleteRequestDao) {
		return boardMapper.updateDeleteBoard(boardUpdateDeleteRequestDao);
	}
}