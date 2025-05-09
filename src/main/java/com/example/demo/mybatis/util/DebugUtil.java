package com.example.demo.mybatis.util;

import org.slf4j.Logger;

public class DebugUtil {
	private static String getDebugAreaStartString() {
		String returnValue = "";
		//---
		returnValue = "============================== debug start \n";
		//---
		return returnValue;
	}
	private static String getDebugAreaEndString() {
		String returnValue = "";
		//---
		returnValue = "============================== debug end \n";
		//---
		return returnValue;
	}
	//---
	public static String getDebugStartString(String debugTitleString) {
		StringBuffer logBuffer = new StringBuffer();
		String logString = "";
		String returnValue = "";
		//---
		logBuffer.append(getDebugAreaStartString());
		logBuffer.append("["+debugTitleString+" Debug String] \n");
		logString = logBuffer.toString();
		//---
		returnValue = logString;
		return returnValue;
	}
	public static String getDebugSBodyString(String debugTitleString, String debugValueString) {
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
	public static String getDebugSBodyString(String debugTitleString, Long debugValueNumber) {
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
	public static String getDebugSBodyString(String debugTitleString, Integer debugValueNumber) {
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
	public static String getDebugSBodyString(String debugTitleString, Float debugValueNumber) {
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
	public static String getDebugSBodyString(String debugTitleString, Double debugValueNumber) {
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
	public static String getDebugEndString() {
		StringBuffer logBuffer = new StringBuffer();
		String logString = "";
		String returnValue = "";
		//---
		logBuffer.append(getDebugAreaEndString());
		logString = logBuffer.toString();
		//---
		returnValue = logString;
		return returnValue;
	}
	//---
	public static void appendDebugStartStringBuffer(StringBuffer logBuffer, String debugTitleString) {
		logBuffer.append(getDebugAreaStartString());
		logBuffer.append("["+debugTitleString+" Debug String] \n");
	}
	public static void appendDebugBodyStringBuffer(StringBuffer logBuffer, String debugTitleString, String debugValueString) {
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
	}
	public static void appendDebugBodyStringBuffer(StringBuffer logBuffer, String debugTitleString, Long debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
	}
	public static void appendDebugBodyStringBuffer(StringBuffer logBuffer, String debugTitleString, Integer debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
	}
	public static void appendDebugBodyStringBuffer(StringBuffer logBuffer, String debugTitleString, Float debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
	}
	public static void appendDebugBodyStringBuffer(StringBuffer logBuffer, String debugTitleString, Double debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		logBuffer.append(debugTitleString+" : " + debugValueString + "\n");
	}
	public static void appendDebugEndStringBuffer(StringBuffer logBuffer) {
		logBuffer.append(getDebugAreaEndString());
	}
	//---
	public static void printDebugStartString(Logger log, String debugTitleString) {
		log.debug(getDebugAreaStartString());
		log.debug("["+debugTitleString+" Debug String] \n");
	}
	public static void printDebugBodyString(Logger log, String debugTitleString, String debugValueString) {
		log.debug(debugTitleString+" : " + debugValueString + "\n");
	}
	public static void printDebugBodyString(Logger log, String debugTitleString, Long debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		log.debug(debugTitleString+" : " + debugValueString + "\n");
	}
	public static void printDebugBodyString(Logger log, String debugTitleString, Integer debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		log.debug(debugTitleString+" : " + debugValueString + "\n");
	}
	public static void printDebugBodyString(Logger log, String debugTitleString, Float debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		log.debug(debugTitleString+" : " + debugValueString + "\n");
	}
	public static void printDebugBodyString(Logger log, String debugTitleString, Double debugValueNumber) {
		String debugValueString = "";
		//---
		debugValueString = String.valueOf(debugValueNumber);
		log.debug(debugTitleString+" : " + debugValueString + "\n");
	}
	public static void printDebugEndString(Logger log) {
		log.debug(getDebugAreaEndString());
	}
}
