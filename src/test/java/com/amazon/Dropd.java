package com.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropd extends Login {

	private static int i;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Amreen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// driver.findElement(By.name("First_Name")).sendKeys("ahmed");
		// driver.findElement(By.name("lastName")).sendKeys("Khan");

		WebElement month = driver.findElement(By.name("birthday_month"));
		driver.findElement(By.xpath("//select[@id='month']")).click();

		Select m1 = new Select(month);
		m1.selectByIndex(6);
		// m1.deselectByVisibleText("month");

		WebElement day = driver.findElement(By.id("day"));
		driver.findElement(By.xpath("//select[@id='day']")).click();

		Select d1 = new Select(day);
		d1.selectByIndex(27);

		// d1.deselectByValue("4");
		// d1.deselectByVisibleText("Day");

		// WebElement month = driver.findElement(By.name("birthday_month"));
		// driver.findElement(By.xpath("//select[@id='month']")).click();

		// Select m1 = new Select(month);
		// m1.selectByIndex(6);
		// m1.deselectByVisibleText("month");

		WebElement year = driver.findElement(By.id("year"));
		driver.findElement(By.xpath("//option[contains(text(),'1971')]")).click();

		Select y1 = new Select(year);
		y1.selectByIndex(49);
		// 1.deselectByVisibleText("year");

		List<WebElement> dd = d1.getOptions();
		System.out.println(dd.size());

		for (int i = 0; i < dd.size(); i++)
			;
		String txt = dd.get(i).getText();
		System.out.println(txt);

		System.out.println(txt);

	}

}
