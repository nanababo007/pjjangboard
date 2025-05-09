package com.example.demo.mybatis.dao.common;

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
	public String getPagerDebugLogString() {
		String returnValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		//---
		logStringBuffer = new StringBuffer();
		DebugUtil.appendDebugStartStringBuffer(logStringBuffer, "CommonListPagerRequestDao");
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "pageNum", this.pageNum);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "totalBoard", this.totalBoard);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "pageSize", this.pageSize);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "blockSize", this.blockSize);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "totalPage", this.totalPage);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "startRow", this.startRow);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "endRow", this.endRow);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "startPage", this.startPage);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "endPage", this.endPage);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "prevPage", this.prevPage);
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "nextPage", this.nextPage);
		DebugUtil.appendDebugEndStringBuffer(logStringBuffer);
		logString = logStringBuffer.toString();
		//---
		log.debug(logString);
		returnValue = logString;
		return returnValue;
	}
}
