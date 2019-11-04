package com.selenium.test.myselenium.samples.basicElements.hwork_3.practice_6;

import com.selenium.test.myselenium.samples.basicElements.solutions.seleniumCourseHWSolutionsAll.bin.operations.AirTickets;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flightconnections.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // call the searchFlight from the class
        Flight flight = new Flight(driver);
        flight.flightFrom("TLV");
        flight.flightTo("VIE");

        driver.quit();
    }
}
