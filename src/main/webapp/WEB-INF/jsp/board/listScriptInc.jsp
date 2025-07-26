<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script>
$(function(){
	var pageObjects = {};
	var pageFunctions = {};
	//--- 변수 선언.
	pageObjects.listLayerJqueryObject = $('#listLayer');
	//--- 일반 함수 선언.
	function initPage(){
		pageObjects.listLayerJqueryObject.accordion();
	}
	function goPage(pageNum){
		var url = '';
		var param = '';
		//---
		url = '/board/list';
		param = '?pageNum='+pageNum;
		//---
		location.href = url+param;
	}
	//--- 페이지 처리.
	initPage();
	//--- 페이지 객체/함수 노출 처리.
	pageFunctions.goPage = goPage;
	//---
	window.pageObjects = pageObjects;
	window.pageFunctions = pageFunctions;
});
</script>