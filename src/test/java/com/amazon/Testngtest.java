package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testngtest {

	WebDriver driver;

	@BeforeClass
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amreen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
	}
	
	@Test
	public void verifyPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("the page title is :" + title);
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");

	}

	@AfterClass
	public void tearDown() {
	//	driver.quit();

	}
}