package com.wipro.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrop {

    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            ChromeOptions chromeoptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeoptions);

            // ✅ Correct URL for drag and drop
            driver.get("https://the-internet.herokuapp.com/drag_and_drop");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            // ✅ Locate elements
            WebElement from = driver.findElement(By.id("column-a"));
            WebElement to = driver.findElement(By.id("column-b"));

            // ✅ Perform drag and drop using Selenium Actions
            Actions act = new Actions(driver);
            act.dragAndDrop(from, to).perform();

            Thread.sleep(4000);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
