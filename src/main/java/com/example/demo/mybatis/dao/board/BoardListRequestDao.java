package com.example.demo.mybatis.dao.board;

import com.example.demo.mybatis.dao.common.CommonListPagerRequestDao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardListRequestDao extends CommonListPagerRequestDao {
	private long bdSeq;
}
