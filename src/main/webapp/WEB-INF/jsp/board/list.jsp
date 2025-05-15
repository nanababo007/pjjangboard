<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<c:forEach var="boardItemString" items="${boardList}" varStatus="boardIndexObject">
	${boardIndexObject.index}, ${boardItemString} <br />
	</c:forEach>
</body>
</html>