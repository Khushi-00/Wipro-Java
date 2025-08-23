package com.wipro.MavenProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdgeBrowser {
	
	public static void main(String[] args) {
		
		// Set path to EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C://Users//Khushi//Downloads//edgedriver_win64//msedgedriver.exe");
        // Create EdgeDriver instance
        WebDriver driver = new EdgeDriver();
        // Open a webpage
        driver.get("https://www.google.com");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
