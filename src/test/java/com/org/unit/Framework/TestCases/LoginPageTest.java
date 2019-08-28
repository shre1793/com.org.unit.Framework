package com.org.unit.Framework.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.org.unit.Framework.Pages.BaseClass;
import com.org.unit.Framework.Pages.LoginPage;

public class LoginPageTest extends BaseClass 

{

	
	@Test
	public void loginPage()
	{
		
		LoginPage lp=PageFactory.initElements(d, LoginPage.class);
		
		
		lp.loginToApp( edp.getStringValue(0, 0, 0), (edp.getNumericValue(0, 0, 1)));
		
	}
	
	
}
