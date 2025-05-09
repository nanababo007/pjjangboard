package com.example.demo.mybatis.dao.board;

import com.example.demo.mybatis.util.DebugUtil;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
public class BoardInsertRequestDao {
	//---
	public String getDebugLogString() {
		String returnValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		//---
		logStringBuffer = new StringBuffer();
		DebugUtil.appendDebugStartStringBuffer(logStringBuffer, "BoardInsertRequestDao");
		//DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "bdSeq", this.bdSeq);
		DebugUtil.appendDebugEndStringBuffer(logStringBuffer);
		logString = logStringBuffer.toString();
		//---
		log.debug(logStringBuffer.toString());
		returnValue = logString;
		return returnValue;
	}
}
