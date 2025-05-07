package com.example.demo.mybatis.dto.board;

import com.example.demo.mybatis.dao.board.BoardListRequestDao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardListRequestDto {
	private long bdSeq;
	//--- 생성자 정의.
	public BoardListRequestDto() {}
	public BoardListRequestDto(BoardListRequestDao boardListRequestDao) {
		fromRequestDao(boardListRequestDao);
	}
	//--- from/to 메서드 정의.
	public void fromRequestDao(BoardListRequestDao boardListRequestDao) {
		this.bdSeq = boardListRequestDao.getBdSeq();
	}
	public BoardListRequestDao toRequestDao() {
		BoardListRequestDao returnValue = new BoardListRequestDao();
		returnValue.setBdSeq(this.bdSeq);
		return returnValue;
	}
}
