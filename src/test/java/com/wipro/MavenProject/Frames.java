package com.wipro.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		RemoteWebDriver driver = null;
		try {
			ChromeOptions co = new ChromeOptions();
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(co);
	        driver.get("https://jqueryui.com/droppable/");
	        driver.manage().window().maximize();
	        
	        WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	        driver.switchTo().frame(Frame);
	        Thread.sleep(3000);

	        WebElement drag = driver.findElement(By.id("draggable"));
	           
	        WebElement drop = driver.findElement(By.id("droppable"));
	        
	        Actions act = new Actions(driver);
	        act.dragAndDrop(drag, drop).perform();
	        Thread.sleep(5000);
	        
		} catch (Exception e) {
			System.out.println(e);
			} finally {
				driver.quit();
	        }
	    }
	}
