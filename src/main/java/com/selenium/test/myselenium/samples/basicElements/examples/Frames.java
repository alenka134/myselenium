package com.selenium.test.myselenium.samples.basicElements.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Frames {
    static WebDriver driver;
    static String baseUrl;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/?locale=eu");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement weUserName = driver.findElement(By.cssSelector("#username"));
        weUserName.sendKeys("testing 1st window");

        driver.switchTo().frame(0);

       // WebElement weButton = driver.findElement(By.xpath(".//html/body/div[8]/div/div[6]/div[1]/div/div[3]/div/div/div/a/span"));
       WebElement weButton = driver.findElement(By.xpath("./html/body/div[8]/div/div[6]/div[1]/div/div[3]/div/div/div/a/span")); //sometimes works this option
        weButton.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
