package com.selenium.test.myselenium.samples.basicElements.hwork_3.practice_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flightconnections.com/");
      //  driver.switchTo().frame("From which airport would you like to fly?");
        driver.findElement(By.xpath("//*[@id='map-container']")).sendKeys("TLV");
        Thread.sleep(2000);
       // driver.switchTo().defaultContent();
      //  driver.switchTo().frame("To which airport would you like to fly?");
      //  driver.findElement(By.cssSelector("#to-input")).sendKeys("VIE");
      //  driver.switchTo().defaultContent();


    }
}
