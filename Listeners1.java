package com.SA.org.SeleniumAssignment;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Listeners1 extends Base1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test success..." + result.getMethod());
		Shutterbug.shootPage(Base.driver).withName("automationtestingscreenshotPass").save();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed..." + result.getMethod());
		Shutterbug.shootPage(Base.driver).withName("automationtestingscreenshotFail").save();
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
