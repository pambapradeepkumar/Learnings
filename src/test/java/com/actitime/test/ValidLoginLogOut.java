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
import com.actitime.page.EnterTimeTrackPage;
import com.actitime.page.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class ValidLoginLogOut  extends BaseTest {
	@Test
	public void testValidLoginLogOut() throws Exception 
	{
		
			String loigTitle = ExcelData.getData(path, "Login", 1, 2);
			System.out.println("loginTitle :"+loigTitle);
			String user = ExcelData.getData(path, "Login",1,0);
			String pass = ExcelData.getData(path, "Login",1,1);
			String enterTimeTrackTitle = ExcelData.getData(path, "EnterTimeTrack", 1, 2);
			System.out.println("enterTimeTrackTitle :"+enterTimeTrackTitle);
			LoginPage lp=new LoginPage(driver);
            //click on logout
			EnterTimeTrackPage tp=new EnterTimeTrackPage(driver);
			//verify loginpage title
			lp.verifingTitle(loigTitle);
			//enter valid user name
			lp.enterUserName(user);
			Thread.sleep(1000);
			//enetr valid password
			lp.enterPassWord(pass);
			//click on login
			lp.clickOnLogin();
			//verify enter time track page title
			lp.verifingTitle(enterTimeTrackTitle);
			
			//click on logout page
			tp.clickOnLogOut();
			//verifing login page title
			lp.verifingTitle(loigTitle);
			
	}
	

}
