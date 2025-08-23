package LabSession14Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = null;
        try {
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);

            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
            Thread.sleep(2000);

            Actions actions = new Actions(driver);
            WebElement hoverMenu = driver.findElement(By.id("mousehover"));

            actions.moveToElement(hoverMenu).perform();
            Thread.sleep(5000);

            WebElement topOption = driver.findElement(By.linkText("Top"));
            actions.moveToElement(topOption).click().perform();
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Error during mouse hover: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
	}

}
