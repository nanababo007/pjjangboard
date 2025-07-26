<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
.ui-menu { width: 200px; }
.ui-widget-header { padding: 0.2em; }
</style>
<!-- ### -->
<ul id="menuLayer">
	<li class="ui-widget-header"><div>Category 1</div></li>
	<li menuIndex="1-1"><div>Option 1</div></li>
	<li menuIndex="1-2"><div>Option 2</div></li>
	<li menuIndex="1-3"><div>Option 3</div></li>
	<li class="ui-widget-header"><div>Category 2</div></li>
	<li menuIndex="2-1"><div>Option 4</div></li>
	<li menuIndex="2-2"><div>Option 5</div></li>
	<li menuIndex="2-3"><div>Option 6</div></li>
</ul>
<!-- ### -->
<script>
$(function(){
	var menuIncObjects = {};
	var menuIncFunctions = {};
	//--- 변수 선언.
	menuIncObjects.menuLayerJqueryObject = $('#menuLayer');
	//--- 일반 함수 선언.
	function initPage(){
		menuIncObjects.menuLayerJqueryObject.menu({
			items: "> :not(.ui-widget-header)",
			select: function( event, ui ) {
				<% if(WebsiteConfiguration.debugFlag){ %>
				window.currentMenuItemObject = ui;
				//---
				console.info('menu select debug start =============');
				console.info('menu select info (ui object) : ',ui);
				console.info('menu select info (text) : ',currentMenuItemObject.item.text());
				console.info('menu select info (index) : ',currentMenuItemObject.item.index());
				console.info('menu select info (menuIndex) : ',currentMenuItemObject.item.attr('menuIndex'));
				console.info('menu select debug end =============');
				<% }//if %>
			}
		});
	}
	//--- 페이지 처리.
	initPage();
	//--- 페이지 객체/함수 노출 처리.
	//menuIncFunctions.exportFuncName = exportFuncName;
	//---
	window.menuIncObjects = menuIncObjects;
	window.menuIncFunctions = menuIncFunctions;
});
</script>