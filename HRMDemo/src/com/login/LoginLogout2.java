package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginLogout2 {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "E:\\ExamplesTest\\HRMDemo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

//	        driver.quit();
	}

}
