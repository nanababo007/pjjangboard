package com.example.demo.mybatis.dao.common;

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
		logStringBuffer.append("============================== debug start \n");
		logStringBuffer.append("[CommonListPagerRequestDao debug string] \n");
		logStringBuffer.append("pageNum : " + this.pageNum+"\n");
		logStringBuffer.append("totalBoard : " + this.totalBoard+"\n");
		logStringBuffer.append("pageSize : " + this.pageSize+"\n");
		logStringBuffer.append("blockSize : " + this.blockSize+"\n");
		logStringBuffer.append("totalPage : " + this.totalPage+"\n");
		logStringBuffer.append("startRow : " + this.startRow+"\n");
		logStringBuffer.append("endRow : " + this.endRow+"\n");
		logStringBuffer.append("startPage : " + this.startPage+"\n");
		logStringBuffer.append("endPage : " + this.endPage+"\n");
		logStringBuffer.append("prevPage : " + this.prevPage+"\n");
		logStringBuffer.append("nextPage : " + this.nextPage+"\n");
		logStringBuffer.append("============================== debug end \n");
		logString = logStringBuffer.toString();
		//---
		log.debug(logString);
		returnValue = logString;
		return returnValue;
	}
}
