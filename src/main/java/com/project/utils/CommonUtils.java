package com.project.utils;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;

public class CommonUtils {
	
	public static final int IMPLICIT_WAIT_TIME=10;
	public static final int PAGE_LOAD_TIME=15;
	public static final int EXPLICIT_WAIT_BASIC_TIME=30;
	
	public static String getEmailWithTimeStamp() {
		
		Date date = new Date();
		return "newemail"+date.toString().replace(" ","_").replace(":","_")+"@gmail.com";
		
	}
	public static byte[] takeScreenShot(Scenario scenario,WebDriver driver,String scenarioName) {
		byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		return srcScreenshot;
	}

}
