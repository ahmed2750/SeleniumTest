package com.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	  @BeforeMethod
	     public void setup() {
		    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Amreen\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver . manage().window().maximize();
	     driver . manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	     driver.get("https://www.google.com");
	  }
	  @Test 
	    public void googleTitleTest() {
		  String title = driver.getTitle();
		  System.out.println(title);
	  }
	  @Test
	  public void googleTest() {
		  driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	  }
	  @Test
	    public void mailLinkTest() {
		   boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	  }
	 
	     
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	}
	


