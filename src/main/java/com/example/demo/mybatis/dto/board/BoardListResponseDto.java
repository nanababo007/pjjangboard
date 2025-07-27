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
	private String createdDateString;
	private String createdDateTimeString;
	private String createdBy;
	private String modifiedDateString;
	private String modifiedDateTimeString;
	private String modifiedBy;
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
		this.createdDateString = boardListResponseDao.getCreatedDateString();
		this.createdDateTimeString = boardListResponseDao.getCreatedDateTimeString();
		this.createdBy = boardListResponseDao.getCreatedBy();
		this.modifiedDateString = boardListResponseDao.getModifiedDateString();
		this.modifiedDateTimeString = boardListResponseDao.getModifiedDateTimeString();
		this.modifiedBy = boardListResponseDao.getModifiedBy();
	}
	public BoardListResponseDao toResponseDao() {
		BoardListResponseDao returnValue = new BoardListResponseDao();
		returnValue.setBdSeq(this.bdSeq);
		returnValue.setBdTitle(this.bdTitle);
		returnValue.setBdCont(this.bdCont);
		returnValue.setCreatedDateString (this.createdDateString);
		returnValue.setCreatedDateTimeString (this.createdDateTimeString);
		returnValue.setCreatedBy (this.createdBy);
		returnValue.setModifiedDateString (this.modifiedDateString);
		returnValue.setModifiedDateTimeString (this.modifiedDateTimeString);
		returnValue.setModifiedBy (this.modifiedBy);
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
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "createdDateString", this.createdDateString);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "createdDateTimeString", this.createdDateTimeString);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "createdBy", this.createdBy);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "modifiedDateString", this.modifiedDateString);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "modifiedDateTimeString", this.modifiedDateTimeString);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "modifiedBy", this.modifiedBy);
		siteDebugger.appendDebugEndStringBuffer(logStringBuffer);
		logString = logStringBuffer.toString();
		//---
		log.debug(logStringBuffer.toString());
		returnValue = logString;
		return returnValue;
	}
}
