package com.example.demo.mybatis.util;

import java.util.Random;

public class CommonUtil {
	public static long GetRandomLongNumber() {
		Random random = new Random();
		long returnValue = 0;
		//---
		random.setSeed(System.currentTimeMillis());
		//---
		returnValue = random.nextLong();
		return returnValue;
	}
	public static int GetRandomIntNumber() {
		Random random = new Random();
		int returnValue = 0;
		//---
		random.setSeed(System.currentTimeMillis());
		//---
		returnValue = random.nextInt();
		return returnValue;
	}
}
