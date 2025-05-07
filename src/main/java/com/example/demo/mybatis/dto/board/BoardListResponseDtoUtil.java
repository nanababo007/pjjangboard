package com.example.demo.mybatis.dto.board;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.mybatis.dao.board.BoardListResponseDao;

public class BoardListResponseDtoUtil {

	public static List<BoardListResponseDto> getResponseDtoListFromResponseDaoList(List<BoardListResponseDao> boardListResponseDao) {
		List<BoardListResponseDto> returnValue = new ArrayList<BoardListResponseDto>();
		if(boardListResponseDao!=null) {
			for (BoardListResponseDao boardListResponseDaoItem : boardListResponseDao) {
				BoardListResponseDto boardListResponseDtoItem = new BoardListResponseDto(boardListResponseDaoItem);
				returnValue.add(boardListResponseDtoItem);
			}
		}
		return returnValue;
	}

}
