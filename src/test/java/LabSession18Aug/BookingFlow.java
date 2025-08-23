package LabSession18Aug;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BookingFlow {

    WebDriver driver;
    WebDriverWait wait;

    public static void clickEvent(WebDriver driver, String xpath, String text) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
        if (text != null && !text.isEmpty()) {
            element.clear();
            element.sendKeys(text);
        }
    }

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    public void bookingTest() throws InterruptedException {
        // Hotels tab
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='tab']/li[2]/button"))).click();

        // Select city
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='select2-hotels_city-container']"))).click();
        WebElement city = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@role='searchbox']")));
        city.sendKeys("Singapore");
        city.sendKeys(Keys.ENTER);

        // Dates
        WebElement checkin = driver.findElement(By.id("checkin"));
        checkin.clear();
        checkin.sendKeys("25-08-2025");

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.clear();
        checkout.sendKeys("26-08-2025");

     // Travellers - open popup
        WebElement travellersBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='travellersInput']")));
        travellersBtn.click();

        // Rooms
        WebElement rooms = driver.findElement(By.id("hotels_rooms"));
        rooms.clear();
        rooms.sendKeys("2");

        // Adults
        WebElement adults = driver.findElement(By.id("hotels_adults"));
        adults.clear();
        adults.sendKeys("2");

        // Search hotels
        driver.findElement(By.xpath("//form[@id='hotels-search']//button[@type='submit']")).click();

        // Select first hotel
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(text(),'Details')])[1]"))).click();

        // Book now
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(text(),'Book Now')]"))).click();

        // Fill personal info
        driver.findElement(By.id("p-first-name")).sendKeys("Ankit");
        driver.findElement(By.id("p-last-name")).sendKeys("Chahar");
        driver.findElement(By.id("p-email")).sendKeys("ankit@abc.com");
        driver.findElement(By.id("p-phone")).sendKeys("123456789");
        driver.findElement(By.id("p-address")).sendKeys("Gurgaon, Haryana, India");

        // Traveller info
        driver.findElement(By.name("firstname_1")).sendKeys("Ankit");
        driver.findElement(By.name("lastname_1")).sendKeys("Chahar");
        driver.findElement(By.name("firstname_2")).sendKeys("Dosa");
        driver.findElement(By.name("lastname_2")).sendKeys("Idli");

        // Payment option
        driver.findElement(By.id("gateway_bank_transfer")).click();

        // Agreement
        driver.findElement(By.id("agreechb")).click();

        // Confirm booking
        driver.findElement(By.xpath("//div[@class='btn-box mt-3']")).click();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
