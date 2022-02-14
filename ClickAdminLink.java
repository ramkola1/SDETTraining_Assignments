package com.SA.org.SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAdminLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\choubeyj\\eclipse-workspace\\SeleniumAssignment\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin",Keys.TAB);
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123",Keys.TAB);
		WebElement login=driver.findElement(By.name("Submit"));
		login.click();
		driver.findElementById("menu_admin_viewAdminModule").click();
		Thread.sleep(2000L);
		driver.findElementById("menu_admin_UserManagement").click();
		Thread.sleep(2000L);
		driver.findElementById("menu_admin_Job").click();
		Thread.sleep(2000L);
		driver.findElementById("menu_admin_Organization").click();
		Thread.sleep(2000L);
		driver.findElementById("menu_admin_Qualifications").click();
		Thread.sleep(2000L);
		
		driver.close();
	}

}
