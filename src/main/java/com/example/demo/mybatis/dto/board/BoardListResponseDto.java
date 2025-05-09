package com.example.demo.mybatis.dto.board;

import com.example.demo.mybatis.dao.board.BoardListResponseDao;
import com.example.demo.mybatis.util.DebugUtil;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
	//---
	public String getDebugLogString() {
		String returnValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		//---
		logStringBuffer = new StringBuffer();
		DebugUtil.appendDebugStartStringBuffer(logStringBuffer, "BoardListResponseDto");
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "bdSeq", this.bdSeq);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "bdTitle", this.bdTitle);
		DebugUtil.appendDebugEndStringBuffer(logStringBuffer);
		logString = logStringBuffer.toString();
		//---
		log.debug(logStringBuffer.toString());
		returnValue = logString;
		return returnValue;
	}
}
