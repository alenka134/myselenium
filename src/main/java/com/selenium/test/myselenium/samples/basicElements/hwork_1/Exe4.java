package com.selenium.test.myselenium.samples.basicElements.hwork_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yospermtest.com/contact/");

        //the text (use getText() to get the text)
        String pageName = driver.findElement(By.cssSelector(".page-title ")).getText();
        System.out.println("Page Title: " + pageName);

        //the id name (use getAttribute(“id”))
        driver.findElement(By.cssSelector("#input_3_1")).sendKeys("Elena Ovcharenko");
        String fullNameString = driver.findElement(By.cssSelector("#input_3_1")).getAttribute("value");
        System.out.println("Get entered full name: " + fullNameString);

        //is it displayed (use isDisplayed())
        boolean status = driver.findElement(By.cssSelector("#input_3_1")).isDisplayed();
        System.out.println("Is full name entered? ->" + status);

        //is it enabled (use isEnabled())
        WebElement element = driver.findElement(By.cssSelector("#input_3_2"));
        boolean status1 = element.isEnabled();
        // Check that if the Text field is enabled, if yes enter value
        if(status1){
            element.sendKeys("elena@mes-ltd.com");
        }

        //the tag name (use getTagName())
        String tagName = driver.findElement(By.cssSelector(".button.header-button.mobile-button")).getTagName();
        System.out.println("Tag name is: " + tagName);
        Thread.sleep(2000);
        driver.quit();
    }
}



