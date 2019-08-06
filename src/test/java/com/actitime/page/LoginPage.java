package com.actitime.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.actitime.generic.*;

public class LoginPage extends BasePage {
	
	//declaration
	@FindBy(id="username")
	private WebElement userNameTb;
	@FindBy(name="pwd")
	private WebElement passWordTb;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMsg;
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
    //initilization
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	public void enterUserName(String un)
	{
		userNameTb.sendKeys(un);
	}
	public void enterPassWord(String pwd)
	{
		passWordTb.sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		loginBtn.click();
	}
	public void verifingTitle(String eTitle) throws Exception
	{
		verifyTitle(eTitle);
	}
	public void verifyErrorMsg() throws Exception
	{
		verifyElement(errMsg);
	}
	public void verifyVersion(String eVersion)
	{
		String aVersion = version.getText();
		Assert.assertEquals(aVersion, eVersion);
	}
	
}
