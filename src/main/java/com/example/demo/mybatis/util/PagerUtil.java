package com.example.demo.mybatis.util;

import com.example.demo.mybatis.commons.pager.Pager;
import com.example.demo.mybatis.dao.common.CommonListPagerRequestDao;
import com.example.demo.mybatis.dto.common.CommonListPagerRequestDto;

public class PagerUtil {
	public static void calcPageForDto(Pager pager, CommonListPagerRequestDto commonListPagerRequestDto, long totalRecordCount) {
		pager.setPageNum(commonListPagerRequestDto.getPageNum());
		pager.setTotalBoard(commonListPagerRequestDto.getTotalBoard());
		pager.setPageSize(commonListPagerRequestDto.getPageSize());
		pager.setBlockSize(commonListPagerRequestDto.getBlockSize());
		commonListPagerRequestDto.setTotalBoard(totalRecordCount);
		pager.setTotalBoard(totalRecordCount);
		pager.calcPage();
		copyPagerToDto(pager, commonListPagerRequestDto);
	}
	public static void calcPageForDao(Pager pager, CommonListPagerRequestDao commonListPagerRequestDao, long totalRecordCount) {
		pager.setPageNum(commonListPagerRequestDao.getPageNum());
		pager.setTotalBoard(commonListPagerRequestDao.getTotalBoard());
		pager.setPageSize(commonListPagerRequestDao.getPageSize());
		pager.setBlockSize(commonListPagerRequestDao.getBlockSize());
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
