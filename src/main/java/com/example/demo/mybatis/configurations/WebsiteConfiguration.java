package com.example.demo.mybatis.configurations;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.env.PropertiesPropertySourceLoader;

public class WebsiteConfiguration {
	private static Properties properties = new Properties();
	//---
	public static boolean debugFlag = false;
	private static String debugFlagString = "";
	public static long defaultPageSize = 0;
	public static long defaultBlockSize = 0;
	//---
	static {
		System.out.println("website.properties config file read start ===============");
		try (InputStream input = PropertiesPropertySourceLoader.class.getClassLoader().getResourceAsStream("website.properties")) {
			if (input == null) {
				System.out.println("ERROR: Sorry, unable to find website.properties");
			}else {
				properties.load(input);
				//---
				debugFlagString = properties.getProperty("debugFlag");
				debugFlag = debugFlagString.equals("true") ? true : false;
				defaultPageSize = Long.valueOf(properties.getProperty("defaultPageSize"));
				defaultBlockSize = Long.valueOf(properties.getProperty("defaultBlockSize"));
				//---
				System.out.println("debugFlag : "+ debugFlag );
				System.out.println("debugFlagString : "+ debugFlagString );
				System.out.println("defaultPageSize : "+ defaultPageSize );
				System.out.println("defaultBlockSize : "+ defaultBlockSize );
			}//if
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("website.properties config file read end ===============");
	}
}