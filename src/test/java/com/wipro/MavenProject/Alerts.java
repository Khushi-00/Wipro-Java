package com.wipro.MavenProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		WebElement simplealert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		
		simplealert.click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		Thread.sleep(20000);
		
		//Prompt alert
		
		WebElement promptalert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		
		promptalert.click();
		
		Thread.sleep(2000);
		
		Alert alt2 = driver.switchTo().alert();
		
		alt2.sendKeys("ALERT");
		
		Thread.sleep(2000);
		
		alt2.accept();
		
		Thread.sleep(20000);
	}

}
