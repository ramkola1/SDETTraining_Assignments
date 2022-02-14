package com.SA.org.SeleniumAssignment;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.SA.org.SeleniumAssignment.listener_implementation.class)
public class TestListeners extends Base1{
	
	@Test(retryAnalyzer = retrying_setup.class)
	public void TestListener1() throws IOException {
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnXXXXXXLogin']").click();
		String text = driver.findElementByXPath("//h1[contains(text(),'Dashboard')]").getText();
		AssertJUnit.assertEquals(text, "Dashboard");
		//Find the table
		//WebElement elementTable = driver.findElementById(null)
	}
	
	@Test
	public void TestListener2() throws IOException {
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnLogin']").click();
		String text = driver.findElementByXPath("//h1[contains(text(),'Dashboard')]").getText();
		AssertJUnit.assertEquals(text, "Dashboard");
		
	}

}
