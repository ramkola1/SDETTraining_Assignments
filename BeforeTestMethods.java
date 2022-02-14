package com.SA.org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeTestMethods {
	
	WebDriver driver;

    By txtbox_username = By.xpath("//input[@id='txtUsername']");

    By txtbox_password = By.xpath("//input[@id='txtPassword']");

    By button_login= By.xpath("//div[@id='divLoginButton']//input");

    @BeforeSuite
    public void driverLaunch() {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\choubeyj\\eclipse-workspace\\SeleniumAssignment\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
     
    }

    @Test(priority=1)
    public void LoginApp() throws InterruptedException {

         driver.get("https://opensource-demo.orangehrmlive.com/");

         driver.manage().window().maximize();

         Thread.sleep(2000);

    driver.findElement(txtbox_username).sendKeys("Admin");

    driver.findElement(txtbox_password).sendKeys("admin123");

         driver.findElement(button_login).click();
         
         driver.close();

    }
    
}


	


