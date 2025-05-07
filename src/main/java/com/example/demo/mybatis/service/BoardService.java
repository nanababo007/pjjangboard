package com.example.demo.mybatis.service;

import java.util.List;

import com.example.demo.mybatis.dao.board.BoardInsertRequestDao;
import com.example.demo.mybatis.dao.board.BoardListRequestDao;
import com.example.demo.mybatis.dao.board.BoardListResponseDao;
import com.example.demo.mybatis.dao.board.BoardUpdateDeleteRequestDao;
import com.example.demo.mybatis.dao.board.BoardUpdateRequestDao;

public interface BoardService {
	public List<BoardListResponseDao> getBoardList(BoardListRequestDao boardListRequestDao) throws Exception;
	public int insertBoard(BoardInsertRequestDao boarInsertRequestDao);
	public int updateBoard(BoardUpdateRequestDao boardUpdateRequestDao);
	public int updateDeleteBoard(BoardUpdateDeleteRequestDao boardUpdateDeleteRequestDao);
}
