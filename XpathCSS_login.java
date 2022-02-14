package com.SA.org.SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCSS_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\choubeyj\\eclipse-workspace\\SeleniumAssignment\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 
			By img_logo= By.xpath("//div[@id='divLogo']/img");

	        By img_logo_css=By.cssSelector("div#divLogo img");

	        By img_Link= By.xpath("//div[@id='footer']//div[2]//a[1]");

	        By img_Link_css =By.cssSelector("div#footer div:nth-child(2) a:nth-child(1)");

	        By img_fb= By.xpath("//div[@id='footer']//div[2]//a[2]");

	        By img_fb_css=By.cssSelector("div#footer div:nth-child(2) a:nth-child(2)");

	        By img_Tweet= By.xpath("//div[@id='footer']//div[2]//a[3]");

	        By img_Tweet_css =By.cssSelector("div#footer div:nth-child(4) a:nth-child(3)");

	        By img_Youtube= By.xpath("//div[@id='footer']//div[2]//a[4]");

	        By img_Youtube_css =By.cssSelector("div#footer div:nth-child(5) a:nth-child(4)");
	        
	        By txtbx_username = By.xpath("//input[@id='txtUsername']");

	        By txtbx_password = By.xpath("//input[@id='txtPassword']");

	        By txtbx_username_css = By.cssSelector("input#txtUsername");

	        By txtbx_password_css = By.cssSelector("input#txtPassword");
	        
	        By hreff_resetPassword= By.xpath("//div [@id='forgotPasswordLink']/a");

	        By hreff_resetPassword_css= By.cssSelector("div#forgotPasswordLink");

	        By hreff_OrangeHRM= By.xpath("//div [@id='footer']/div[1]/a");

	        By hreff_OrangeHRM_css= By.cssSelector("div#footer div:nth-child(1) a");
		 driver.close();
	}

}
