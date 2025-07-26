<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.demo.mybatis.configurations.WebsiteConfiguration"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Test Page</title>
</head>
<body>
	<h2>Hello! ${name}</h2>
	<div>JSP List Test</div>
	<c:forEach var="boardItemObject" items="${boardList}" varStatus="boardIndexObject">
	${boardIndexObject.index+1}, ${boardItemObject.bdSeq}, ${boardItemObject.bdTitle} <br />
	</c:forEach>
	<p>
		<%@ include file="/WEB-INF/jsp/include/pagerInc.jsp" %>
	</p>
	<script>
		function goPage(pageNum){
			var url = '';
			var param = '';
			//---
			url = '/board/list';
			param = '?pageNum='+pageNum;
			//---
			location.href = url+param;
		}
	</script>
</body>
</html>