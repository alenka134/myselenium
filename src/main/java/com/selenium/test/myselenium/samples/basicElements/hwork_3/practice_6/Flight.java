package com.selenium.test.myselenium.samples.basicElements.hwork_3.practice_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Flight {
    private WebDriver driver;

    public Flight(WebDriver driver) throws InterruptedException {
        this.driver = driver;

        //  driver.findElement(By.xpath(".//*[@id='from-input']")).sendKeys("TLV");
        //  driver.findElement(By.xpath(".//*[@id='to-input']")).sendKeys("VIE");
    }


    public void flightFrom(String from) throws InterruptedException {
        //find the flight from
        driver.findElement(By.cssSelector("#from")).click();

        for (String fromAirport : driver.getWindowHandles()) {
            driver.switchTo().window(fromAirport);

        }
        driver.findElement(By.cssSelector("#from-input")).sendKeys(from);//found way for ENTER

        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#from-input")).click();
        driver.switchTo().defaultContent();
    }

    public void flightTo(String to) throws InterruptedException {
        //find the flight to
        driver.findElement(By.xpath(".//*[@id='to-input']")).click();

      //  for (String toAirport : driver.getWindowHandles()) {
     //       driver.switchTo().window(toAirport);

     //   }
        driver.findElement(By.xpath(".//*[@id='to-input']")).sendKeys(to);
        Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='to-input']"));
        driver.switchTo().defaultContent();
    }
}

//flightFrom.clear();
//		flightFrom.sendKeys(flightTo);
//		Thread.sleep(1000);
//		//System.out.println(driver.getPageSource());
//		driver.findElement(By.cssSelector(".category-text")).click();