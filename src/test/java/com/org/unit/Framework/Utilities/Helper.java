package com.org.unit.Framework.Utilities;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper 
{
	public static void captureScreenshots(WebDriver d)
	{
		TakesScreenshot ts=((TakesScreenshot)d);
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		try {
			org.openqa.selenium.io.FileHandler.copy(src2, new File("./Screenshots/Login.png"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
