package com.example.demo.mybatis.dao.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
public class BoardUpdateRequestDao {
	//---
	public String getDebugLogString() {
		String returnValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		//---
		logStringBuffer = new StringBuffer();
		logStringBuffer.append("============================== debug start \n");
		logStringBuffer.append("[BoardUpdateRequestDao debug string] \n");
		//logStringBuffer.append("bdSeq : " + this.bdSeq+"\n");
		logStringBuffer.append("============================== debug end \n");
		logString = logStringBuffer.toString();
		//---
		log.debug(logStringBuffer.toString());
		returnValue = logString;
		return returnValue;
	}
}
