package com.example.demo.mybatis.dto.common;

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
public class CommonListPagerRequestDto {
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
	//--- from/to 메서드 정의.
	public void fromPagerRequestDao(CommonListPagerRequestDao commonListPagerRequestDao) {
		this.pageNum = commonListPagerRequestDao.getPageNum();
		this.totalBoard = commonListPagerRequestDao.getTotalBoard();
		this.pageSize = commonListPagerRequestDao.getPageSize();
		this.blockSize = commonListPagerRequestDao.getBlockSize();
		//---
		this.totalPage = commonListPagerRequestDao.getTotalPage();
		this.startRow = commonListPagerRequestDao.getStartRow();
		this.endRow = commonListPagerRequestDao.getEndRow();
		this.startPage = commonListPagerRequestDao.getStartPage();
		this.endPage = commonListPagerRequestDao.getEndPage();
		this.prevPage = commonListPagerRequestDao.getPrevPage();
		this.nextPage = commonListPagerRequestDao.getNextPage();
	}
	public CommonListPagerRequestDao toPagerRequestDao() {
		CommonListPagerRequestDao returnValue = new CommonListPagerRequestDao();
		returnValue.setPageNum(this.pageNum);
		returnValue.setTotalBoard(this.totalBoard);
		returnValue.setPageSize(this.pageSize);
		returnValue.setBlockSize(this.blockSize);
		//---
		returnValue.setTotalPage(this.totalPage);
		returnValue.setStartRow(this.startRow);
		returnValue.setEndRow(this.endRow);
		returnValue.setStartPage(this.startPage);
		returnValue.setEndPage(this.endPage);
		returnValue.setPrevPage(this.prevPage);
		returnValue.setNextPage(this.nextPage);
		return returnValue;
	}
	public String getPagerDebugLogString() {
		String returnValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		//---
		logStringBuffer = new StringBuffer();
		DebugUtil.appendDebugStartStringBuffer(logStringBuffer, "CommonListPagerRequestDto");
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
