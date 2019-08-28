package com.org.unit.Framework.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
   
	public static WebDriver startApplication(WebDriver d,String BrowserName, String appUrl)
	{
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			d= new ChromeDriver();
		}else
		if(BrowserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			d= new InternetExplorerDriver();
		}else
		{
			System.out.println("We don't support this browser");
		}
		d.get(appUrl);
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    return d;
	
	}
	
   public static void closeBrowser(WebDriver d)
   {
	   d.quit();
   }
}
