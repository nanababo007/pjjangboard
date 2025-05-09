package com.example.demo.mybatis.dto.board;

import com.example.demo.mybatis.commons.pager.SiteDebugger;
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
	public String getDebugLogString(String debugSubTitleString) {
		String returnValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		SiteDebugger siteDebugger = null;
		//---
		logStringBuffer = new StringBuffer();
		siteDebugger = DebugUtil.getSiteDebugger();
		siteDebugger.appendDebugStartStringBuffer(logStringBuffer, "BoardListResponseDto", debugSubTitleString);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "bdSeq", this.bdSeq);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "bdTitle", this.bdTitle);
		siteDebugger.appendDebugEndStringBuffer(logStringBuffer);
		logString = logStringBuffer.toString();
		//---
		log.debug(logStringBuffer.toString());
		returnValue = logString;
		return returnValue;
	}
}
