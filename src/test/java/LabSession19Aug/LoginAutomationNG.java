package LabSession19Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomationNG {
	
	WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite - Setting up global configurations (e.g., DB connection, reports init)");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite - Closing global configurations (DB disconnect, reports flush)");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest - Preparing test data for Login module");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest - Cleaning test data for Login module");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("BeforeClass - Launching browser and navigating to login page");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("AfterClass - Closing browser");
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod - Starting a new test case...");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod - Finished executing the test case.");
    }

    // ---------------- TEST CASES ----------------

    @Test(priority = 1, groups = {"Sanity", "Regression"})
    public void testValidLogin() throws InterruptedException {
        System.out.println("Executing testValidLogin...");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        Thread.sleep(2000);
        WebElement successMsg = driver.findElement(By.xpath("//h1[normalize-space()='Logged In Successfully']"));
        Assert.assertTrue(successMsg.isDisplayed(), "Valid login failed!");

        // Logout for next test
        driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
    }

    @Test(priority = 2, groups = {"Regression"})
    public void testInvalidLogin() throws InterruptedException {
        System.out.println("Executing testInvalidLogin...");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("wrongUser");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("wrongPass");
        driver.findElement(By.id("submit")).click();

        Thread.sleep(2000);
        WebElement errorMsg = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMsg.isDisplayed(), "Error message not shown!");
        Assert.assertEquals(errorMsg.getText(), "Your username is invalid!");
    }

    @Test(priority = 3, dependsOnMethods = {"testValidLogin"}, groups = {"Sanity"})
    public void testDependentScenario() {
        System.out.println("Executing testDependentScenario - runs only if Valid Login passes");
    }

    @Test(priority = 4, groups = {"SkipDemo"})
    public void testSkipDemo() {
        System.out.println("Executing testSkipDemo...");
        throw new SkipException("Skipping this test for demo purposes");
    }

    @Test(priority = 5)
    public void dummyTestcase() {
        System.out.println("Executing dummyTestcase...");
    }

}
