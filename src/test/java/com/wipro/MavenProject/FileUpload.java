package com.wipro.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		ChromeOptions chromeoptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement fileupload = driver.findElement(By.xpath("//input[@id = 'file-upload']"));
		fileupload.sendKeys("C:\\Users\\Khushi\\OneDrive - Amity University\\Pictures\\Woman reading-pana.png");
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='file-submit']"));
		
		submit.click();
		
		WebElement validationmsg = driver.findElement(By.xpath("//h3[normalize-space()]"));
		
		if (validationmsg.isDisplayed()) {
			System.out.println("This message is displayed properly");
		}else {
			System.out.println("This message is not displayed properly");
		}
	}

}
