package com.wipro.MavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement clickhere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		
		clickhere.click();
		
		
		Object[] windowHandles=driver.getWindowHandles().toArray();
		
		driver.switchTo().window((String) windowHandles[1]);
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(5000);
		
		driver.close();
		
		driver.switchTo().window((String) windowHandles[0]);
		
		driver.quit();
	}

}
