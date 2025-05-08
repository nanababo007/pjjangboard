package com.example.demo.mybatis.util;

import com.example.demo.mybatis.commons.pager.Pager;
import com.example.demo.mybatis.dao.common.CommonListPagerRequestDao;
import com.example.demo.mybatis.dto.common.CommonListPagerRequestDto;

public class PagerUtil {
	public static Pager getPager() {
		return new Pager();
	}
	public static Pager getPager(int pageNum, int totalBoard, int pageSize, int blockSize) {
		return new Pager(pageNum, totalBoard, pageSize, blockSize);
	}
	public static void setPager(Pager pager, int pageNum, int totalBoard, int pageSize, int blockSize) {
		pager.setPageNum(pageNum);
		pager.setTotalBoard(totalBoard);
		pager.setPageSize(pageSize);
		pager.setBlockSize(blockSize);
	}
	public static void calcPageForDto(Pager pager, CommonListPagerRequestDto commonListPagerRequestDto) {
		pager.calcPage();
		commonListPagerRequestDto.setPageNum(pager.getPageNum());
		commonListPagerRequestDto.setTotalBoard(pager.getTotalBoard());
		commonListPagerRequestDto.setPageSize(pager.getPageSize());
		commonListPagerRequestDto.setBlockSize(pager.getBlockSize());
	}
	public static void calcPageForDao(Pager pager, CommonListPagerRequestDao commonListPagerRequestDao) {
		pager.calcPage();
		commonListPagerRequestDao.setPageNum(pager.getPageNum());
		commonListPagerRequestDao.setTotalBoard(pager.getTotalBoard());
		commonListPagerRequestDao.setPageSize(pager.getPageSize());
		commonListPagerRequestDao.setBlockSize(pager.getBlockSize());
	}
}
