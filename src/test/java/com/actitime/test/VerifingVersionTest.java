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
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.page.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class VerifingVersionTest extends BaseTest {
	@Test
	public void testVerifingVersion() throws Exception
	{
		String loginTitle = ExcelData.getData(path, "Login", 1, 2);
		System.out.println("loginTitle :"+loginTitle);
		String version = ExcelData.getData(path, "Login", 1, 3);
		LoginPage lp=new LoginPage(driver);
		//verifing login page title
		lp.verifingTitle(loginTitle);
		//verifing version
		lp.verifyVersion(version);
		
	}

}
