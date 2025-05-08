package com.example.demo.mybatis.dto.board;

import com.example.demo.mybatis.dao.board.BoardListResponseDao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardListResponseDto {
	private long bdSeq;
	private String bdTitle;
	//--- 생성자 정의.
	public BoardListResponseDto() {}
	public BoardListResponseDto(BoardListResponseDao boardListResponseDao) {
		fromResponseDao(boardListResponseDao);
	}
	//--- from/to 메서드 정의.
	public void fromResponseDao(BoardListResponseDao boardListResponseDao) {
		this.bdSeq = boardListResponseDao.getBdSeq();
		this.bdTitle = boardListResponseDao.getBdTitle();
	}
	public BoardListResponseDao toResponseDao() {
		BoardListResponseDao returnValue = new BoardListResponseDao();
		returnValue.setBdSeq(this.bdSeq);
		returnValue.setBdTitle(this.bdTitle);
		return returnValue;
	}
}
