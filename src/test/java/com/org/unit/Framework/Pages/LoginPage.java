package com.org.unit.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
   WebDriver d;	
   public LoginPage(WebDriver d1)
   {
	   this.d=d1;
   }
   @FindBy(id="email") WebElement uname; 
   @FindBy(id="password") WebElement pass;
   @FindBy(xpath=".//*[@id='form']/div[3]/div/button") WebElement loginbutton;
   
   public void loginToApp(String uname1, double pass1)
   {
	   uname.sendKeys(uname1);
	   pass.sendKeys(String.valueOf((int)pass1));
	   loginbutton.click();
	  
	   
   }
}
