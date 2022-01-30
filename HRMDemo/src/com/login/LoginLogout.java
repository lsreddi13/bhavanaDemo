package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginLogout {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\ExamplesTest\\HRMDemo\\BrowserDriver\\chromedriver.exe");  
		 WebDriver driver = new ChromeDriver();

	        driver.get("https://www.facebook.com");

//	        driver.quit();
	}

}
