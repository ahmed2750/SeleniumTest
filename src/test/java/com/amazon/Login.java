package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;

	 @BeforeMethod
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amreen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.google.com");
	}

	@Test
	public void gmailLogin() {

		// launch the firefox browser and open the application url
		driver.get("https://www.gmail.com");

		// maximize the browser window
		driver.manage().window().maximize();

		// declare and initialize the variable to store the expected title of the web page.
		String expectedTitle = "Gmail";

		// fetch the title of the web page and save it into a string variable
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);

		
	//	driver.findElement(By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(@class,'h-c-header__nav-li-link')][contains(text(),'Sign in')]")).click();
		
		// enter a valid username in the email textbox
		WebElement username = driver.findElement(By.xpath("//input[@id='identifierId']"));
		username.sendKeys("TestSelenium");

		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

		// enter a valid password in the password textbox
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("raheem123");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

//		// click on the Sign in button
//		WebElement SignInButton = driver.findElement(By.id("signIn"));
//
//		SignInButton.click();
//		// close the web browser

		//driver.close();
	}

	  @AfterMethod
	public void afterTest() {
	//	driver.quit();
	}
}