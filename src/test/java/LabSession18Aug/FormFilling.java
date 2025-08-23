package LabSession18Aug;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFilling {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions chromeOption = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOption);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void fillForm() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("John");

        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Dobbarman");
        
        Thread.sleep(3000);

        WebElement gender = driver.findElement(By.xpath("//input[@id='sex-0']"));
        gender.click();
        
        Thread.sleep(3000);

        WebElement experience = driver.findElement(By.xpath("//input[@id='exp-0']"));
        experience.click();
        
        Thread.sleep(3000);

        WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("18-08-2025");
        
        Thread.sleep(3000);

        WebElement profession = driver.findElement(By.xpath("//input[@id='profession-1']"));
        profession.click();
        
        Thread.sleep(3000);

        WebElement tools = driver.findElement(By.xpath("//input[@id='tool-2']"));
        tools.click();
        
        Thread.sleep(3000);

        WebElement continents = driver.findElement(By.xpath("//select[@id='continents']"));
        continents.click();
        
        Thread.sleep(3000);

        WebElement commands = driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']"));
        commands.click();

        Thread.sleep(2000);

        WebElement upload = driver.findElement(By.xpath("//input[@id='photo']"));
        upload.sendKeys("C:\\\\Users\\\\Khushi\\\\OneDrive - Amity University\\\\Pictures\\\\Woman reading-pana.png");

        Thread.sleep(2000);

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

        Thread.sleep(6000);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
