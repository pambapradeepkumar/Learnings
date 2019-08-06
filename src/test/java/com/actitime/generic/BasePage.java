package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public static WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//To verify the Title
	public void verifyTitle(String eTitle) throws Exception
	{
		try
		{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Title is Matching :"+eTitle, true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching :",true);
			
			Assert.fail();
			throw e;
		}
		
	}
	
	//To verify the Element
	public void verifyElement(WebElement element) throws Exception
	{
		try
		{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is present :"+element.getText(), true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not matching :", true);
			Assert.fail();
			throw e;
		}
	}
}
