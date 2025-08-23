package LabSession13Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLogin {
	public static void main(String[] args)throws InterruptedException {
		ChromeOptions chromeoptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://www.saucedemo.com/");
		
		// name locator 
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement loginbutton = driver.findElement(By.name("login-button"));
		loginbutton.click();
		
		Thread.sleep(2000);
	}

}
