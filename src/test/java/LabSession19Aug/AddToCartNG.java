package LabSession19Aug;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AddToCartNG {
	
	WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Opening DB connections");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Closing DB connections");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Preparing product catalog for test run");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Cleaning product catalog after test run");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("Launching browser and navigating to application");
        ChromeOptions chromeOption = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOption);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/index.html");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Closing browser and quitting driver");
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting a new test case...");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Finished executing the test case.");
    }

    // ----------------- TEST CASES -----------------

    @Test(priority = 1, groups = {"Regression"})
    public void addPhoneToCart() throws InterruptedException {
        WebElement phone = driver.findElement(By.xpath("//a[normalize-space()='Iphone 6 32gb']"));
        phone.click();
        WebElement iphone = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
        iphone.click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        alt.accept();

        WebElement home = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
        home.click();
        System.out.println("iPhone added successfully.");
    }

    @Test(priority = 2, dependsOnMethods = {"addPhoneToCart"}, groups = {"Sanity", "Regression"})
    public void addLaptopToCart() throws InterruptedException {
        WebElement laptops = driver.findElement(By.xpath("//a[3]"));
        laptops.click();
        WebElement laptop = driver.findElement(By.xpath("//a[normalize-space()='MacBook air']"));
        laptop.click();

        WebElement macbook = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
        macbook.click();
        Thread.sleep(2000);
        Alert alt1 = driver.switchTo().alert();
        alt1.accept();

        System.out.println("Laptop added successfully.");
    }

    @Test(priority = 3, dependsOnMethods = {"addLaptopToCart"}, groups = {"Regression"})
    public void placeOrderAndPurchase() throws InterruptedException {
        WebElement adc = driver.findElement(By.xpath("//a[@id='cartur']"));
        adc.click();

        WebElement order = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
        order.click();

        driver.findElement(By.id("name")).sendKeys("Dosa");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Ongole");
        driver.findElement(By.id("card")).sendKeys("4581 4455 9999");
        driver.findElement(By.id("month")).sendKeys("August");
        driver.findElement(By.id("year")).sendKeys("2025");

        WebElement purchase = driver.findElement(By.xpath("//button[normalize-space()='Purchase']"));
        purchase.click();

        WebElement ok = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
        ok.click();

        System.out.println("Order placed and purchase confirmed.");
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void dummyTestcase1() {
        System.out.println("Dummy Testcase 1 executed");
    }

    @Test(priority = 5)
    public void dummyTestcase2() {
        System.out.println("Dummy Testcase 2 executed");
    }


}
