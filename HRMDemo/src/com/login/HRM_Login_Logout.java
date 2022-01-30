package com.login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HRM_Login_Logout {
	static WebDriver driver;
	

	@Test
	public void cehckInvalidWarning() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ExamplesTest\\HRMDemo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

		driver.get(url);

	
		
		String value = driver.findElement(By.xpath("//div/div/div[2]/span")).getText();
		System.out.println("dialyed value : " + value);
		driver.findElement(By.id("txtUsername")).sendKeys("bhavana");
		driver.findElement(By.name("txtPassword")).sendKeys("bavana123");

		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(30000);
		
		String warn_message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println("warning message displayed for invlaid login data : "+ warn_message);
		
		//compare actual and expected value
		Assert.assertEquals(warn_message, "Invalid credentials");
		
		driver.quit();

	}
	@Test
	public void cehckAdminLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ExamplesTest\\HRMDemo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

		driver.get(url);

				
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		String dashboard_txt = driver.findElement(By.xpath("//h1")).getText();
		
		Assert.assertEquals(dashboard_txt, "Dashboard");
	}
	
	
}
