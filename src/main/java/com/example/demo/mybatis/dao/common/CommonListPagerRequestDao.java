package com.example.demo.mybatis.dao.common;

import com.example.demo.mybatis.commons.pager.SiteDebugger;
import com.example.demo.mybatis.util.DebugUtil;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
public class CommonListPagerRequestDao {
	private long pageNum;
	private long totalBoard;
	private long pageSize;
	private long blockSize;
	//---
	private long totalPage;
	private long startRow;
	private long endRow;
	private long startPage;
	private long endPage;
	private long prevPage;
	private long nextPage;
	//---
	public String getPagerDebugLogString(String debugSubTitleString) {
		String returnValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		SiteDebugger siteDebugger = null;
		//---
		logStringBuffer = new StringBuffer();
		siteDebugger = DebugUtil.getSiteDebugger();
		siteDebugger.appendDebugStartStringBuffer(logStringBuffer, "CommonListPagerRequestDao", debugSubTitleString);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "pageNum", this.pageNum);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "totalBoard", this.totalBoard);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "pageSize", this.pageSize);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "blockSize", this.blockSize);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "totalPage", this.totalPage);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "startRow", this.startRow);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "endRow", this.endRow);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "startPage", this.startPage);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "endPage", this.endPage);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "prevPage", this.prevPage);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "nextPage", this.nextPage);
		siteDebugger.appendDebugEndStringBuffer(logStringBuffer);
		logString = logStringBuffer.toString();
		//---
		log.debug(logString);
		returnValue = logString;
		return returnValue;
	}
}
