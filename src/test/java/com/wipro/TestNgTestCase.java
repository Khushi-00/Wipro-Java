package com.wipro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTestCase {
	@Test
	public void launchbrowser() {
		ChromeOptions chromeOptions = new ChromeOptions();
 
		WebDriverManager.chromedriver().setup();
 
		WebDriver driver = new ChromeDriver(chromeOptions);
 
		driver.get("https://the-internet.herokuapp.com/windows");
		// maximize the window
		driver.manage().window().maximize();
		
	}
	@Test
	public void radiobutton() throws InterruptedException{
		ChromeOptions chromeoptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		
		WebElement radiobutton =driver.findElement(By.xpath("//input[@value = 'radio3']"));
		
		radiobutton.click();
		
		Thread.sleep(2000);
	}
}
