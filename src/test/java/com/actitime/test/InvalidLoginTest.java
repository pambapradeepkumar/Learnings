package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.generic.ListenersTest;
import com.actitime.page.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class InvalidLoginTest extends BaseTest {
	@Test
	public void testInvalidLogin() throws Exception
	{
		ListenersTest lisTest=new ListenersTest();
		String loginTitle = ExcelData.getData(path, "Login", 1, 2);
		System.out.println("loginTitle :"+loginTitle);
		String user = ExcelData.getData(path, "Login", 2, 0);
		String pass = ExcelData.getData(path, "Login", 2, 1);
		LoginPage lp=new LoginPage(driver);
		//verify login page title
		lp.verifingTitle(loginTitle);
		//enter invalid username
		lp.enterUserName(user);
		//enter invalid password
		lp.enterPassWord(pass);
		//clickon login
		lp.clickOnLogin();
		//verify error message
		lp.verifyErrorMsg();
		
	}

}
