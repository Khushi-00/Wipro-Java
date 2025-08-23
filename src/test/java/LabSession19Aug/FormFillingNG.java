package LabSession19Aug;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFillingNG {

	WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite - Initializing test suite setup...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite - Test suite execution completed.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest - Preparing test data for form filling.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest - Cleaning test data for form filling.");
    }

    @BeforeClass
    public void setup() {
        System.out.println("BeforeClass - Launching browser and navigating to form page.");
        ChromeOptions chromeOption = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOption);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {
        System.out.println("AfterClass - Closing browser.");
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

    // -------------------- TEST CASES --------------------

    @Test(priority = 1, groups = {"Sanity"})
    public void fillBasicDetails() throws InterruptedException {
        System.out.println("Executing fillBasicDetails...");
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("John");

        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Dobbarman");

        Thread.sleep(2000);
    }

    @Test(priority = 2, groups = {"Regression"})
    public void selectGenderAndExperience() throws InterruptedException {
        System.out.println("Executing selectGenderAndExperience...");
        WebElement gender = driver.findElement(By.xpath("//input[@id='sex-0']"));
        gender.click();

        WebElement experience = driver.findElement(By.xpath("//input[@id='exp-0']"));
        experience.click();

        Thread.sleep(2000);
    }

    @Test(priority = 3, groups = {"Regression"})
    public void enterDateAndProfession() throws InterruptedException {
        System.out.println("Executing enterDateAndProfession...");
        WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("18-08-2025");

        WebElement profession = driver.findElement(By.xpath("//input[@id='profession-1']"));
        profession.click();

        Thread.sleep(2000);
    }

    @Test(priority = 4, groups = {"Sanity"})
    public void selectToolsAndContinents() throws InterruptedException {
        System.out.println("Executing selectToolsAndContinents...");
        WebElement tools = driver.findElement(By.xpath("//input[@id='tool-2']"));
        tools.click();

        WebElement continents = driver.findElement(By.xpath("//select[@id='continents']"));
        continents.click();

        WebElement commands = driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']"));
        commands.click();

        Thread.sleep(2000);
    }

    @Test(priority = 5, dependsOnMethods = {"fillBasicDetails"}, groups = {"Sanity"})
    public void uploadFileAndSubmit() throws InterruptedException {
        System.out.println("Executing uploadFileAndSubmit...");
        WebElement upload = driver.findElement(By.xpath("//input[@id='photo']"));
        upload.sendKeys("C:\\\\Users\\\\Khushi\\\\OneDrive - Amity University\\\\Pictures\\\\Woman reading-pana.png");

        Thread.sleep(2000);

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

        Thread.sleep(3000);

        Assert.assertTrue(true, "Form submission failed!");
    }

    @Test(priority = 6, groups = {"SkipDemo"})
    public void skipTestDemo() {
        System.out.println("Executing skipTestDemo...");
        throw new SkipException("Skipping this test intentionally for demo.");
    }

    @Test(priority = 7)
    public void dummyTest() {
        System.out.println("Executing dummyTest...");
    }
}
