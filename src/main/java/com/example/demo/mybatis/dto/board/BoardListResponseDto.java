package com.example.demo.mybatis.dto.board;

import com.example.demo.mybatis.commons.pager.SiteDebugger;
import com.example.demo.mybatis.configurations.WebsiteConfiguration;
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
	private String bdCont;
	//--- 생성자 정의.
	public BoardListResponseDto() {}
	public BoardListResponseDto(BoardListResponseDao boardListResponseDao) {
		fromResponseDao(boardListResponseDao);
	}
	//--- from/to 메서드 정의.
	public void fromResponseDao(BoardListResponseDao boardListResponseDao) {
		this.bdSeq = boardListResponseDao.getBdSeq();
		this.bdTitle = boardListResponseDao.getBdTitle();
		this.bdCont = boardListResponseDao.getBdCont();
	}
	public BoardListResponseDao toResponseDao() {
		BoardListResponseDao returnValue = new BoardListResponseDao();
		returnValue.setBdSeq(this.bdSeq);
		returnValue.setBdTitle(this.bdTitle);
		returnValue.setBdCont(this.bdCont);
		return returnValue;
	}
	//---
	public String getDebugLogString(String debugSubTitleString) {
		String returnValue = "";
		String returnErrorValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		SiteDebugger siteDebugger = null;
		//---
		if(!WebsiteConfiguration.debugFlag) {return returnErrorValue;}//if
		logStringBuffer = new StringBuffer();
		siteDebugger = DebugUtil.getSiteDebugger();
		siteDebugger.appendDebugStartStringBuffer(logStringBuffer, "BoardListResponseDto", debugSubTitleString);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "bdSeq", this.bdSeq);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "bdTitle", this.bdTitle);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "bdCont", this.bdCont);
		siteDebugger.appendDebugEndStringBuffer(logStringBuffer);
		logString = logStringBuffer.toString();
		//---
		log.debug(logStringBuffer.toString());
		returnValue = logString;
		return returnValue;
	}
}
