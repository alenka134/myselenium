package com.selenium.test.myselenium.samples.basicElements.hwork_3.practice_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        driver.findElement(By.cssSelector("#from-input")).sendKeys(from);
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#from-input")).click();
        driver.switchTo().defaultContent();
    }

    public void flightTo(String to) throws InterruptedException {
        //find the flight to
        driver.findElement(By.cssSelector("#to")).click();

        for (String toAirport : driver.getWindowHandles()) {
            driver.switchTo().window(toAirport);

        }
        driver.findElement(By.cssSelector("#to-input")).sendKeys(to);
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#to-input"));
        driver.switchTo().defaultContent();
    }
}
