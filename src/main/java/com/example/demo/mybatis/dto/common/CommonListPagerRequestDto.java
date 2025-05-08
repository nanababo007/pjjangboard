package com.example.demo.mybatis.dto.common;

import com.example.demo.mybatis.dao.common.CommonListPagerRequestDao;

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
		logStringBuffer.append("============================== debug start \n");
		logStringBuffer.append("[CommonListPagerRequestDto debug string] \n");
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
