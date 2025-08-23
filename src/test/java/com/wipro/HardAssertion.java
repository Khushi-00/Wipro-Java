package com.wipro;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.function.Function;

public class HardAssertion {

    @Test
    public void testLogin() throws InterruptedException {
        // Setup Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to OrangeHRM
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Validate page title with hard assertion
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "OrangeHRM";
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");

        // Username field (explicit wait)
        WebElement username = driver.findElement(By.name("username"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys("Admin");

        // Password field (fluent wait)
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);

        fluentWait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                return password.isDisplayed();
            }
        });

        password.sendKeys("admin123");

        // Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
