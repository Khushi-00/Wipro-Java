package com.wipro.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeoptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		 Actions act = new Actions(driver);

         WebElement prime = driver.findElement(By.xpath("//span[normalize-space()='Prime']"));
         act.moveToElement(prime).perform();
         Thread.sleep(4000);
         
         WebElement joinnow = driver.findElement(By.xpath("//a[@href ='/prime']"));
         
         act.click(joinnow).perform();
         
         Thread.sleep(2000);
        
    
	}

}
