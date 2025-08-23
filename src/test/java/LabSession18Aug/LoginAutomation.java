package LabSession18Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation {
	
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(priority = 1)
    public void testValidLogin() throws InterruptedException {
        // Enter valid credentials
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        // Verify login success
        Thread.sleep(2000);
        WebElement successMsg = driver.findElement(By.xpath("//h1[normalize-space()='Logged In Successfully']"));
        Assert.assertTrue(successMsg.isDisplayed(), "Valid login failed!");

        // Logout for next test
        driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
    }

    @Test(priority = 2)
    public void testInvalidLogin() throws InterruptedException {
        // Enter invalid credentials
        driver.findElement(By.id("username")).sendKeys("wrongUser");
        driver.findElement(By.id("password")).sendKeys("wrongPass");
        driver.findElement(By.id("submit")).click();

        // Verify error message
        Thread.sleep(4000);
        WebElement errorMsg = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMsg.isDisplayed(), "Error message not shown!");
        Assert.assertEquals(errorMsg.getText(), "Your username is invalid!");
        
        Thread.sleep(4000);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
