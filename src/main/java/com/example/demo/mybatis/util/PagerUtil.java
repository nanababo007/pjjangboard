package com.example.demo.mybatis.util;

import com.example.demo.mybatis.commons.pager.Pager;
import com.example.demo.mybatis.dao.common.CommonListPagerRequestDao;
import com.example.demo.mybatis.dto.common.CommonListPagerRequestDto;

public class PagerUtil {
	public static Pager getPager() {
		return new Pager();
	}
	public static Pager getPager(long pageNum, long totalBoard, long pageSize, long blockSize) {
		return new Pager(pageNum, totalBoard, pageSize, blockSize);
	}
	//---
	public static void calcPageForDto(CommonListPagerRequestDto commonListPagerRequestDto, long totalRecordCount) {
		Pager pager = PagerUtil.getPager(
			commonListPagerRequestDto.getPageNum(),
			commonListPagerRequestDto.getTotalBoard(),
			commonListPagerRequestDto.getPageSize(),
			commonListPagerRequestDto.getBlockSize()
		);
		commonListPagerRequestDto.setTotalBoard(totalRecordCount);
		pager.setTotalBoard(totalRecordCount);
		pager.calcPage();
		copyPagerToDto(pager, commonListPagerRequestDto);
	}
	public static void calcPageForDao(CommonListPagerRequestDao commonListPagerRequestDao, long totalRecordCount) {
		Pager pager = PagerUtil.getPager(
			commonListPagerRequestDao.getPageNum(),
			commonListPagerRequestDao.getTotalBoard(),
			commonListPagerRequestDao.getPageSize(),
			commonListPagerRequestDao.getBlockSize()
		);
		commonListPagerRequestDao.setTotalBoard(totalRecordCount);
		pager.setTotalBoard(totalRecordCount);
		pager.calcPage();
		copyPagerToDao(pager, commonListPagerRequestDao);
	}
	public static void copyPagerToDao(Pager pager, CommonListPagerRequestDao commonListPagerRequestDao) {
		commonListPagerRequestDao.setPageNum(pager.getPageNum());
		commonListPagerRequestDao.setTotalBoard(pager.getTotalBoard());
		commonListPagerRequestDao.setPageSize(pager.getPageSize());
		commonListPagerRequestDao.setBlockSize(pager.getBlockSize());
		commonListPagerRequestDao.setTotalPage(pager.getTotalPage());
		commonListPagerRequestDao.setStartRow(pager.getStartRow());
		commonListPagerRequestDao.setEndRow(pager.getEndRow());
		commonListPagerRequestDao.setStartPage(pager.getStartPage());
		commonListPagerRequestDao.setEndPage(pager.getEndPage());
		commonListPagerRequestDao.setPrevPage(pager.getPrevPage());
		commonListPagerRequestDao.setNextPage(pager.getNextPage());
	}
	public static void copyPagerToDto(Pager pager, CommonListPagerRequestDto commonListPagerRequestDto) {
		commonListPagerRequestDto.setPageNum(pager.getPageNum());
		commonListPagerRequestDto.setTotalBoard(pager.getTotalBoard());
		commonListPagerRequestDto.setPageSize(pager.getPageSize());
		commonListPagerRequestDto.setBlockSize(pager.getBlockSize());
		commonListPagerRequestDto.setTotalPage(pager.getTotalPage());
		commonListPagerRequestDto.setStartRow(pager.getStartRow());
		commonListPagerRequestDto.setEndRow(pager.getEndRow());
		commonListPagerRequestDto.setStartPage(pager.getStartPage());
		commonListPagerRequestDto.setEndPage(pager.getEndPage());
		commonListPagerRequestDto.setPrevPage(pager.getPrevPage());
		commonListPagerRequestDto.setNextPage(pager.getNextPage());
	}
}
