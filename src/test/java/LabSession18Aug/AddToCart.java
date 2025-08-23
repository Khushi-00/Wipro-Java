package LabSession18Aug;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        ChromeOptions chromeOption = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOption);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/index.html");
    }

    @Test
    public void addToCartAndPurchase() throws InterruptedException {
        // Select iPhone
        WebElement phone = driver.findElement(By.xpath("//a[normalize-space()='Iphone 6 32gb']"));
        phone.click();
        WebElement iphone = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
        iphone.click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        alt.accept();

        // Back to home
        WebElement home = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
        home.click();

        // Select Laptop
        WebElement laptops = driver.findElement(By.xpath("//a[3]"));
        laptops.click();
        WebElement laptop = driver.findElement(By.xpath("//a[normalize-space()='MacBook air']"));
        laptop.click();

        WebElement macbook = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
        macbook.click();
        Thread.sleep(2000);
        Alert alt1 = driver.switchTo().alert();
        alt1.accept();

        // Go to cart
        WebElement adc = driver.findElement(By.xpath("//a[@id='cartur']"));
        adc.click();

        // Place order
        WebElement order = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
        order.click();

        // Fill customer details
        driver.findElement(By.id("name")).sendKeys("Dosa");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Ongole");
        driver.findElement(By.id("card")).sendKeys("4581 4455 9999");
        driver.findElement(By.id("month")).sendKeys("August");
        driver.findElement(By.id("year")).sendKeys("2025");

        // Purchase
        WebElement purchase = driver.findElement(By.xpath("//button[normalize-space()='Purchase']"));
        purchase.click();

        // Confirm
        WebElement ok = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
        ok.click();

        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
