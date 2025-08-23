package LabSession14Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            // 1. Enter first name
            driver.findElement(By.id("name")).sendKeys("What Name");
            Thread.sleep(1500);

            // 2. Enter email
            driver.findElement(By.id("email")).sendKeys("whatname@execute.com");
            Thread.sleep(1500);

            // 3. Select gender (Female)
            WebElement checkbox =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
    		checkbox.click();	
    		Thread.sleep(2000);

            // 4. Enter mobile number
            driver.findElement(By.id("mobile")).sendKeys("2468108642");
            Thread.sleep(1500);

            // 5. Enter DOB
            WebElement dob = driver.findElement(By.name("dob"));
            dob.clear();
            dob.sendKeys("14032002");
            Thread.sleep(2000);

            // 6. Enter subject
            driver.findElement(By.id("subjects")).sendKeys("Computer Science");
            Thread.sleep(2000);

            // 7. Select hobby (Sports)
            WebElement checkbox1 =driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
    		checkbox1.click();	
    		Thread.sleep(2000);

           // 8. Upload picture
            WebElement uploadPicture = driver.findElement(By.id("picture"));
            uploadPicture.sendKeys("C:\\Users\\Khushi\\OneDrive - Amity University\\Pictures\\Woman reading-pana.png");
            Thread.sleep(2000);

            // 9. Enter address (fixed id)
            WebElement add= driver.findElement(By.xpath("//textarea[@id='picture']"));
    		add.sendKeys("Sirsi road");
    		
    		//select state
    		WebElement drdwn= driver.findElement(By.xpath("//select[@id='state']"));
    		Select sel=new Select(drdwn);	
    		sel.selectByVisibleText("Uttar Pradesh");
    		
            // 10. Select City
    		WebElement drdwn1= driver.findElement(By.xpath("//select[@id='city']"));
    		Select sel1=new Select(drdwn1);	
    		sel1.selectByVisibleText("Agra");
    		 Thread.sleep(2000);

            // 11. Submit form
    		 driver.findElement(By.cssSelector("button[type='submit']")).click();

            Thread.sleep(3000);

        } finally {
            driver.quit();
        }
	}

}
