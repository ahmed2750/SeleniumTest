package com.amazon;

import static org.testng.Assert.assertEquals;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class TestngDemo {
	
	  WebDriver driver;
	  
	@BeforeClass
	public void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amreen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	   //driver.get("https://www.facebook.com");
		
	
	}
	 @Test  
	 public void googleSearch() {
		driver.get("https://www.facebook.com");		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ak2750290@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Raheem@1");
        driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
        
	 }
    @Test
       public void yahooLogin() {
		driver.get("https://www.yahoo.com");
		driver.findElement(By.xpath(" //span[contains(text(),'Sign in')]")).click();
    	
    	
    
	    //driver.findElement(By.name("btnk")).sendKeys(key.RETURN);
		//driver.close();
   //   assertEquals(true,"true");
	/*   }
		@Test
			public void test2() {
			driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='u_0_f']")).sendKeys("ahmed");
		driver.findElement(By.xpath("//input[@id='u_0_h']")).sendKeys("khan");
		driver.findElement(By.xpath("//input[@id='u_0_k']")).sendKeys("ak2750290@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_k']")).sendKeys("ak2750290@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_p']")).sendKeys("Raheem@1");
		
		    WebElement month =  driver.findElement(By.name("birthday_month"));
		    driver.findElement(By.xpath("//select[@id='month']")).click(); 
			Select m1 = new Select(month);
			m1.selectByIndex(6);
			//m1.deselectByVisibleText("month");
	        
	       WebElement day = driver.findElement(By.id("day"));
	       driver.findElement(By.xpath("//select[@id='day']")).click();
	        Select d1 = new Select(day);
	        d1.selectByValue("27");
			//d.deselectByVisibleText("Day");
			
	      
			
			WebElement year =  driver.findElement(By.id("year"));
			driver.findElement(By.xpath("//option[contains(text(),'1971')]")).click();
			
			
		 //   WebElement radio = driver.findElement(By.name("radeo"));
		  //  driver.findElement(By.xpath("//input[@id='u_0_a']"));
		   // Select r1 = new Select("redeo");
			    // r1.selectByValue("2");               
	        
	     // List gender =  (List) driver.findElements(By.name("sex"));
	      // int cnt = gender.size();
	       // System.out.println(cnt);
	        
	    // WebElement female = driver.findElement(By.name("gender"));
	       //Select gender1;
	       
	        
	
		driver.findElement(By.xpath("//button[@id='u_0_w']")).click();
		assertEquals(false,"fillup all the tabs");*/
		
		} 
		
			
			
		@AfterClass
     public void tearDown(){
		
       driver.close();
		   driver.quit();
		   
		   
      System.out.println("This is my work");
      System.out.println("test completed succcessfully its all my affort ");
		

		
}
	
	
}	
	
	
	
	
	
	
	


