package com.org.unit.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.org.unit.Framework.Utilities.BrowserFactory;
import com.org.unit.Framework.Utilities.ConfigDataProvider;
import com.org.unit.Framework.Utilities.ExcelDataProvider;
import com.org.unit.Framework.Utilities.Helper;

public class BaseClass 
{

	public WebDriver d;
	public ExcelDataProvider edp;
	public ConfigDataProvider gdc;
	
	@BeforeSuite
	public void init()
	{
	 edp= new ExcelDataProvider();
	 gdc= new ConfigDataProvider();
	}
	@AfterTest
	public void close()
	{
	 BrowserFactory.closeBrowser(d);
	}
	
	@BeforeTest
	public void setupApp()
	{
		d=BrowserFactory.startApplication(d, gdc.getConfigData("Browser"), gdc.getConfigData("Appurl"));
	}
	
	@AfterMethod
	public void tearDown()
	
	{
   		
		Helper.captureScreenshots(d);
	}

}
