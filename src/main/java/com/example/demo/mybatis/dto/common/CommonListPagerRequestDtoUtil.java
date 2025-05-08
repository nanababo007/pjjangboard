package com.example.demo.mybatis.dto.common;

import com.example.demo.mybatis.dao.common.CommonListPagerRequestDao;

public class CommonListPagerRequestDtoUtil {
	public static void copyFromDtoToDao(CommonListPagerRequestDto commonListPagerRequestDto,CommonListPagerRequestDao commonListPagerRequestDao) {
		commonListPagerRequestDao.setPageNum(commonListPagerRequestDto.getPageNum());
		commonListPagerRequestDao.setTotalBoard(commonListPagerRequestDto.getTotalBoard());
		commonListPagerRequestDao.setPageSize(commonListPagerRequestDto.getPageSize());
		commonListPagerRequestDao.setBlockSize(commonListPagerRequestDto.getBlockSize());
		//---
		commonListPagerRequestDao.setTotalPage(commonListPagerRequestDto.getTotalPage());
		commonListPagerRequestDao.setStartRow(commonListPagerRequestDto.getStartRow());
		commonListPagerRequestDao.setEndRow(commonListPagerRequestDto.getEndRow());
		commonListPagerRequestDao.setStartPage(commonListPagerRequestDto.getStartPage());
		commonListPagerRequestDao.setEndPage(commonListPagerRequestDto.getEndPage());
		commonListPagerRequestDao.setPrevPage(commonListPagerRequestDto.getPrevPage());
		commonListPagerRequestDao.setNextPage(commonListPagerRequestDto.getNextPage());
	}
}
