package com.SA.org.SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\choubeyj\\eclipse-workspace\\SeleniumAssignment\\Drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				//WebDriverManager.chromedriver().setup();
				//ChromeDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				 System.out.println("WebPage Title: " + driver.getTitle());
				 driver.close();
	}

}
