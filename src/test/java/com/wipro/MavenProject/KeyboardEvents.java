package com.wipro.MavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static void main(String[] args) {
		ChromiumDriver driver = null;
		try {
            ChromeOptions co = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(co);
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            
            Actions act = new Actions(driver);
            Thread.sleep(3000);

            WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
            act.moveToElement(email).click().keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).perform();
            Thread.sleep(2000);
            
            WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
            act.moveToElement(password).click().keyDown(Keys.SHIFT).sendKeys("hi").keyUp(Keys.SHIFT).perform();
            Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            driver.quit();
        }
    }
}
