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
		pager.setTotalBoard(totalRecordCount);
		pager.calcPage();
	}
	public static void calcPageForDao(CommonListPagerRequestDao commonListPagerRequestDao, long totalRecordCount) {
		Pager pager = PagerUtil.getPager(
			commonListPagerRequestDao.getPageNum(),
			commonListPagerRequestDao.getTotalBoard(),
			commonListPagerRequestDao.getPageSize(),
			commonListPagerRequestDao.getBlockSize()
		);
		pager.setTotalBoard(totalRecordCount);
		pager.calcPage();
	}
}
