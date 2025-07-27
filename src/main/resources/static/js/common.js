/*
=======================================================
 * debug script

console.info('======================');
console.info('index : ' + index);
console.info('index2 : ' + index2);
console.info('templateItemsVariableName : ' + templateItemsVariableName);
console.info('templateItemsVariableValue : ' + templateItemsVariableValue);
console.info('-----');

console.info('======================');
console.info('index : ' + index);
console.info('index2 : ' + index2);
console.info('templateItemsVariableName : ' + templateItemsVariableName);
console.info('templateItemsVariableValue : ' + templateItemsVariableValue);
console.info('templateItemsTextListArray[index] : ' + templateItemsTextListArray[index]);
console.info('typeof templateItemsTextListArray[index] : ' + typeof templateItemsTextListArray[index]);
console.info('templateItemsTextListArray : ' + templateItemsTextListArray);
console.info('-----');

=======================================================
* 함수 정의

UtilClass.nvl(stringValue,replaceValue);
UtilClass.isEmpty : function(value);
UtilClass.fillSequanceArray : function(arrayCount);
UtilClass.getFormattedDate : function(dateFormatString,dateObject);
isNotFunction(expr);
changeFirstCharToUcase(orgString);
changeFirstCharToLcase(orgString);
changeCarmelCaseToUcase(orgString);
changeCarmelCaseToUnderbar(orgString);
inArrayContains(checkArray,containsString);
isArrayContains(containsArray,contentString);
getCurrentTimestamp();
getCombinedSubFoldersPath(
isValidFormInputValue(formInputObject,validMessage);
nvl(expr1, expr2);
nvlForEmpty(expr1, expr2);
isNull(expr);
isNotNull(expr);
isUndefined(expr);
isNotUndefined(expr);
isEmpty(expr);
isNotEmpty(expr);
isEmptyText(expr);
isNotEmptyText(expr);
isObject(expr);
isNotObject(expr);
isArray(expr);
isNotArray(expr);
isFunction(expr);
isStringContains(orgString,chkString);
setNumberInputDefaultValue(numberInputObject,defaultValue);
=======================================================
* 유효성 체크 공통함수, 샘플 소스코드.

if(!isValidFormInputValue(formInputObject,validMessage)){return; or return false;}//if
=======================================================
* 페이징 공통함수, 샘플 소스코드.

<div class="paginate paginationjs paginationjs-theme-green paginationjs-big"></div>
---
$(function(){
	var pageObject = {};
	//---
	pageObject.paginateJqrObject = $('.paginate');
	pageObject.paginateListDataTotalCount = <?php echo $this->toalListCount; ?>;
	pageObject.paginatePageNumber = <?php echo $this->pageNumber; ?>;
	pageObject.paginatePageSize = <?php echo $this->pageSize; ?>;
	pageObject.paginatePagingFunction = <?php echo $this->pagingFunctionName; ?>;
	//---
	//function searchPage(pageNumber){alert(pageNumber);}
	//---
	UtilClass.setPagenateJqrObject(
		pageObject.paginateJqrObject
		,pageObject.paginateListDataTotalCount
		,pageObject.paginatePageNumber
		,pageObject.paginatePageSize
		,function(responseData,pagination,data){}
		,null
		,pageObject.paginatePagingFunction
	);
});
=======================================================
*/
var UtilClass = {
	nvl : function(stringValue,replaceValue){
		var returnValue = '';
		if(replaceValue===undefined){replaceValue = '';}//if
		if('number'===typeof replaceValue){replaceValue = replaceValue.toString();}//if
		if(stringValue!==null && stringValue!==undefined && 'string'===typeof stringValue){
			returnValue = stringValue;
		}else if(stringValue!==null && stringValue!==undefined && 'number'===typeof stringValue){
			returnValue = stringValue.toString();
		}else{
			returnValue = replaceValue;
		}//if
		return returnValue;
	},
	isEmpty : function(value){
		var returnValue = false;
		if(value===null || value===undefined){returnValue = true;}//if
		return returnValue;
	},
	fillSequanceArray : function(arrayCount){
		var returnValue = [];
		var arrayCountNumber = 0;
		if(arrayCount!==null && arrayCount!==undefined && ('string'===typeof arrayCount || 'number'===typeof arrayCount)){
			arrayCountNumber = Number(arrayCount);
		}//if
		if(arrayCountNumber > 0){
			returnValue = Array.from(new Array(arrayCountNumber), (x, i) => i + 1);
		}//if
		return returnValue;
	},
	//renderingHtmlCallbackFunction : function(responseData,pagination,data){}
	//pageButtonOnclickCallbackFunction : function(pageNumber){}
	setPagenateJqrObject : function(
			paginateJqrObject,dataCount,pageNumber,pageSize,renderingHtmlCallbackFunction,
			responseData,pageButtonOnclickCallbackFunction
	){
		var pageSizeNumber = 10;
		var pagenateDataSource = null;
		pagenateDataSource = UtilClass.fillSequanceArray(dataCount);
		pageNumber = Number(UtilClass.nvl(pageNumber,1));
		if(pageSize!==null && pageSize!==undefined && 'string'===typeof pageSize){pageSizeNumber = pageSize;}//if
		paginateJqrObject.pagination({
			dataSource: pagenateDataSource,
			pageNumber : pageNumber,
			pageSize: pageSizeNumber,
			/*pageRange: null,*/
			showPageNumbers: true,
			callback: function(data, pagination) {
				if('function'===typeof renderingHtmlCallbackFunction){renderingHtmlCallbackFunction(responseData,pagination,data);}//if
			},
			afterPageOnClick: function(paginateContext,pageNumber) {
				if('function'===typeof pageButtonOnclickCallbackFunction){pageButtonOnclickCallbackFunction(Number(pageNumber));}//if
			},
			afterPreviousOnClick: function(paginateContext,pageNumber) {
				if('function'===typeof pageButtonOnclickCallbackFunction){pageButtonOnclickCallbackFunction(Number(pageNumber));}//if
			},
			afterNextOnClick: function(paginateContext,pageNumber) {
				if('function'===typeof pageButtonOnclickCallbackFunction){pageButtonOnclickCallbackFunction(Number(pageNumber));}//if
			}
		});
	},
	//dateFormatString : yyyy-mm-dd hh:mi:ss.ms
	getFormattedDate : function(dateFormatString,dateObject){
		var returnValue = '';
		var yearValue = '';
		var monthValue = '';
		var dateValue = '';
		var hoursValue = '';
		var minutesValue = '';
		var secondsValue = '';
		var millisecondsValue = '';
		//---
		if(UtilClass.isEmpty(dateFormatString)){dateFormatString = 'yyyy-mm-dd hh:mi:ss.ms';}//if
		dateObject = UtilClass.isEmpty(dateObject) ? (new Date()) : dateObject;
		yearValue = dateObject.getFullYear();
		yearValue = Number(yearValue).toString();
		monthValue = dateObject.getMonth()+1;
		monthValue = Number(monthValue).toString();
		monthValue = monthValue < 10 ? '0'+monthValue : Number(monthValue).toString();
		dateValue = dateObject.getDate();
		dateValue = dateValue < 10 ? '0'+dateValue : Number(dateValue).toString();
		hoursValue = dateObject.getHours();
		hoursValue = Number(hoursValue).toString();
		hoursValue = hoursValue < 10 ? '0'+hoursValue : Number(hoursValue).toString();
		minutesValue = dateObject.getMinutes();
		minutesValue = Number(minutesValue).toString();
		minutesValue = minutesValue < 10 ? '0'+minutesValue : Number(minutesValue).toString();
		secondsValue = dateObject.getSeconds();
		secondsValue = Number(secondsValue).toString();
		secondsValue = secondsValue < 10 ? '0'+secondsValue : Number(secondsValue).toString();
		millisecondsValue = dateObject.getMilliseconds();
		millisecondsValue = Number(millisecondsValue).toString();
		//---
		dateFormatString = dateFormatString.replaceAll('yyyy',yearValue);
		dateFormatString = dateFormatString.replaceAll('mm',monthValue);
		dateFormatString = dateFormatString.replaceAll('dd',dateValue);
		dateFormatString = dateFormatString.replaceAll('hh',hoursValue);
		dateFormatString = dateFormatString.replaceAll('mi',minutesValue);
		dateFormatString = dateFormatString.replaceAll('ss',secondsValue);
		dateFormatString = dateFormatString.replaceAll('ms',millisecondsValue);
		//---
		returnValue = dateFormatString;
		return returnValue;
	}
};
function nvl(expr1, expr2) {
	if(isEmpty(expr2)){expr2 = '';}//if
	if (expr1 === undefined || expr1 === null || expr1 === "") {
		expr1 = expr2;
	}
	return expr1;
}
function nvlForEmpty(expr1, expr2) {
	if(isEmpty(expr2)){expr2 = '';}//if
	if (expr1 === undefined || expr1 === null) {
		expr1 = expr2;
	}
	return expr1;
}
function isNull(expr){
	var returnValue = false;
	if (expr === null) {
		returnValue = true;
	}
	return returnValue;
}
function isNotNull(expr){
	return !isNull(expr);
}
function isUndefined(expr){
	var returnValue = false;
	if (expr === undefined) {
		returnValue = true;
	}
	return returnValue;
}
function isNotUndefined(expr){
	return !isUndefined(expr);
}
function isEmpty(expr){
	var returnValue = false;
	if (expr === undefined || expr === null) {
		returnValue = true;
	}
	return returnValue;
}
function isNotEmpty(expr){
	return !isEmpty(expr);
}
function isEmptyText(expr){
	var returnValue = false;
	if (expr === undefined || expr === null || expr === "") {
		returnValue = true;
	}
	return returnValue;
}
function isNotEmptyText(expr){
	return !isEmptyText(expr);
}
function isObject(expr){
	var returnValue = false;
	if (isNotEmpty(expr) && typeof expr === 'object' ) {
		returnValue = true;
	}
	return returnValue;
}
function isNotObject(expr){
	return !isObject(expr);
}
function isArray(expr){
	var returnValue = false;
	if (isObject(expr) && isNotEmpty(expr.length) ) {
		returnValue = true;
	}
	return returnValue;
}
function isNotArray(expr){
	return !isArray(expr);
}
function isFunction(expr){
	var returnValue = false;
	if (isNotEmpty(expr) && typeof expr === 'function' ) {
		returnValue = true;
	}
	return returnValue;
}
function isNotFunction(expr){
	return !isFunction(expr);
}
function changeFirstCharToUcase(orgString){
	var returnValue = '';
	var orgProcessedString = '';
	var firstCharString = '';
	var firstUcaseCharString = '';
	var afterCharString = '';
	var changedString = '';
	//---
	orgProcessedString = $.trim(orgString);
	firstCharString = orgProcessedString.substring(0,1);
	firstUcaseCharString = firstCharString.toUpperCase();
	afterCharString = orgProcessedString.substring(1);
	changedString = firstUcaseCharString+''+afterCharString;
	//---
	returnValue = changedString;
	return returnValue;
}
function changeFirstCharToLcase(orgString){
	var returnValue = '';
	var orgProcessedString = '';
	var firstCharString = '';
	var firstLcaseCharString = '';
	var afterCharString = '';
	var changedString = '';
	//---
	orgProcessedString = $.trim(orgString);
	firstCharString = orgProcessedString.substring(0,1);
	firstLcaseCharString = firstCharString.toLowerCase();
	afterCharString = orgProcessedString.substring(1);
	changedString = firstLcaseCharString+''+afterCharString;
	//---
	returnValue = changedString;
	return returnValue;
}
function changeCarmelCaseToUcase(orgString){
	var returnValue = '';
	var orgProcessedString = '';
	var orgProcessedArray = null;
	var changedArray = null;
	var changedItemString = '';
	var changedString = '';
	//---
	orgProcessedString = $.trim(orgString);
	orgProcessedArray = orgProcessedString.split('_');
	changedArray = [];
	$.each(orgProcessedArray,function(index,itemString){
		changedItemString = itemString;
		if(index > 0){
			changedItemString =
				changedItemString.substring(0,1).toUpperCase()+
				changedItemString.substring(1).toLowerCase();
		}else{
			changedItemString = changedItemString.toLowerCase();
		}//if
		changedArray.push(changedItemString);
	});
	changedString = changedArray.join('');
	//---
	returnValue = changedString;
	return returnValue;
}
function changeCarmelCaseToUnderbar(orgString){
	var returnValue = '';
	var index = 0;
	var orgProcessedString = '';
	var orgProcessedStringLength = 0;
	var orgProcessedChar = '';
	var isOrgProcessedCharUcase = false;
	var changedArray = null;
	var changedItemString = '';
	var changedString = '';
	//---
	const CONST_UPPER_CASE_SET_STRING = 'ABCDEFGHIJKLMNOPQRLTUVWXYZ';
	//---
	orgProcessedString = $.trim(orgString);
	orgProcessedStringLength = orgProcessedString.length;
	changedArray = [];
	for(index=0;index<orgProcessedStringLength;index++){
		orgProcessedChar = orgProcessedString.substring(index,index+1);
		changedItemString = orgProcessedChar;
		isOrgProcessedCharUcase = CONST_UPPER_CASE_SET_STRING.indexOf(orgProcessedChar)===-1 ? false : true;
		if(isOrgProcessedCharUcase){changedItemString = '_'+orgProcessedChar;}//if
		changedArray.push(changedItemString);
	}//for
	changedString = changedArray.join('');
	changedString = changedString.toLowerCase();
	//---
	returnValue = changedString;
	return returnValue;
}
function inArrayContains(checkArray,containsString){
	var returnValue = -1;
	var firstMatchingIndex = -1;
	var itemEditedString = '';
	//---
	containsString = nvl(containsString);
	if(isNotArray(checkArray)){return -1;}
	if(checkArray.length===0){return -1;}
	if(containsString===''){return -1;}
	//---
	$.each(checkArray,function(index,itemString){
		itemEditedString = nvl(itemString);
		if(itemEditedString.indexOf(containsString)!==-1){
			firstMatchingIndex = index;
			return false;
		}//if
	});
	//---
	returnValue = firstMatchingIndex;
	return returnValue;
}
function isArrayContains(containsArray,contentString){
	var returnValue = false;
	var isMatchingFlag = false;
	var itemEditedString = '';
	//---
	contentString = nvl(contentString);
	if(isNotArray(containsArray)){return false;}
	if(containsArray.length===0){return false;}
	if(contentString===''){return false;}
	//---
	$.each(containsArray,function(index,itemString){
		itemEditedString = nvl(itemString);
		if(contentString.indexOf(itemEditedString)!==-1){
			isMatchingFlag = true;
			return false;
		}//if
	});
	//---
	returnValue = isMatchingFlag;
	return returnValue;
}
function getCurrentTimestamp(){
	var returnValue = 0;
	returnValue = (new Date()).getTime();
	return returnValue;
}
function getCombinedSubFoldersPath(
	folderPathString,sub1FolderPath,sub2FolderPath
	,sub3FolderPath,sub4FolderPath,sub5FolderPath
	,sub6FolderPath,sub7FolderPath,sub8FolderPath
	,sub9FolderPath,sub10FolderPath
){
	var returnString = "";
	var errorReturnString = "";
	var templatePathString = "";
	var subFolderPathString = "";
	var subFolderPathArray = null;
	var subFolderPathArrayIndex = 0;
	var subFolderPathItemString = "";
	//---
	folderPathString = $.trim(folderPathString);
	folderPathString = folderPathString.replaceAll("\\","/");
	if(folderPathString==""){return errorReturnString;}//if
	//---
	sub1FolderPath = nvl(sub1FolderPath);
	sub2FolderPath = nvl(sub2FolderPath);
	sub3FolderPath = nvl(sub3FolderPath);
	sub4FolderPath = nvl(sub4FolderPath);
	sub5FolderPath = nvl(sub5FolderPath);
	sub6FolderPath = nvl(sub6FolderPath);
	sub7FolderPath = nvl(sub7FolderPath);
	sub8FolderPath = nvl(sub8FolderPath);
	sub9FolderPath = nvl(sub9FolderPath);
	sub10FolderPath = nvl(sub10FolderPath);
	//---
	subFolderPathArray = [];
	if(sub1FolderPath!==""){subFolderPathArray.push(sub1FolderPath);}//if
	if(sub2FolderPath!==""){subFolderPathArray.push(sub2FolderPath);}//if
	if(sub3FolderPath!==""){subFolderPathArray.push(sub3FolderPath);}//if
	if(sub4FolderPath!==""){subFolderPathArray.push(sub4FolderPath);}//if
	if(sub5FolderPath!==""){subFolderPathArray.push(sub5FolderPath);}//if
	if(sub6FolderPath!==""){subFolderPathArray.push(sub6FolderPath);}//if
	if(sub7FolderPath!==""){subFolderPathArray.push(sub7FolderPath);}//if
	if(sub8FolderPath!==""){subFolderPathArray.push(sub8FolderPath);}//if
	if(sub9FolderPath!==""){subFolderPathArray.push(sub9FolderPath);}//if
	if(sub10FolderPath!==""){subFolderPathArray.push(sub10FolderPath);}//if
	for(subFolderPathArrayIndex in subFolderPathArray){
		subFolderPathItemString = subFolderPathArray[subFolderPathArrayIndex];
		subFolderPathItemString = $.trim(subFolderPathItemString);
		subFolderPathItemString = subFolderPathItemString.replaceAll("\\","/");
		subFolderPathArray[subFolderPathArrayIndex] = subFolderPathItemString;
	}//for in
	//---
	subFolderPathString = subFolderPathArray.join("/");
	subFolderPathString = subFolderPathString.replaceAll("//","/");
	subFolderPathString = subFolderPathString.replaceAll("//","/");
	subFolderPathString = subFolderPathString.replaceAll("//","/");
	//---
	if(folderPathString.endsWith("/")){
		templatePathString = folderPathString+''+subFolderPathString;
	}else{
		templatePathString = folderPathString+'/'+subFolderPathString;
	}//if
	returnString = templatePathString;
	return returnString;
}
function isValidFormInputValue(formInputObject,validMessage){
	var returnFlag = true;
	var errorReturnFlag = false;
	var formInputString = '';
	//---
	validMessage = nvl(validMessage);
	formInputString = formInputObject.value;
	if(isNotObject(formInputObject)){return errorReturnFlag;}//if
	if(formInputString===''){alert(validMessage);returnFlag = false;}//if
	formInputObject.focus();
	//---
	return returnFlag;
}
function isStringContains(orgString,chkString){
	var returnValue = false;
	var errorReturnValue = false;
	//---
	if(isEmptyText(orgString)){return errorReturnValue;}//if
	if(isEmptyText(chkString)){return errorReturnValue;}//if
	//---
	if(orgString.indexOf(chkString)!==-1){returnValue = true;}//if
	//---
	return returnValue;
}
function getRemovedEmptyLineString(orgString){
	var returnValue = '';
	var errorReturnValue = '';
	var editOrgString = '';
	var linedStringArray = null;
	var removedEmptyLineArray = null;
	//---
	if(isEmptyText(orgString)){return errorReturnValue;}//if
	//---
	removedEmptyLineArray = [];
	editOrgString = nvl(orgString);
	linedStringArray = editOrgString.replaceAll("\r\n","\n").split("\n");
	$.each(linedStringArray,function(index,lineString){
		lineString = nvl(lineString);
		if(lineString!==''){removedEmptyLineArray.push(lineString);}//if
	});
	//---
	returnValue = removedEmptyLineArray.join('\n');
	return returnValue;
}
function getRemovedTrimEmptyLineString(orgString){
	var returnValue = '';
	var errorReturnValue = '';
	var editOrgString = '';
	var linedStringArray = null;
	var removedEmptyLineArray = null;
	//---
	if(isEmptyText(orgString)){return errorReturnValue;}//if
	//---
	removedEmptyLineArray = [];
	editOrgString = nvl(orgString);
	linedStringArray = editOrgString.replaceAll("\r\n","\n").split("\n");
	$.each(linedStringArray,function(index,lineString){
		lineString = $.trim(lineString);
		if(lineString!==''){removedEmptyLineArray.push(lineString);}//if
	});
	//---
	returnValue = removedEmptyLineArray.join('\n');
	return returnValue;
}
function setNumberInputDefaultValue(numberInputObject,defaultNumberValue){
	if(isEmpty(numberInputObject)){return;}//if
	if(isEmpty(defaultNumberValue)){return;}//if
	//---
	if(numberInputObject.value===''){
		numberInputObject.value = defaultNumberValue;
	}//if
}
function setStringInputDefaultValue(stringInputObject,defaultStringValue){
	if(isEmpty(stringInputObject)){return;}//if
	if(isEmpty(defaultStringValue)){return;}//if
	//---
	if(stringInputObject.value===''){
		stringInputObject.value = defaultStringValue;
	}//if
}