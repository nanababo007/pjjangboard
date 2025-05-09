package com.example.demo.mybatis.commons.pager;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class SiteDebugger {
	private String debugAreaStartString;
	private String debugAreaEndString;
	//---
	public SiteDebugger() {
		this.debugAreaStartString = "============================== debug start \n";
		this.debugAreaEndString = "============================== debug end \n";
	}
	public SiteDebugger(String debugAreaStartString, String debugAreaEndString) {
		this.debugAreaStartString = debugAreaStartString;
		this.debugAreaEndString = debugAreaEndString;
	}
	//---
	public String getDebugStartString(String debugTitleString) {
		StringBuffer logBuffer = new StringBuffer();
		String logString = "";
		String returnValue = "";
		//---
		logBuffer.append(this.debugAreaStartString);
		logBuffer.append("["+debugTitleString+" Debug String] \n");
		logString = logBuffer.toString();
		//---
		returnValue = logString;
		return returnValue;
	}
	public String getDebugSBodyString(String debugTitleString, String debugValueString) {
		StringBuffer logBuffer = new StringBuffer();
		String logString = "";
		String returnValue = "";
		//---
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
		logString = logBuffer.toString();
		//---
		returnValue = logString;
		return returnValue;
	}
	public String getDebugSBodyString(String debugTitleString, Long debugValueNumber) {
		StringBuffer logBuffer = new StringBuffer();
		String logString = "";
		String returnValue = "";
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
		logString = logBuffer.toString();
		//---
		returnValue = logString;
		return returnValue;
	}
	public String getDebugSBodyString(String debugTitleString, Integer debugValueNumber) {
		StringBuffer logBuffer = new StringBuffer();
		String logString = "";
		String returnValue = "";
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
		logString = logBuffer.toString();
		//---
		returnValue = logString;
		return returnValue;
	}
	public String getDebugSBodyString(String debugTitleString, Float debugValueNumber) {
		StringBuffer logBuffer = new StringBuffer();
		String logString = "";
		String returnValue = "";
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
		logString = logBuffer.toString();
		//---
		returnValue = logString;
		return returnValue;
	}
	public String getDebugSBodyString(String debugTitleString, Double debugValueNumber) {
		StringBuffer logBuffer = new StringBuffer();
		String logString = "";
		String returnValue = "";
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
		logString = logBuffer.toString();
		//---
		returnValue = logString;
		return returnValue;
	}
	public String getDebugEndString() {
		StringBuffer logBuffer = new StringBuffer();
		String logString = "";
		String returnValue = "";
		//---
		logBuffer.append(debugAreaEndString);
		logString = logBuffer.toString();
		//---
		returnValue = logString;
		return returnValue;
	}
	//---
	public void appendDebugStartStringBuffer(StringBuffer logBuffer, String debugTitleString) {
		logBuffer.append(this.debugAreaStartString);
		logBuffer.append("["+debugTitleString+" Debug String] \n");
	}
	public void appendDebugBodyStringBuffer(StringBuffer logBuffer, String debugTitleString, String debugValueString) {
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
	}
	public void appendDebugBodyStringBuffer(StringBuffer logBuffer, String debugTitleString, Long debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
	}
	public void appendDebugBodyStringBuffer(StringBuffer logBuffer, String debugTitleString, Integer debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
	}
	public void appendDebugBodyStringBuffer(StringBuffer logBuffer, String debugTitleString, Float debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
	}
	public void appendDebugBodyStringBuffer(StringBuffer logBuffer, String debugTitleString, Double debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
	}
	public void appendDebugEndStringBuffer(StringBuffer logBuffer) {
		logBuffer.append(debugAreaEndString);
	}
	//---
	public void printDebugStartString(Logger log, String debugTitleString) {
		log.debug(this.debugAreaStartString);
		log.debug("["+debugTitleString+" Debug String] \n");
	}
	public void printDebugBodyString(Logger log, String debugTitleString, String debugValueString) {
		log.debug(debugTitleString+" : " + debugValueString + "\n");
	}
	public void printDebugBodyString(Logger log, String debugTitleString, Long debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		log.debug(debugTitleString+" : " + debugValueString + "\n");
	}
	public void printDebugBodyString(Logger log, String debugTitleString, Integer debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		log.debug(debugTitleString+" : " + debugValueString + "\n");
	}
	public void printDebugBodyString(Logger log, String debugTitleString, Float debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		log.debug(debugTitleString+" : " + debugValueString + "\n");
	}
	public void printDebugBodyString(Logger log, String debugTitleString, Double debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		log.debug(debugTitleString+" : " + debugValueString + "\n");
	}
	public void printDebugEndString(Logger log) {
		log.debug(debugAreaEndString);
	}
}
