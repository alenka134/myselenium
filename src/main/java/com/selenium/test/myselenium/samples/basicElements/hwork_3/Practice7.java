package com.selenium.test.myselenium.samples.basicElements.hwork_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/recaptcha/api2/demo ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Finding all iframe tags on a web page - my additional mission
        List<WebElement> elements = driver.findElements(By.tagName("iframe"));
        int numberOfTags = elements.size();
        System.out.println("No. of Iframes on this Web Page are: " + numberOfTags);

        //Display the title of the Main Page - my additional mission
        driver.switchTo().frame(0).getTitle();
        System.out.println("\nFrame 1 Title: \n" + driver.getTitle());
        Thread.sleep(1000);

        WebElement frameElement = driver.findElement(By.cssSelector(".recaptcha-checkbox-border"));
        frameElement.click();
        Thread.sleep(3000);
        // Switch back to main web page
        driver.switchTo().defaultContent();
        driver.quit();

    }
}

//Click the ‘I’m not a robot’ Checkbox
// //div[@class='recaptcha-checkbox.goog-inline-block.recaptcha-checkbox-unchecked.rc-anchor-checkbox.recaptcha-checkbox-expired.recaptcha-checkbox-clearOutline']
