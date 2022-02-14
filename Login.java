package com.SA.org.SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) {
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
		String actUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String expUrl= driver.getCurrentUrl();
		Assert.assertEquals(expUrl,actUrl);
		 driver.close();
	}

}
