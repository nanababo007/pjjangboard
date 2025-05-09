package com.example.demo.mybatis.dao.board;

import com.example.demo.mybatis.dao.common.CommonListPagerRequestDao;
import com.example.demo.mybatis.util.DebugUtil;

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
		DebugUtil.appendDebugStartStringBuffer(logStringBuffer, "BoardListRequestDao");
		DebugUtil.appendDebugBodyStringBuffer(logStringBuffer, "bdSeq", this.bdSeq);
		DebugUtil.appendDebugEndStringBuffer(logStringBuffer);
		logString = logStringBuffer.toString();
		//---
		super.getPagerDebugLogString();
		log.debug(logStringBuffer.toString());
		returnValue = logString;
		return returnValue;
	}
}
