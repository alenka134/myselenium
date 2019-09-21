package com.selenium.test.myselenium.samples.basicElements.hwork_3.practice_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flight {
    WebDriver driver;

 public Flight(String flightFrom, String flightTo) throws InterruptedException{
        this.driver = driver;
        String fFrom = flightFrom ;
        String fTo = flightTo;

      //  driver.findElement(By.xpath("//*[@id='from-input']")).sendKeys("TLV");
      //  driver.findElement(By.xpath("//*[@id='to-input']")).sendKeys("VIE");
    }


    public void callFlightResults() {


    }
}