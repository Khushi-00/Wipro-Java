package com.wipro.MavenProject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeoptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://the-internet.herokuapp.com/download");
		driver.manage().window().maximize();
		
		WebElement filedownload = driver.findElement(By.xpath("//a[@href = 'download/sample.pdf']"));
		filedownload.click();
		
		File f = new File ("C:\\Users\\Khushi\\Downloads\\test-file.txt");
		
		if (f.exists()) {
			
			System.out.println("This file is present");
			
		}else {
			
			System.out.println("This file is not present");
		}
		Thread.sleep(2000);

	}

}
