package com.example.demo.mybatis.dto.common;

import com.example.demo.mybatis.dao.common.CommonListPagerRequestDao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommonListPagerRequestDto {
	private int pageNum;
	private int totalBoard;
	private int pageSize;
	private int blockSize;
	//---
	private int totalPage;
	private int startRow;
	private int endRow;
	private int startPage;
	private int endPage;
	private int prevPage;
	private int nextPage;
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
}
