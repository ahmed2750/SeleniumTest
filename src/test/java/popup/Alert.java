package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	//just for reference ok

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Amreen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.ksrtc.com/");
        
        driver.findElement(By.xpath("xpathExpression")).click();
        
        String txt = driver.switchTo().alert().getText();
        System.out.println(txt);
        
        
		

	}

}
