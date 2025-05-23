package com.example.demo.mybatis.dao.board;

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
public class BoardListResponseDao {
	private long bdSeq;
	private String bdTitle;
	//---
	public String getDebugLogString(String debugSubTitleString) {
		String returnValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		SiteDebugger siteDebugger = null;
		//---
		logStringBuffer = new StringBuffer();
		siteDebugger = DebugUtil.getSiteDebugger();
		siteDebugger.appendDebugStartStringBuffer(logStringBuffer, "BoardInsertRequestDao", debugSubTitleString);
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
