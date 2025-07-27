<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.demo.mybatis.configurations.WebsiteConfiguration"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<%@ include file="/WEB-INF/jsp/include/headInc.jsp" %>
	<%@ include file="listCssInc.jsp" %>
	<title>게시판 목록 페이지</title>
</head>
<body>
<div class="layout">
	<div class="sidebar">
		<%@ include file="/WEB-INF/jsp/include/menuInc.jsp" %>
	</div>
	<div class="content">
		<h2>게시판 목록</h2>
		<div>멀티 게시판 목록 관리 페이지 입니다.</div>
		<hr class="margin-bottom-middle-class" />
		<div class="button-layer-class">
			<input type="button" value="등록" />
		</div>
		<div id="listLayer">
			<c:forEach var="boardItemObject" items="${boardList}" varStatus="boardIndexObject">
			<h3>${boardIndexObject.index+1}. ${boardItemObject.bdTitle} (${boardItemObject.bdSeq})</h3>
			<div>
				<p>
					작성일시 : ${boardItemObject.createdDateTimeString}
					<br />수정일시 : ${boardItemObject.modifiedDateTimeString}
				</p>
				<p>${boardItemObject.bdCont}</p>
				<p>
					<a href="javascript:pageFunctions.modifyBoardArticle(33);">수정</a> |
					<a href="javascript:pageFunctions.deleteBoardArticle(33);">삭제</a>
				</p>
			</div>
			</c:forEach>
		</div>
		<p><%@ include file="/WEB-INF/jsp/include/pagerInc.jsp" %></p>
	</div>
</div>
<%@ include file="listScriptInc.jsp" %>
</body>
</html>