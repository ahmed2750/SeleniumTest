package com.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redeo {

	

	public static void main(String[] args) {

		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Amreen\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.facebook.com/"); 
	        driver.findElement(By.xpath("//input[@placeholder='Email or Phone Number']")).sendKeys("ak2750290@gmail.com");
	         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sultanai");
	         driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	        driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("ak275929@gmail.com");
	        driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys("shkeel786");
	        
	        WebElement month =  driver.findElement(By.name("birthday_month"));
			driver.findElement(By.xpath("//select[@id='month']")).click(); 
			Select m1 = new Select(month);
			m1.selectByIndex(6);
			m1.deselectByVisibleText("month");
	        
	     
			WebElement day = driver.findElement(By.id("day"));
	        driver.findElement(By.xpath("//select[@id='day']")).click();
	      
	    
	        Select d1 = new Select(day);
	      
			d1.deselectByValue("4");
			//d1.deselectByVisibleText("Day");
			
	       // WebElement month =  driver.findElement(By.name("birthday_month"));
	        //	driver.findElement(By.xpath("//select[@id='month']")).click();
			
	        //	Select m1 = new Select(month);
	      //  m1.selectByIndex(6);
	      // m1.deselectByVisibleText("month");
			
			WebElement year =  driver.findElement(By.id("year"));
			driver.findElement(By.xpath("//option[contains(text(),'1971')]")).click();
			
			Select y1 = new Select(year);
		
	        y1.selectByIndex(49);
		y1.deselectByVisibleText("year");
			                    
	        
	        List <WebElement> gender =  driver.findElements(By.name("sex"));
	        int cnt = gender.size();
	      //  System.out.println(cnt);
	        
	       WebElement female = driver.findElement(By.name("gender"));
	       // selecting gender
	        driver.findElement(By.xpath("//input[@id='u_0_8']")).click();
	        driver.close();
	      // click submit;
	        driver.findElement(By.xpath("//button[@id='u_0_y']")).click();
	        
	        driver.close();
	
	        
      for (int i =0; i < cnt ; i++)
	     {
	        
	    	  String txt = gender.get(i).getText();
	       System.out.println(txt);
	       gender.get(i).click();
	        
	        }   
	}

}
