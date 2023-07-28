package com.actiTime.genernic;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
@Listeners(com.actiTime.genernic.Listernerimplemention.class)
public class Listernerimplemention extends Baseclass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
	    File desc=new File("./ScreenShot1/"+name+".png");
	    try {
	    	FileUtils.copyFile(src,desc);
	    }
	    catch(IOException e) {
	    	
	    	
	    }
	}

	@Override
	public void onTestFailure(ITestResult result) {
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

}