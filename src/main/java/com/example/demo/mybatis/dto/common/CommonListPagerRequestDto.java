package com.example.demo.mybatis.dto.common;

import org.springframework.stereotype.Component;

import com.example.demo.mybatis.commons.pager.SiteDebugger;
import com.example.demo.mybatis.configurations.WebsiteConfiguration;
import com.example.demo.mybatis.dao.common.CommonListPagerRequestDao;
import com.example.demo.mybatis.util.DebugUtil;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
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
	private long limitOffset;
	//---
	private String pageMoveUrl;
	private String pageMoveFuncName;
	//--- 생성자
	public CommonListPagerRequestDto() {
		long defaultPageSize = 0;
		long defaultBlockSize = 0;
		//---
		defaultPageSize = 10;
		defaultBlockSize = 10;
		if(this.pageNum==0) {this.pageNum = 1;}
		if(this.totalBoard==0) {this.totalBoard = 0;}
		if(this.pageSize==0) {this.pageSize = defaultPageSize;}
		if(this.blockSize==0) {this.blockSize = defaultBlockSize;}
	}
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
		this.limitOffset = commonListPagerRequestDao.getLimitOffset();
		//---
		this.pageMoveUrl = commonListPagerRequestDao.getPageMoveUrl();
		this.pageMoveFuncName = commonListPagerRequestDao.getPageMoveFuncName();
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
		//---
		returnValue.setPageMoveUrl(this.pageMoveUrl);
		returnValue.setPageMoveFuncName(this.pageMoveFuncName);
		//---
		return returnValue;
	}
	public String getPagerDebugLogString(String debugSubTitleString) {
		String returnValue = "";
		String returnErrorValue = "";
		StringBuffer logStringBuffer = null;
		String logString = "";
		SiteDebugger siteDebugger = null;
		//---
		if(!WebsiteConfiguration.debugFlag) {return returnErrorValue;}//if
		logStringBuffer = new StringBuffer();
		siteDebugger = DebugUtil.getSiteDebugger();
		siteDebugger.appendDebugStartStringBuffer(logStringBuffer, "CommonListPagerRequestDto", debugSubTitleString);
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
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "limitOffset", this.limitOffset);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "pageMoveUrl", this.pageMoveUrl);
		siteDebugger.appendDebugBodyStringBuffer(logStringBuffer, "pageMoveFuncName", this.pageMoveFuncName);
		siteDebugger.appendDebugEndStringBuffer(logStringBuffer);
		logString = logStringBuffer.toString();
		//---
		log.debug(logString);
		returnValue = logString;
		return returnValue;
	}
}
