package com.example.demo.mybatis.dao.board;

import com.example.demo.mybatis.dao.common.CommonListPagerRequestDao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
public class BoardListRequestDao extends CommonListPagerRequestDao {
	private long bdSeq;
	//---
	public String getDebugLogString() {
		String returnValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		//---
		logStringBuffer = new StringBuffer();
		logStringBuffer.append("============================== debug start \n");
		logStringBuffer.append("[BoardListRequestDao debug string] \n");
		logStringBuffer.append("bdSeq : " + this.bdSeq+"\n");
		logStringBuffer.append("============================== debug end \n");
		logString = logStringBuffer.toString();
		//---
		super.getPagerDebugLogString();
		log.debug(logStringBuffer.toString());
		returnValue = logString;
		return returnValue;
	}
}
