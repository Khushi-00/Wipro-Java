package com.wipro.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;   // ✅ Use Selenium's Actions class
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsExample {
    public static WebDriver driver;

    public static void main(String[] args) {
        try {
            ChromeOptions co = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(co);

            driver.manage().window().maximize();
            driver.get("https://www.amazon.in/");
            Thread.sleep(3000);

            // ✅ Correct Selenium Actions class
            Actions act = new Actions(driver);

            WebElement sell = driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
            act.doubleClick(sell).perform();
            Thread.sleep(5000);

            driver.navigate().back();
            Thread.sleep(5000);

            WebElement mobiles = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
            act.contextClick(mobiles).perform();
            Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
