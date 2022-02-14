package com.SA.org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardHeading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		By txtbox_username = By.xpath("//input[@id='txtUsername']");

        By txtbox_password = By.xpath("//input[@id='txtPassword']");

        By button_login = By.xpath("//div[@id='divLoginButton']//input");

        By table_Dashboard = By.xpath("//b[text()='Dashboard']");

        By highdefination_Dashboard = By.xpath("//h1");

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\choubeyj\\eclipse-workspace\\SeleniumAssignment\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

   wait.until(ExpectedConditions.visibilityOfElementLocated(txtbox_username));

   driver.findElement(txtbox_username).sendKeys("Admin");

   driver.findElement(txtbox_password).sendKeys("admin123");

        driver.findElement(button_login).click();

        String text = driver.findElement(highdefination_Dashboard).getText();

        System.out.println(text);
        
        driver.close();
	}

}
