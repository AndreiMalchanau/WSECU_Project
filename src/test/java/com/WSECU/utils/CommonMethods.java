package com.WSECU.utils;

import com.WSECU.testbase.PageInitializer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends PageInitializer {

	public static void takeScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("screenshot/WSECU/InvalidLogin.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static byte[] takeScreenshot(String fileName) {

		TakesScreenshot ts = (TakesScreenshot)driver;
		
		byte[]picture=ts.getScreenshotAs(OutputType.BYTES);
	
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MMdd_HHmmss");
		String timeStamp = sdf.format(date.getTime());

		File file = ts.getScreenshotAs(OutputType.FILE);
		String scrshotFile = Constants.SCREENSHOTS_FILEPATH + fileName + timeStamp + ".png";

		try {
			FileUtils.copyFile(file, new File(scrshotFile));
		} catch (IOException e) {
			System.out.println("Cannot take a screenshot");
		}

		return picture;
	}

	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_LOAD_TIME);
		return wait;
	}	    
}
