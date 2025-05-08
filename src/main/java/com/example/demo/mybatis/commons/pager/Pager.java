package com.example.demo.mybatis.commons.pager;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class Pager {
	//--- ### 변수 선언 영역.
	// 페이지의 번호
	private int pageNum = 1;
	// 게시글의 개수
	private int totalBoard = 0;
	// 페이지에 출력되는 게시글 개수 (n개씩 보기)
	private int pageSize = 10;
	// 한 블럭에 출력되는 페이지 번호 개수
	private int blockSize = 10;
	//---
	// 전체 페이지 개수
	private int totalPage;
	// 요청 페이지에 출력되는 게시글의 시작 행번호
	private int startRow;
	// 요청 페이지에 출력되는 게시글의 종료 행번호
	private int endRow;
	// 블럭에 출력되는 시작 페이지 번호
	private int startPage;
	// 블럭에 출력되는 종료 페이지 번호
	private int endPage;
	// 이전 블럭에 출력되는 시작 페이지 번호
	private int prevPage;
	// 다음 블럭에 출력되는 시작 페이지 번호
	private int nextPage;
	//--- ### 생성자 선언 영역.
	public Pager() {}
	public Pager(int pageNum, int totalBoard, int pageSize, int blockSize) {
		this.pageNum = pageNum;
		this.totalBoard = totalBoard;
		this.pageSize = pageSize;
		this.blockSize = blockSize;
		//---
		calcPage();
	}
	//--- ### 메서드 선언 영역.
	public void calcPage() {
		// 총 게시물 수에 페이지당 표시되는 게시물 수를 나눠 전체 페이지의 개수를 구합니다.
		totalPage=(int)Math.ceil((double)totalBoard/pageSize);
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
