package com.qsp.genricutility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qsp.objectRepository.BaseClass;

public class ListenerUtility extends BaseClass implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();
		javaLib = new JavaUtility();
		String timeStamp = javaLib.getSystemTime();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+methodName+timeStamp+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(temp, dest);
		} catch (IOException e) {
		
			e.printStackTrace();
		}	
	}
}
