<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.demo.mybatis.configurations.WebsiteConfiguration"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<%@ include file="/WEB-INF/jsp/include/headInc.jsp" %>
	<%@ include file="listCssInc.jsp" %>
	<title>게시판 페이지</title>
</head>
<body>
<div class="layout">
	<div class="sidebar">
		<%@ include file="/WEB-INF/jsp/include/menuInc.jsp" %>
	</div>
	<div class="content">
		<h2>게시판</h2>
		<div>JSP List Test</div>
		<hr/>
		<div id="listLayer" class="margin-top-middle-class">
			<c:forEach var="boardItemObject" items="${boardList}" varStatus="boardIndexObject">
			<h3>${boardIndexObject.index+1}. ${boardItemObject.bdTitle} (${boardItemObject.bdSeq})</h3>
			<div><p>${boardItemObject.bdCont}</p></div>
			</c:forEach>
		</div>
		<p><%@ include file="/WEB-INF/jsp/include/pagerInc.jsp" %></p>
	</div>
</div>
<%@ include file="listScriptInc.jsp" %>
</body>
</html>