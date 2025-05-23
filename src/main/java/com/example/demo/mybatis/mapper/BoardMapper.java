package com.example.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.mybatis.dao.board.BoardInsertRequestDao;
import com.example.demo.mybatis.dao.board.BoardListRequestDao;
import com.example.demo.mybatis.dao.board.BoardListResponseDao;
import com.example.demo.mybatis.dao.board.BoardUpdateDeleteRequestDao;
import com.example.demo.mybatis.dao.board.BoardUpdateRequestDao;

@Mapper
@Repository
public interface BoardMapper {
	public List<BoardListResponseDao> getBoardList(BoardListRequestDao boardListRequestDao) throws Exception;
	public long getBoardListTotalCount(BoardListRequestDao boardListRequestDao) throws Exception;
	public List<BoardListResponseDao> getBoardAllList(BoardListRequestDao boardListRequestDao) throws Exception;
	public int insertBoard(BoardInsertRequestDao boarInsertRequestDao);
	public int updateBoard(BoardUpdateRequestDao boardUpdateRequestDao);
	public int updateDeleteBoard(BoardUpdateDeleteRequestDao boardUpdateDeleteRequestDao);
}
