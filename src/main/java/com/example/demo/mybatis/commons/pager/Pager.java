package com.example.demo.mybatis.commons.pager;

import org.springframework.stereotype.Component;

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
public class Pager {
	//--- ### 변수 선언 영역.
	// 페이지의 번호
	private long pageNum = 1;
	// 게시글의 개수
	private long totalBoard = 0;
	// 페이지에 출력되는 게시글 개수 (n개씩 보기)
	private long pageSize = 10;
	// 한 블럭에 출력되는 페이지 번호 개수
	private long blockSize = 10;
	//---
	// 전체 페이지 개수
	private long totalPage;
	// 요청 페이지에 출력되는 게시글의 시작 행번호
	private long startRow;
	// 요청 페이지에 출력되는 게시글의 종료 행번호
	private long endRow;
	// 블럭에 출력되는 시작 페이지 번호
	private long startPage;
	// 블럭에 출력되는 종료 페이지 번호
	private long endPage;
	// 이전 블럭에 출력되는 시작 페이지 번호
	private long prevPage;
	// 다음 블럭에 출력되는 시작 페이지 번호
	private long nextPage;
	//--- ### 생성자 선언 영역.
	public Pager() {}
	public Pager(long pageNum, long totalBoard, long pageSize, long blockSize) {
		SiteDebugger siteDebugger = null;
		//---
		this.pageNum = pageNum;
		this.totalBoard = totalBoard;
		this.pageSize = pageSize;
		this.blockSize = blockSize;
		//---
		siteDebugger = DebugUtil.getSiteDebugger();
		siteDebugger.printDebugStartString(log, "Pager");
		siteDebugger.printDebugBodyString(log, "pageNum", this.pageNum);
		siteDebugger.printDebugBodyString(log, "totalBoard", this.totalBoard);
		siteDebugger.printDebugBodyString(log, "pageSize", this.pageSize);
		siteDebugger.printDebugBodyString(log, "blockSize", this.blockSize);
		siteDebugger.printDebugEndString(log);
		//---
		calcPage();
	}
	//--- ### 메서드 선언 영역.
	public void calcPage() {
		// 총 게시물 수에 페이지당 표시되는 게시물 수를 나눠 전체 페이지의 개수를 구합니다.
		totalPage=(long)Math.ceil((double)totalBoard/pageSize);
		// 페이지 번호가 전체 페이지 수 보다 큰 경우 페이지 번호를 1로 설정
		if(pageNum<=0 || pageNum>totalPage) {
			pageNum=1;
		}
		// 시작 및 끝 행 번호
		startRow=(pageNum-1)*pageSize+1;
 		endRow=pageNum*pageSize;
		if(endRow>totalBoard) {
			endRow=totalBoard;
		}
		// 한 블럭에 출력되는 행 개수를 기준으로 페이지 번호를 계산
		startPage=(pageNum-1)/blockSize*blockSize+1;
		endPage=startPage+blockSize-1;
		if(endPage>totalPage) {
			endPage=totalPage;
		}
		// 이전 및 다음 블럭의 시작 페이지 번호 계산
		prevPage=startPage-blockSize;
		nextPage=startPage+blockSize;
	}
}
