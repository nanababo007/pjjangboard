package com.example.demo.mybatis.dto.board;

import com.example.demo.mybatis.commons.pager.SiteDebugger;
import com.example.demo.mybatis.dao.board.BoardListRequestDao;
import com.example.demo.mybatis.dto.common.CommonListPagerRequestDto;
import com.example.demo.mybatis.dto.common.CommonListPagerRequestDtoUtil;
import com.example.demo.mybatis.util.DebugUtil;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class BoardListRequestDto extends CommonListPagerRequestDto {
	private long bdSeq;
	//--- 생성자 정의.
	public BoardListRequestDto() {}
	public BoardListRequestDto(BoardListRequestDao boardListRequestDao) {
		fromRequestDao(boardListRequestDao);
	}
	//--- from/to 메서드 정의.
	public void fromRequestDao(BoardListRequestDao boardListRequestDao) {
		super.fromPagerRequestDao(boardListRequestDao);
		this.bdSeq = boardListRequestDao.getBdSeq();
	}
	public BoardListRequestDao toRequestDao() {
		BoardListRequestDao returnValue = new BoardListRequestDao();
		CommonListPagerRequestDtoUtil.copyFromDtoToDao(this, returnValue);
		returnValue.setBdSeq(this.bdSeq);
		return returnValue;
	}
	public String getDebugLogString() {
		String returnValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		SiteDebugger siteDebugger = null;
		//---
		logStringBuffer = new StringBuffer();
		siteDebugger = DebugUtil.getSiteDebugger();
		siteDebugger.appendDebugStartStringBuffer(logStringBuffer, "BoardListRequestDto");
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "bdSeq", this.bdSeq);
		siteDebugger.appendDebugEndStringBuffer(logStringBuffer);
		logString = logStringBuffer.toString();
		//---
		super.getPagerDebugLogString();
		log.debug(logStringBuffer.toString());
		returnValue = logString;
		return returnValue;
	}
}
