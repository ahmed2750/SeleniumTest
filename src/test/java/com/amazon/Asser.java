package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Asser {
	WebDriver driver;
	 
	@BeforeClass
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amreen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  
	}
	@Test  
	public void validLogin() {
		//driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ak75577@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("raheem123");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		
	}
   @Test
      public void validation() {
	   driver.get("https://www.facebook.com");
	   driver.findElement(By.xpath("//input[@id='u_0_f']")).sendKeys("shak");
	  driver.findElement(By.xpath("//button[@id='u_0_w']")).click();
	//assertEquals(true, "fillup all requermant");
	  
   }
   @
   Test
       public void verification() {
	    driver.get("https://www.facebook.com");
       driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
     //Assert.assertEquals(false, "false");   
	   
  }
	
	@AfterClass
    public void tearDownTest(){
      driver.close();
      driver.quit();
		
		
		
	
	
	
	}
	
	
	

}
