<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script>
$(function(){
	var pageObjects = {};
	var pageFunctions = {};
	//--- 변수 선언.
	pageObjects.searchFormObject = document.searchForm;
	pageObjects.searchFormJqueryObject = $(pageObjects.searchFormObject);
	pageObjects.searchButtonJqueryObject = $('#searchButton');
	pageObjects.initSearchButtonJqueryObject = $('#initSearchButton');
	pageObjects.listLayerJqueryObject = $('#listLayer');
	pageObjects.registBoardButtonJqueryObject = $('#registBoardButton');
	//--- 이벤트 함수 선언.
	pageObjects.registBoardButtonJqueryObject.click(function(e){
		e.preventDefault();
	});
	pageObjects.searchButtonJqueryObject.click(function(e){
		e.preventDefault();
		setNumberInputDefaultValue(pageObjects.searchFormObject.pageNum,1);
		pageObjects.searchFormJqueryObject.submit();
	});
	pageObjects.initSearchButtonJqueryObject.click(function(e){
		e.preventDefault();
		if(confirm('검색을 초기화 하시겠습니까?')){location.href = '/board/list';}//if
	});
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