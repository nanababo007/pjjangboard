<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:choose>
<c:when test="${not empty pager}">
<style>
	.pager-layer-class a {text-decoration:none;}
</style>
<c:if test="${not empty pager.pageMoveUrl}">
<div class="pager-layer-class">
	<a href="${pager.pageMoveUrl}?pageNum=1">처음</a>
	<a href="${pager.pageMoveUrl}?pageNum=${pager.prevPage}">이전</a>
	<c:forEach var="pageItemNumber" begin="${pager.startPage}" end="${pager.endPage}" step="1">
		<c:if test="${pageItemNumber > 1}"> | </c:if>
		<a href="${pager.pageMoveUrl}?pageNum=${pageItemNumber}">${pageItemNumber}</a>
	</c:forEach>
	<a href="${pager.pageMoveUrl}?pageNum=${pager.nextPage}">다음</a>
	<a href="${pager.pageMoveUrl}?pageNum=${pager.totalPage}">끝</a>
</div>
</c:if>
<c:if test="${not empty pager.pageMoveFuncName}">
<div class="pager-layer-class">
	<a href="javascript:${pager.pageMoveFuncName}(1);">처음</a>
	<a href="javascript:${pager.pageMoveFuncName}(${pager.prevPage});">이전</a>
	<c:forEach var="pageItemNumber" begin="${pager.startPage}" end="${pager.endPage}" step="1">
		<c:if test="${pageItemNumber > 1}"> | </c:if>
		<a href="javascript:${pager.pageMoveFuncName}(${pageItemNumber});">${pageItemNumber}</a>
	</c:forEach>
	<a href="javascript:${pager.pageMoveFuncName}(${pager.nextPage});">다음</a>
	<a href="javascript:${pager.pageMoveFuncName}(${pager.totalPage});">끝</a>
</div>
</c:if>
<% if(WebsiteConfiguration.debugFlag){ %>
<p>
	pager debug start ====================
	<br />pager information : ${pager}
	<br />pager debug end ====================
</p>
<% }//if %>
</c:when>
<c:otherwise>
<% if(WebsiteConfiguration.debugFlag){ %>pager 객체가 없습니다.<% }//if %>
</c:otherwise>
</c:choose>