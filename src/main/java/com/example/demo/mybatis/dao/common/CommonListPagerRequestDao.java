package com.example.demo.mybatis.dao.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommonListPagerRequestDao {
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
}
