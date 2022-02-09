package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoLinkText {

	@Test(enabled = false)
	public void demoTest() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ExamplesTest\\HRMDemo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

		driver.get(url);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//verify the url - user should navigate to forgot password page
		
//		get the url from the browser
		
		
		String forgotPWd_PageUrl = driver.getCurrentUrl();
		
		System.out.println(forgotPWd_PageUrl);
		
		String Expected_url = "https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode";
		Assert.assertEquals(forgotPWd_PageUrl, Expected_url);
		
		
		
		
	}
	
	@Test
	public void demoTest2() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ExamplesTest\\HRMDemo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

		driver.get(url);
		
		driver.findElement(By.partialLinkText("Forgot your")).click();
		
		//verify the url - user should navigate to forgot password page
		
//		get the url from the browser
		
		
		String forgotPWd_PageUrl = driver.getCurrentUrl();
		
		System.out.println(forgotPWd_PageUrl);
		
		String Expected_url = "https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode";
		Assert.assertEquals(forgotPWd_PageUrl, Expected_url);
		
		
		//Verify Reset password is displayed or not in the forgot password page.
		
		WebElement reset_pwd_btn = 	driver.findElement(By.id("btnSearchValues"));
		
		System.out.println(reset_pwd_btn.isDisplayed());
		Assert.assertTrue(reset_pwd_btn.isDisplayed());
		
		
		//print the button name
		String btn_value = reset_pwd_btn.getAttribute("value");
		System.out.println(btn_value);
		
		//click button
//			reset_pwd_btn.click();
		
		
		
		
		
		
	}
	
	
}
