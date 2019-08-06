package com.actitime.generic;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import bsh.util.Util;

public class ListenersTest implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		try
		{
		TakesScreenshot t=(TakesScreenshot) BaseTest.driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("/home/pradeep/Desktop/FrameWork/ActiTime/screenshots/"+name+".png");
		FileUtils.copyFile(src, dest);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		
		
	}
	

}
