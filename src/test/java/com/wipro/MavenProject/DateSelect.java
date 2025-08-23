package com.wipro.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DateSelect {
    public static void main(String[] args) {
        ChromeOptions chromeoptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeoptions);

        driver.get("https://ui.shadcn.com/docs/components/date-picker");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dateButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(.,'Pick a date') or contains(.,'Select date')]")));
        dateButton.click();

        WebElement monthYearHeader = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(@class,'rdp-caption_label')]")));
        monthYearHeader.click(); // Switch to month selection

        monthYearHeader = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(@class,'rdp-caption_label')]")));
        monthYearHeader.click();

        WebElement year2025 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='2025']")));
        year2025.click();

        WebElement august = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Aug']")));
        august.click();

        WebElement day21 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//table//button[text()='21']")));
        day21.click();

        driver.quit();
    }
}
