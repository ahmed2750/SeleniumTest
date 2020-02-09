package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Amreen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Amreen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
        
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
         driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        
         
           driver.findElement(By.xpath("//li[@id='p_90/8308921011']//i[@class='a-icon a-icon-checkbox']")).click();
         
       //driver.quit(); 
	}
}	