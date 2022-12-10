package com.ns.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ns.testBase.TestBaseClass;

public class ListenerSetup extends TestBaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
		logger.info("Test Execution Started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		logger.info("Test Execution Completed"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		logger.info("Test Execution Failed"+result.getName());
		CommonClass.Screnshot(result.getTestName());
		logger.info("Screenshot Captured");
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		logger.info("Test Execution Skipped"+result.getName());
	}

	
}
