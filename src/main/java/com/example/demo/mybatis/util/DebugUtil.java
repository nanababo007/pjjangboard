package com.example.demo.mybatis.util;

import org.slf4j.Logger;

import com.example.demo.mybatis.commons.pager.SiteDebugger;

public class DebugUtil {
	public static SiteDebugger getSiteDebugger() {
		return new SiteDebugger();
	}
	public static void printDebugString(Logger log, String debugTitleString, String debugNameString, String debugValueString) {
		SiteDebugger siteDebugger = getSiteDebugger();
		siteDebugger.printDebugStartString(log, debugTitleString);
		siteDebugger.printDebugBodyString(log, debugNameString, debugValueString);
		siteDebugger.printDebugEndString(log);
	}
	public static void printDebugString(Logger log, String debugTitleString, String debugNameString, Long debugValueNumber) {
		SiteDebugger siteDebugger = getSiteDebugger();
		siteDebugger.printDebugStartString(log, debugTitleString);
		siteDebugger.printDebugBodyString(log, debugNameString, debugValueNumber);
		siteDebugger.printDebugEndString(log);
	}
	public static void printDebugString(Logger log, String debugTitleString, String debugNameString, Integer debugValueNumber) {
		SiteDebugger siteDebugger = getSiteDebugger();
		siteDebugger.printDebugStartString(log, debugTitleString);
		siteDebugger.printDebugBodyString(log, debugNameString, debugValueNumber);
		siteDebugger.printDebugEndString(log);
	}
	public static void printDebugString(Logger log, String debugTitleString, String debugNameString, Float debugValueNumber) {
		SiteDebugger siteDebugger = getSiteDebugger();
		siteDebugger.printDebugStartString(log, debugTitleString);
		siteDebugger.printDebugBodyString(log, debugNameString, debugValueNumber);
		siteDebugger.printDebugEndString(log);
	}
	public static void printDebugString(Logger log, String debugTitleString, String debugNameString, Double debugValueNumber) {
		SiteDebugger siteDebugger = getSiteDebugger();
		siteDebugger.printDebugStartString(log, debugTitleString);
		siteDebugger.printDebugBodyString(log, debugNameString, debugValueNumber);
		siteDebugger.printDebugEndString(log);
	}
}
