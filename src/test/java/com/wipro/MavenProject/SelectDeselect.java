package com.wipro.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDeselect {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://grotechminds.com/multiple-select/");

        driver.manage().window().maximize();

        WebElement multiSelect = driver.findElement(By.xpath("//select[@name='cars']"));
        Select sel = new Select(multiSelect);

        // select multiple options
        sel.selectByVisibleText("Volvo");
        Thread.sleep(2000);
        
        sel.selectByValue("audi");
        Thread.sleep(2000);
        
        sel.selectByIndex(2); 
        Thread.sleep(2000);

     // deselect options
        sel.deselectByVisibleText("Volvo");
        Thread.sleep(1000);
        sel.deselectByValue("audi");
        Thread.sleep(1000);
        sel.deselectByIndex(2);
        Thread.sleep(1000);

        // Deselect all (optional)
        sel.deselectAll();

        driver.quit();
    }
}
